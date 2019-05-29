// two different syntax, either is fine

1 to 10 map (3 * _) filter (_ % 5 == 2)
1.to(10).map(3 * _).filter(_ % 5 == 2)

// right associative :

1 :: 2 :: 3 :: Nil
