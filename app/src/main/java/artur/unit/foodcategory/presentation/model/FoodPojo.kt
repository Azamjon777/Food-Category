package artur.unit.foodcategory.presentation.model

import java.io.Serializable

data class FoodPojo(
    val name: String,
    val list: List<FoodModel>
) : Serializable
