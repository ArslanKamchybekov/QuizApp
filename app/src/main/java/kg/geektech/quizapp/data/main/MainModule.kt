package kg.geektech.quizapp.data.main

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kg.geektech.quizapp.data.main.remote.MainApi
import kg.geektech.quizapp.domain.main.repository.MainRepository
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MainModule {

    @Provides
    @Singleton
    fun provideMainApi(retrofit: Retrofit): MainApi{
        return retrofit.create(MainApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMainRepository(mainApi: MainApi): MainRepository{
        return MainRepositoryImpl(mainApi)
    }

}