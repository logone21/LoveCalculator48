package com.example.mylovecalculator.di

import android.content.Context
import com.example.mylovecalculator.prefs.Prefs
import com.example.mylovecalculator.remote.LoveApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun provideApi(): LoveApi {
        return Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create()).
            build().create(LoveApi::class.java)
    }
    @Provides
    @Singleton
    fun providePreferences(@ApplicationContext context: Context) : Prefs {
        return Prefs(context)
    }
}