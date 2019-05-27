
println("Remove all but first negative number")
import scala.collection.mutable.ArrayBuffer

val buf = ArrayBuffer(1, 2, -3, 4, -5, 6, -7, 8)

def removeAllButFirstNegative(b: ArrayBuffer[Int]): Unit = {
  var first = true
  var i = 0
  while (i < b.length) {
    if (b(i) < 0) {
      if (first) {
        first = false
        i += 1
      }
      else
        b.remove(i)
    }
    else i += 1
  }
  println("Version 1 result:")
  print(b)
}

removeAllButFirstNegative(buf)

// preferred scala way
val buf2 = ArrayBuffer(1, 2, -3, 4, -5, 6, -7, 8)

def removeAllButFirstNegative2(buf: ArrayBuffer[Int]): Unit = {
  val indexesToRemove = (for (i <- 0 until buf.length if buf(i) < 0) yield i).drop(1)
  // reverse to get biggest index
  for (i <- indexesToRemove.reverse) buf remove(i)
  println("Version 2 result:")
  print(buf)
}

// notice could do all in one line
// however hard to read => avoid
removeAllButFirstNegative2(buf2)

