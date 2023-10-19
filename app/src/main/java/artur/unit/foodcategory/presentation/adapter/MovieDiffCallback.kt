package artur.unit.foodcategory.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import artur.unit.foodcategory.presentation.model.FoodModel

class MovieDiffCallback : DiffUtil.ItemCallback<FoodModel>() {
    override fun areItemsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
        return oldItem == newItem
    }
}