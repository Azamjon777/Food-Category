package artur.unit.foodcategory.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import artur.unit.foodcategory.databinding.ActivityMoreInfoBinding
import artur.unit.foodcategory.presentation.adapter.IngredientAdapter
import artur.unit.foodcategory.presentation.model.FoodModel

class MoreInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMoreInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoreInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodModel = intent.getSerializableExtra("foodModel") as? FoodModel

        if (foodModel != null) {
            binding.tvTitle.text = foodModel.title
            binding.tvDesc.text = foodModel.desc
            binding.tvCalories.text = foodModel.calories.toString()
            binding.tvProtein.text = foodModel.protein.toString()
            binding.tvCarbs.text = foodModel.carbs.toString()
            binding.tvFat.text = foodModel.fat.toString()
            binding.itemImg.setImageResource(foodModel.img)

            val ingredientRecyclerView = binding.ingredientRecyclerView
            ingredientRecyclerView.layoutManager = LinearLayoutManager(this)
            val ingredientsAdapter = IngredientAdapter(foodModel.ingredients)
            ingredientRecyclerView.adapter = ingredientsAdapter
        }

        binding.back.setOnClickListener {
            finish()
        }
    }
}
