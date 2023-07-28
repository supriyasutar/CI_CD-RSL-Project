package com.example.android.hilt

// Just to run jacoco as it is verifying unit tests
class PriceCalculator {

    //
    /**
     * @return the final price of the product to show in the UI.
     * @param basePrice the base price of the [Product].
     */
    fun finalPrice(basePrice: Double): Double {
        return basePrice * 1.5
    }
}
