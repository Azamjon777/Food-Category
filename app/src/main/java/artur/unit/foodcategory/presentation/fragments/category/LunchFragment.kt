package artur.unit.foodcategory.presentation.fragments.category

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import artur.unit.foodcategory.databinding.FragmentLunchBinding
import artur.unit.foodcategory.presentation.MoreInfoActivity
import artur.unit.foodcategory.presentation.adapter.FoodListAdapter
import artur.unit.foodcategory.viewmodel.DataViewModel
import artur.unit.foodcategory.viewmodel.DataViewModelFactory

class LunchFragment : Fragment() {
    private lateinit var binding: FragmentLunchBinding
    private lateinit var viewModel: DataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLunchBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(
            this, DataViewModelFactory(requireContext())
        )[DataViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = FoodListAdapter { foodItem ->
            val intent = Intent(requireContext(), MoreInfoActivity::class.java)
            intent.putExtra("foodModel", foodItem)
            startActivity(intent)
        }

        binding.recyclerView.adapter = adapter
        adapter.submitList(viewModel.foodList[2].list)
    }
}
