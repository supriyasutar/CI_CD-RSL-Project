package com.example.android.hilt

import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class DateViewModelTest {

    @get:Rule(order = 0)
    var hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var timeService: TimeService

    @Test
    fun verifyGetTime(){
        hiltRule.inject()

        val viewModel = DateViewModel(timeService)
        assertNotNull(viewModel.getDataModel())
    }
}
