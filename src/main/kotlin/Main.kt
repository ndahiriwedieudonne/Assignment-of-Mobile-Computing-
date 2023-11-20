fun main() {
    print("Enter a number: ")
    val input = readLine()
    var number = input?.toLongOrNull()

    if (number == null || number !in 0..999999) {
        println("Invalid number or out of range")
        return
    }

    val ones = arrayOf("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    val teens = arrayOf("ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")
    val tens = arrayOf("", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")

    var word = ""

    if (number >= 100000) {
        word += ones[(number / 100000).toInt()] + " hundred "
        number %= 100000
    }

    if (number >= 20000) {
        word += tens[(number / 10000).toInt()] + " "
        number %= 10000
    } else if (number >= 10000) {
        word += teens[(number / 1000).toInt()] + " thousand "
        number %= 10000
    }

    if (number >= 1000) {
        word += ones[(number / 1000).toInt()] + " thousand "
        number %= 1000
    }

    if (number >= 100) {
        word += ones[(number / 100).toInt()] + " hundred "
        number %= 100
    }

    if (number >= 20) {
        word += tens[(number / 10).toInt()] + " "
        number %= 10
    }

    if (number in 1..19) {
        word += ones[number.toInt()]
    }

    println(word.trim())
}
