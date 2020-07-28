
// case class
// case object

// case class => sugar to create immutable object, with companion object [apply, unapply] etc

// productCode, stock are both member variable of type val, public access speicifier
// Scala lang automatically generate Companion object for case class
// immutable
case class Inventory(productCode: Int, stock: Int);

object CaseClassExample extends  App {
   // Works, not recommended, new keyword
   //val inv1 = new Inventory(1, 100);
  // inv1.productCode = 2; // immutable, error
 // println("Inv1", inv1)

  // use companion object apply()
  // recommended
  val inv2 = Inventory(1, 100)
  println("Inv2", inv2)
}
