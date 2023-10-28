package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 100.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(20)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, roundUp = false)
        assertEquals(expectedTip, actualTip)
    }
}