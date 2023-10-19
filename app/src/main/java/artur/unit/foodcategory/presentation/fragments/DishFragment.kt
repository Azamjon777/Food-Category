package artur.unit.foodcategory.presentation.fragments

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import artur.unit.foodcategory.databinding.FragmentDishBinding
import artur.unit.foodcategory.presentation.MoreInfoActivity
import artur.unit.foodcategory.presentation.adapter.FoodListAdapter
import artur.unit.foodcategory.presentation.model.FoodModel
import artur.unit.foodcategory.viewmodel.DataViewModel
import artur.unit.foodcategory.viewmodel.DataViewModelFactory

class DishFragment : Fragment() {
    private lateinit var binding: FragmentDishBinding
    private lateinit var viewModel: DataViewModel
    private lateinit var adapter: FoodListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDishBinding.inflate(inflater, container, false)
        val viewModelFactory = DataViewModelFactory(requireContext())
        viewModel = ViewModelProvider(this, viewModelFactory)[DataViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = FoodListAdapter { foodItem ->
            val intent = Intent(requireContext(), MoreInfoActivity::class.java)
            intent.putExtra("foodModel", foodItem)
            startActivity(intent)
        }
        binding.recyclerView.adapter = adapter
        val combinedList = mutableListOf<FoodModel>()
        for (foodPojo in viewModel.foodList) {
            combinedList.addAll(foodPojo.list)
        }
        adapter.submitList(combinedList)

        val searchEditText = binding.searchEditText

        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val searchText = s.toString().trim()

                val filteredList = combinedList.filter { foodItem ->
                    foodItem.title.contains(searchText, ignoreCase = true)
                }
                adapter.submitList(filteredList)
            }
        })
    }
}
