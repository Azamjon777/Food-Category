package artur.unit.foodcategory.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import artur.unit.foodcategory.databinding.ItemMovieBinding
import artur.unit.foodcategory.presentation.model.FoodModel

class MovieAdapter(private val listener: (FoodModel) -> Unit) :
    ListAdapter<FoodModel, MovieAdapter.MovieViewHolder>(MovieDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movieItem = getItem(position)
        holder.bind(movieItem)
    }

    inner class MovieViewHolder(private val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(movieItem: FoodModel) {
            binding.imgView.setImageResource(movieItem.img)
            binding.titleTextView.text = movieItem.title
            binding.descTextView.text = movieItem.desc

            binding.root.setOnClickListener {
                listener(movieItem)
            }
        }
    }
}