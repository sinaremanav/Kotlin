// BankAccount.kt
open class BankAccount(
    var accountHolderName: String,   // public by default
    internal var bankName: String,   // internal = visible inside same module
    private var balance: Double      // private to this class
) {
    // Protected function to show balance
    protected fun showBalance() {
        println("Account Holder: $accountHolderName")
        println("Bank: $bankName")
        println("Balance: ₹$balance")
    }
}

// SavingsAccount.kt
class SavingsAccount(
    accountHolderName: String,
    bankName: String,
    balance: Double
) : BankAccount(accountHolderName, bankName, balance) {

    // Function to call protected method
    fun displayBalance() {
        showBalance()
    }
}

// Main.kt
fun main() {
    val sa = SavingsAccount("Ayush ", "SBI Bank", 50000.0)
    sa.displayBalance()
}