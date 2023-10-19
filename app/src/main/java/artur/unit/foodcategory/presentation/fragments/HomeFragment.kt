package artur.unit.foodcategory.presentation.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.ViewModelProvider
import artur.unit.foodcategory.R
import artur.unit.foodcategory.databinding.FragmentHomeBinding
import artur.unit.foodcategory.presentation.MoreInfoActivity
import artur.unit.foodcategory.presentation.fragments.category.BreakfastFragment
import artur.unit.foodcategory.presentation.fragments.category.DinnerFragment
import artur.unit.foodcategory.presentation.fragments.category.LunchFragment
import artur.unit.foodcategory.presentation.fragments.category.SmoothiesFragment
import artur.unit.foodcategory.presentation.fragments.category.SnacksFragment
import artur.unit.foodcategory.presentation.model.FoodModel
import artur.unit.foodcategory.viewmodel.DataViewModel
import artur.unit.foodcategory.viewmodel.DataViewModelFactory
import java.util.Random

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: DataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val viewModelFactory = DataViewModelFactory(requireContext())
        viewModel = ViewModelProvider(this, viewModelFactory)[DataViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout
        val pagerAdapter = MyPagerAdapter(childFragmentManager)
        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)

        randomItem()
    }

    private fun randomItem() {
        val combinedList = mutableListOf<FoodModel>()
        for (foodPojo in viewModel.foodList) {
            combinedList.addAll(foodPojo.list)
        }
        val randomIndex = Random().nextInt(combinedList.size)
        val randomItemFood = combinedList[randomIndex]

        binding.tvTitle.text = randomItemFood.title
        binding.tcTime.text = randomItemFood.cookingTime
        binding.itemImg.setImageResource(randomItemFood.img)

        binding.btnRead.setOnClickListener {
            val intent = Intent(requireContext(), MoreInfoActivity::class.java)
            intent.putExtra("foodModel", randomItemFood)
            startActivity(intent)
        }
    }

    private inner class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getCount(): Int {
            return 5
        }

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> BreakfastFragment()
                1 -> SnacksFragment()
                2 -> DinnerFragment()
                3 -> LunchFragment()
                4 -> SmoothiesFragment()
                else -> throw IllegalArgumentException("Invalid position: $position")
            }
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return when (position) {
                0 -> getString(R.string.breakfast)
                1 -> getString(R.string.snacks)
                2 -> getString(R.string.dinner)
                3 -> getString(R.string.lunch)
                4 -> getString(R.string.smoothies)
                else -> null
            }
        }
    }
}