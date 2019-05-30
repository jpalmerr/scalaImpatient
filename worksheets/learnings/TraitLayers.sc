trait Logged {
  def log(msg: String) {}
}

trait ConsoleLogger extends Logged {
  override def log(msg: String) {println(msg)}
}

trait TimestampLogger extends Logged {
  override def log(msg: String): Unit = {
    super.log(new java.util.Date() + " " + msg)
  }
}

trait ShortLogger extends Logged {
  val maxLength = 15
  override def log(msg: String): Unit = {
    super.log(
      if (msg.length <= maxLength) msg
      else msg.substring(0, maxLength - 3) + "..."
    )
  }
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

val acct1 = new SavingsAccount with ConsoleLogger with TimestampLogger with ShortLogger
acct1.withdraw(1000)

val acct2 = new SavingsAccount with ConsoleLogger with ShortLogger with TimestampLogger
acct2.withdraw(1000) // notice order
