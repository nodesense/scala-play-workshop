object StackGenericExample extends  App {

  // generic defined using [T]
  /// in java, diamond operator <T>

  // []

  // push 10 ==> [10], head is 10
  // push 20 ==> [20, 10], head is 20

  class Stack[T] {
    var elements: List[T] = Nil
    def push(x: T): Unit = {
      elements = x :: elements
    }
    def top: T = elements.head

    def pop(): Unit = {
      // take last items but not head
      // remove the first element
      elements = elements.tail
    }

    def isEmpty = elements.isEmpty
  }

  case class Product(name: String, price: Int)
  case class Brand(name: String)

  val productStack: Stack[Product] = new Stack
  productStack.push(Product("Phone 1", 10000))

  val product = productStack.top // get the last entry
  productStack.pop // remove the last entry
  println("Product", product)
  println("isEmpty", productStack.isEmpty)
  // won't accept brand
  //productStack.push(Brand("Company X")) // error


}
