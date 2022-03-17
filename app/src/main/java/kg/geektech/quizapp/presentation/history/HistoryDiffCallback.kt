package kg.geektech.quizapp.presentation.history

import androidx.recyclerview.widget.DiffUtil
import kg.geektech.quizapp.domain.main.entity.HistoryEntity

class HistoryDiffCallback : DiffUtil.ItemCallback<HistoryEntity>() {

    override fun areItemsTheSame(oldItem: HistoryEntity, newItem: HistoryEntity) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: HistoryEntity, newItem: HistoryEntity) = oldItem == newItem
}