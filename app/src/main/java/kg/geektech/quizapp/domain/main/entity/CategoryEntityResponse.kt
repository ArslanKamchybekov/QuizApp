package kg.geektech.quizapp.domain.main.entity

import com.google.gson.annotations.SerializedName

data class CategoryEntityResponse(

    @SerializedName("trivia_categories")
    val triviaCategories: List<CategoryEntity>,
    val msg: String
)

data class CategoryEntity(
    val id: Int,
    val name: String
)


