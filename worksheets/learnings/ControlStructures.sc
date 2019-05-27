def square(x: Int) = x * x
println(square(2))

// named & default argument

def decorate(str: String, left: String = "[", right: String = "]") =
left + str + right

decorate("Hello")
decorate(str = "Hello", left = ">>>")

// variable arguments

def sum(args: Int*) = {
  var result = 0
  for (arg <- args) result += arg
  result
}

sum(1,2,3)
sum(1,2,3,4)
sum(1 to 10 : _*) // using sequence within seq type
// needed in recursive calls

def recursiveSum(args: Int*) : Int = {
  if (args.length == 0) 0
  else args.head + recursiveSum(args.tail : _*)
}

recursiveSum(1 to 3 : _*)