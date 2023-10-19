package artur.unit.foodcategory.presentation.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import artur.unit.foodcategory.databinding.FragmentMovieBinding
import artur.unit.foodcategory.presentation.MoreInfoActivity
import artur.unit.foodcategory.presentation.MovieActivity
import artur.unit.foodcategory.presentation.adapter.FoodListAdapter
import artur.unit.foodcategory.presentation.adapter.MovieAdapter
import artur.unit.foodcategory.presentation.model.FoodModel
import artur.unit.foodcategory.viewmodel.DataViewModel
import artur.unit.foodcategory.viewmodel.DataViewModelFactory

class MovieFragment : Fragment() {
    private lateinit var binding: FragmentMovieBinding
    private lateinit var viewModel: DataViewModel
    private lateinit var adapter: MovieAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(
            this, DataViewModelFactory(requireContext())
        )[DataViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = MovieAdapter { foodItem ->
            val intent = Intent(requireContext(), MovieActivity::class.java)
            intent.putExtra("foodModel", foodItem)
            startActivity(intent)
        }

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter
        val combinedList = mutableListOf<FoodModel>()
        for (foodPojo in viewModel.foodList) {
            combinedList.addAll(foodPojo.list)
        }
        adapter.submitList(combinedList)
    }
}