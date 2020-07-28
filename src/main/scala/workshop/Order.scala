package workshop;

// companion object - Both class and object   have same name
// Object Order is helpful to be factory, create instances of class Order
// more of functional pattern, to avoid new keyword
// Companion object should be in same file, same package

class Order(val id: Int) {
  println("Order instance")
}

object Order {
  println("Order object init")

  // overloaded
  // factory, create object
  def apply() = new Order(-1) // this is OK, to create object
  def apply(id: Int) = new Order(id)
  
  // unapply, reverse of apply
  // extraction of member
  // usage: val Order(id) = o2;
  def unapply(arg: Order): Option[Int] = {
    println("Unapply called");
    Some(arg.id)
  }

}

object OrderApp extends  App {
  // val o1 = new Order(); // how to create object without new keyword
  val o1 = Order() // this will invoke Order(obj).apply() function, no new keyword
  println("ID ", o1.id) // -1
  val o2 = Order(10); // Order.apply(id: Int)
  println("ID ", o2.id) // 10

  // id is an option, value or none
  // id is value type
  // val id
   // product = {name: 'Scala', price: 0}
  // es6 const {name, price} = product;

  val Order(id) = o2; // invokes unapply method
  println("ID is ", id)
}