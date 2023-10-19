package artur.unit.foodcategory.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import artur.unit.foodcategory.databinding.ItemFoodBinding
import artur.unit.foodcategory.presentation.model.FoodModel

class FoodListAdapter(private val onItemClick: (FoodModel) -> Unit) :
    ListAdapter<FoodModel, FoodListAdapter.FoodViewHolder>(FoodDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemFoodBinding.inflate(inflater, parent, false)
        return FoodViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val foodItem = getItem(position)
        holder.bind(foodItem)
    }

    inner class FoodViewHolder(private val binding: ItemFoodBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val foodItem = getItem(position)
                    onItemClick(foodItem)
                }
            }
        }

        fun bind(foodItem: FoodModel) {
            binding.apply {
                titleTextView.text = foodItem.title
                descTextView.text = foodItem.desc
                imgView.setImageResource(foodItem.img)
                minute.text = foodItem.cookingTime
            }
        }
    }

    private class FoodDiffCallback : DiffUtil.ItemCallback<FoodModel>() {
        override fun areItemsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
            return oldItem == newItem
        }
    }
}
