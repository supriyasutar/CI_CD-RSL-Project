package com.example.android.hilt

import org.junit.Test

import org.junit.Assert.*


class PriceCalculatorUnitTest {

    private val priceCalculator = PriceCalculator()

    @Test
    fun `Assert product final price`() {

        val expectedProductPrice = 1.5
        val finalProductPrice = priceCalculator.finalPrice(basePrice = 1.0)

        // When the product [basePrice] is 1, we expect the
        assertEquals(
            expectedProductPrice,
            finalProductPrice,
            0.001 // This is for number precision
        )
    }
}
