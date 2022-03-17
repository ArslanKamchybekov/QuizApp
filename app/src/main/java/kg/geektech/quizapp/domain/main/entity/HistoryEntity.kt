package kg.geektech.quizapp.domain.main.entity

data class HistoryEntity(
    val id: Int,
    val category: String,
    val difficulty: String,
    val correctAnswers: String,
    val date: String
)