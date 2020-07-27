
// App is a trait / interface which already implements main func
object HelloWorld extends  App {

  //variable, mutable
  var i = 10
  var j: Int = 20; // optional semicolon

  println("I, J", i, j)

  i = 12;
  j = 40;
  println("I, J", i, j)

  // val, value, immutable

  val PI = 3.14;
  println("PI", 3.14);

  // PI is const/immutable
  // PI = 2.14; // error, immutable

  println("Welcome to Scala")

}
