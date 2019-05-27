// Arrays
val a = Array("Hello", "World")
a(0)
for (element <- a) println("traversed " + element)

val b = new Array[Int](10)
for (i <- 0 until b.length) b(i) = i * i
for (elem <- b) println(elem)

import scala.collection.mutable.ArrayBuffer

val c = ArrayBuffer("Mary", "had", "a", "little", "lamb")

c += "its"
c += ("fleece", "was", "white")
c ++= Array("as", "snow")

c.remove(3)
c

c.insert(3, "medium-sized")
c

c.trimEnd(5)
c

val cArray = c.toArray
val bBuffer = b.toBuffer


// Buffers are used to create sequences of elements incrementally by
// appending, prepending, or inserting new elements.

// transform array

val d = Array(2,3,5,7,11)
val result = for (elem <- d if elem % 2 != 0) yield 2 * elem

Array(1,2,3).sum
ArrayBuffer("hello", "people").max
ArrayBuffer(1, 7, 2, 9).sorted
Array(1,2,3,4,5).reverse
Array(1,2,3).mkString(" | ")

// hash

val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

import scala.collection.mutable.Map
Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)