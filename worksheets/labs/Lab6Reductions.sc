1.to(10).reduceLeft(_ * _)

def fac(n: Int) = 1.to(n).reduceLeft(_ * _)
fac(10)
// factorial written without loops

1.to(10).map(n => 2).reduceLeft(_ * _)
// 10 to 10 => all become 2 => times all together

def pow(a: Int, b: Int) = 1.to(b).map(n => a).reduceLeft(_ * _)
pow(2, 16)

// reduce left whenever useful for any kind of operation
// you want to apply on neighbouring elements