fun main() {
    val countries = mapOf("India" to "Delhi", "USA" to "Washington", "UK" to "London")
    // countries["Japan"] = "Tokyo" ❌ Immutable map cannot be modified

    val mutableCountries = mutableMapOf("India" to "Delhi", "USA" to "Washington", "UK" to "London")
    mutableCountries["Japan"] = "Tokyo"
    mutableCountries["USA"] = "New York"
    mutableCountries.remove("UK")

    println("Capital of India: ${mutableCountries["India"]}")

    println("Using for loop:")
    for ((k, v) in mutableCountries) println("$k -> $v")

    println("Using iterator:")
    val it = mutableCountries.iterator()
    while (it.hasNext()) println(it.next())
}
