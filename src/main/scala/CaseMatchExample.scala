

// Java, other languages, switch, case
// Scala, case and match

// Java -
  // statement if, else, while, do, while, for, switch/case
  // expression 1 + 2, f()

// statements - doesn't return values
// expressions - returns value

// scala - favor expressions over statements
// scala, if,else, for..yield, case and match - are expressions

case class Light(watts: Int, lumens: Int)
case class Book(pages: Int, author: String)


object CaseMatchExample extends App  {
  //   match, case is an expression
  val n = 10;

  val result = n match {
                          case 0 => "Zero" // return value
                          case 1 => "One"
                          // default
                          case _ =>  "Others"
                        }

  println("REsult is ", result)


  val l1 = Light(7, 600)
  val b1 = Book(1200, "Martin")

  val watts = b1 match {
    case l: Light => l1.watts
    case _ => 0
  }



  def getDiscount(product: Object): Int = product match  {
    case l: Light => 10
    // guarded case statement, with if statement
    case b: Book if b.pages > 999 => 50
    case b: Book => 25
    case _ => 0
  }

  println("Watts", watts)

  println("Light", getDiscount(l1))
  println("Book ", getDiscount(b1))
  println("Other types ", getDiscount("Unknown"))


  case class PhoneExt(name: String, ext: Int)
  val extensions = List(PhoneExt("steve", 100), PhoneExt("robey", 200))
  println(extensions.filter { case PhoneExt(name, extension) => extension < 200 })
}
