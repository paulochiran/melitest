package mykotlin

import mykotlin.Color

class Weather {
    fun updateWeather(degrees: Int) {
        val description: String
        val color: Color
        if (degrees < 10) {
            description = "cold"
            color = Color.BLUE
        } else if (degrees < 25) {
            description = "mild"
            color = Color.ORANGE
        } else {
            description = "hot"
            color = Color.RED
        }
        println("Description: $description Color: $color")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val w = Weather()
            w.updateWeather(24)
        }
    }
}