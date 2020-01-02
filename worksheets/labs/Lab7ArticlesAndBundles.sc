abstract class Item // cannot be instantiated, only inherited
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item

val book = Article("Scala for the Impatient", 39.95)
val gift = Bundle("xmas special", 10, book, Article("Posh Whisky", 79.95))

def price(it: Item) : Double = it match {
  case Article(_, p) => p
  case Bundle(_, disc, its @_*) => its.map(price).sum - disc // recursive => declare double
}

price(book)
price(gift)

/* abstract class can't be instantiated
 ie you can't actually have create one
 think of: pet
 you have an animal which is a pet
 => pet is abstract class
 => dog, cat, hamster... extends pet
 */