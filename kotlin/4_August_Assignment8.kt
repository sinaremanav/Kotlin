fun main() {
    var restart: String

    do {
        var count = 10
        println("Starting Countdown:")

        // while loop countdown
        while (count >= 1) {
            println(count)
            Thread.sleep(500) // small delay for realism (0.5 sec)
            count--
        }

        // ask user to restart
        print("Do you want to restart countdown? (yes/no): ")
        restart = readLine()?.lowercase() ?: "no"

    } while (restart == "yes")

    println("Countdown stopped.")
}