// currying

// turning a function that takes two arguments
// into a function that takes one argument

def mul(x: Int, y: Int)

def mulOneAtATime(x: Int) = (y: Int) => x * y

mulOneAtATime(3)
mulOneAtATime(3)(14)

// syntactic sugar

def mulOneAtATime2(x: Int)(y: Int) = x * y
mulOneAtATime2(2)(5)

// corresponds method
// compares whether two sequences are under
// some comparison criterion

val a = Array("Hello, World")
val b = Array("hello, world")
a.corresponds(b)(_.equalsIgnoreCase(_))
// allows us not to put :String