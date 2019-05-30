import scala.math._

val num = 3.14
val fun = ceil _

// to call a function, use ()
fun(num)

// give a function to another function/method
Array(3.14, 1.42, 2.0).map(fun)

// don't need to give each function a name
Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x)

// you can store it in a variable
val triple = (x: Double) => 3 * x
Array(3.14, 1.42, 2.0).map(triple)

// and as a def
def quadruple(x:Double) = 4 * x
Array(3.14, 1.42, 2.0).map(quadruple)

// only give a function a name if you use it multiple times

// higher order function

def valueAtOneQuarter(f: (Double) => Double) = f(0.25)
valueAtOneQuarter(ceil _)
valueAtOneQuarter(sqrt _) // _ since from math import
valueAtOneQuarter(triple)

// a function can produce another function

def mulBy(factor: Double) = (x: Double) => factor * x
mulBy(3)
val quintuple = mulBy(5)
quintuple(20)

// scala can deduce types => don't always need :Double

// if it occurs once ... awesome notation
valueAtOneQuarter(3 * _)

// Map, filter, reduce

// map applies a function to each element of a seq
(1 to 9).map(2 * _)

// filter retains the elements that fulfill a predicate
(1 to 9).filter(_ % 2 == 0)

// reduceLeft applies a binary function, going l to r
(1 to 9).reduceLeft(_ * _)

(1 to 9).filter(_ % 2 == 0).map(2 * _)

