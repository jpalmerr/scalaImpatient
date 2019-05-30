def swap(p: (Int, Int)) = p match { case (x, y) => (y, x) }
swap((3, 4))

def swap2(a: Array[Int]) = a match {
  case Array(x, y, rest @_*) => Array(y, x) ++ rest
  case _ => a
}
swap2(Array(1, 7, 2, 9))
swap2(Array(1))