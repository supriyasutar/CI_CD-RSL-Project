package com.example.android.hilt

import android.os.SystemClock
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class ActivityTest {

    @get:Rule(order = 0)
    var hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun verifyActivityUi(){
        hiltRule.inject()
        // Waiting for 2 seconds to fetch date from api and render it on screen
        SystemClock.sleep(2000)
        onView(withId(R.id.date))
            .check(matches(isDisplayed()))
            .check(matches(withText(R.string.test_date)))
        onView(withId(R.id.time))
            .check(matches(isDisplayed()))
            .check(matches(withText(R.string.test_time)))
    }
}
