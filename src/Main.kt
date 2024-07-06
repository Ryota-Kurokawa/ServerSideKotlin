fun printText() {
    val name: String = "Ryota"
    println(name)
}

class OddNum {
    fun run() {
        val oddNumbers = mutableListOf<Int>().run {
            for (i in 1..10) {
                if (i % 2 == 1) this.add(i)
            }
            this.joinToString(separator = " ")
        }
        println(oddNumbers)
    }
    fun apply() {
        val oddNumbers = mutableListOf<Int>().apply {
            for (i in 1..10) {
                if (i % 2 == 1) this.add(i)
            }
            this.joinToString(separator = " ")
        }
        println(oddNumbers)
    }
}

class Reducer {
    fun reduce() {
        val list = listOf(1, 2, 3, 4, 5)
        val result = list.reduce { sum, value ->
            println("$sum + $value")
            sum + value
        }
    }
}


fun main() {
    val oddNum = OddNum()
    val reducer = Reducer()
    oddNum.run()
    oddNum.apply()
    reducer.reduce()


}
