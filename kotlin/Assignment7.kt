fun main() {
    print("Enter exam score: ")
    val score = readLine()?.toIntOrNull() ?: 0

    // 1. Using if...else if ladder
    if (score > 90) {
        println("Excellent")
    } else if (score in 75..90) {
        println("Good")
    } else if (score in 50..74) {
        println("Pass")
    } else {
        println("Fail")
    }

    // 2. Using if expression to return a result string
    val result = if (score > 90) {
        "Excellent"
    } else if (score in 75..90) {
        "Good"
    } else if (score in 50..74) {
        "Pass"
    } else {
        "Fail"
    }

    println("Result using if expression: $result")
}