package mykotlin

class Weather2 {

    fun updateWeather(degrees: Int){
        val (description, color) = when {
            degrees < 10 -> "cold" to Color.BLUE
            degrees < 25 -> "mind" to Color.ORANGE
            else -> "hot" to Color.RED
        }

        println("Description: $description Color: $color")
    }

    
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val w = Weather2()
            w.updateWeather(15)
        }
    }
}