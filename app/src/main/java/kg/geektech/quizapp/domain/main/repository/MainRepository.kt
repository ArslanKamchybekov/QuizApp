package kg.geektech.quizapp.domain.main.repository

import kg.geektech.quizapp.domain.main.entity.CategoryEntity
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    suspend fun getCategoryList() : Flow<List<CategoryEntity>>

}