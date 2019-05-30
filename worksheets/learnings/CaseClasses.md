Using `case` (pattern matching) is the preferred way to type match in scala.

### Case Classes

when you use case class, each of constructor parameters become a val.
- don't have to put `new`
- also get other methods e.g. `.copy`

### Option

Option is a safe alternative to providing a value of type T or null.

```$xslt
val scores = Map("Alice" -> 1, "Bob" -> 2)

scores.get("Alice") match {
  case Some(score) => println(score)
  case None => println("No score")
}
```

### Know how to choose between Polymorphism and Case Classes

- **open ended  collection** => polymorphism
- case classes and pattern matching are best for a **bounded collection**
    - code is more concise with case classes