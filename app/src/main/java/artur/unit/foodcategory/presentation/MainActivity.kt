package artur.unit.foodcategory.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import artur.unit.foodcategory.R
import artur.unit.foodcategory.databinding.ActivityMainBinding
import artur.unit.foodcategory.presentation.fragments.DishFragment
import artur.unit.foodcategory.presentation.fragments.HomeFragment
import artur.unit.foodcategory.presentation.fragments.MovieFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            val initialFragment = HomeFragment()
            replaceFragment(initialFragment)
        }
        binding.bottomNavView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.homeFragment -> {
                    val homeFragment =
                        supportFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)
                    if (homeFragment == null) {
                        replaceFragment(HomeFragment())
                    }
                    true
                }

                R.id.dishFragment -> {
                    val dishFragment =
                        supportFragmentManager.findFragmentByTag(DishFragment::class.java.simpleName)
                    if (dishFragment == null) {
                        replaceFragment(DishFragment())
                    }
                    true
                }

                R.id.movieFragment -> {
                    val movieFragment =
                        supportFragmentManager.findFragmentByTag(MovieFragment::class.java.simpleName)
                    if (movieFragment == null) {
                        replaceFragment(MovieFragment())
                    }
                    true
                }

                else -> false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentMainContainer.id, fragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .commit()
    }


}
