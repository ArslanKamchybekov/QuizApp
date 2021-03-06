package kg.geektech.quizapp.data.common

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kg.geektech.quizapp.BuildConfig
import kg.geektech.quizapp.BuildConfig.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder().apply {
            addConverterFactory(GsonConverterFactory.create())
            client(okHttpClient)
            baseUrl(BASE_URL)
        }.build()
    }

    @Provides
    @Singleton
    fun provideOkHttp(): OkHttpClient {
        return OkHttpClient.Builder().apply {
            connectTimeout(30, TimeUnit.SECONDS)
            writeTimeout(30, TimeUnit.SECONDS)
            readTimeout(30, TimeUnit.SECONDS)
        }.build()
    }
}