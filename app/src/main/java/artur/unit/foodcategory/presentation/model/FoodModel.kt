package artur.unit.foodcategory.presentation.model

import java.io.Serializable

data class FoodModel(
    val title: String,
    val desc: String,
    val calories: Int,
    val protein: Int,
    val carbs: Int,
    val fat: Int,
    val ingredients: List<String>,
    val cookingTime: String,
    val img: Int,
    val websiteUrl: String
) : Serializable
