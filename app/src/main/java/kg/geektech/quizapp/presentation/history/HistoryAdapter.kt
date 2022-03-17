package kg.geektech.quizapp.presentation.history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kg.geektech.quizapp.databinding.ItemHistoryBinding
import kg.geektech.quizapp.domain.main.entity.HistoryEntity

class HistoryAdapter :
    ListAdapter<HistoryEntity, HistoryAdapter.ViewHolder>(HistoryDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val history = getItem(position)
        holder.onBind(history)
    }

    class ViewHolder(private val binding: ItemHistoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(history: HistoryEntity) {
            binding.tvCategory.text = "Category: " + history.category
            binding.tvCorrectAnswers.text = "Correct answers: " + history.correctAnswers
            binding.tvDifficulty.text = "Difficulty: " + history.difficulty
            binding.tvDate.text = history.date
        }

    }
}