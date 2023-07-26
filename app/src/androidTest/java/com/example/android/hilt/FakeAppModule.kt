package com.example.android.hilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import retrofit.GsonConverterFactory
import retrofit.Retrofit
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [AppModules::class]
)
class FakeAppModule {

   @Provides
   fun getTimeService(
       @ApplicationContext context: Context,
       retrofit: Retrofit
   ): TimeService = FakeTimeService(context, retrofit)

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://timeapi.io/api/Time/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
