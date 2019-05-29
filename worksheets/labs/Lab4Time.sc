class Time(val hours: Int, val minutes: Int) {
  if (hours < 0 || hours >= 24 || minutes < 0 || minutes >= 60) throw new IllegalArgumentException
  def before(other: Time) = hours < other.hours || hours == other.hours && minutes < other.minutes
  override def toString = f"${hours}:${minutes}%02d"
}

val morning  = new Time(9, 0)
val afternoon = new Time(16, 30)

morning.before(afternoon)
afternoon.before(morning)