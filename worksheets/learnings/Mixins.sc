// Mixins

// consider ice cream example, "mix in" extras you want

trait Logged {
  def log(msg: String) {}
}

trait ConsoleLogger extends Logged {
  override def log(msg: String) {println(msg)}
}

class SavingsAccount extends Logged {
  private var balance: Double = 0
  def withdraw(amount: Double): Unit = {
    if (amount > balance) log("Insufficient Funds")
    else balance -= amount
  }
  // ...
}

val acct = new SavingsAccount with ConsoleLogger

acct.withdraw(1000)