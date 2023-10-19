package artur.unit.foodcategory.presentation

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import artur.unit.foodcategory.R
import artur.unit.foodcategory.databinding.ActivityMovieBinding
import artur.unit.foodcategory.presentation.adapter.IngredientAdapter
import artur.unit.foodcategory.presentation.model.FoodModel

class MovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodModel = intent.getSerializableExtra("foodModel") as? FoodModel

        if (foodModel != null) {
            binding.tvTitle.text = foodModel.title
            binding.tvDesc.text = foodModel.desc
            binding.itemImg.setImageResource(foodModel.img)

            val ingredientRecyclerView = binding.recyclerView
            ingredientRecyclerView.layoutManager = LinearLayoutManager(this)
            val ingredientsAdapter = IngredientAdapter(foodModel.ingredients)
            ingredientRecyclerView.adapter = ingredientsAdapter

            binding.itemImg.setOnClickListener {
                openWebsite(foodModel.websiteUrl)
            }
        }
    }

    private fun openWebsite(url: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(this, getString(R.string.failed), Toast.LENGTH_SHORT).show()
        }
    }
}