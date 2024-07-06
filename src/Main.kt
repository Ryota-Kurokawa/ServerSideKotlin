fun printText() {
    val name: String = "Ryota"
    println(name)
}




fun main() {
    val oddNumbers = mutableListOf<Int>().run {
        for (i in 1..10) {
            if (i % 2 == 1) this.add(i)
        }
        this.joinToString(separator = " ")
    }
    println(oddNumbers)
}

class User {
    var name: String = ""
}