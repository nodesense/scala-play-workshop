/*
  class Brand() {
     public Brand(String name) { // cons, name is cons arg, not a class/instance member
       println("Brand constructor")
     }
 */

// name is not a member of object/class, it is a cons parameter
class Brand2(name: String) {
  println("Brand constructor", name)
}

// making name as member variable
// declare with val or var to make it as member variable
// val - immutable
// var  - mutable
// prefix private/protected in front of val/var
class Brand(val name: String) {
  println("Brand constructor ", name)
}

// Inheritance
// name is local to MobileBrand cons
// this.name refers Brand.name
class MobileBrand(name: String, var year: Int) extends  Brand(name) {

}

object BrandApp extends  App {
  // val b1 = new Brand2("Apple")
  // print(b1.name); // error, since name is not member variable

  val b1 = new Brand("Apple");
  println(b1.name); // name is public member

  val mb1 = new MobileBrand("Apple", 2000)
  println(mb1.name) // name is from Brand class
  println(mb1.year) // year is from MobileBrand class

  // new Brand() this is not functional expression
  // keyword new is not functional, useful to create object in memory
}