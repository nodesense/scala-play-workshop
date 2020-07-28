package workshop

object PartialFunctionExample extends  App {
    // Partial Function ==> Incomplete Function

  // guard, predicate
  // input, if p1 >= 0 then only i can perform the expected operation
  // function (p1) { return output}

  // data input (1 million entries) -- to perform the operation you need 5 minutes

  // inputs is not correct, function is called, memory may allocated
  // CPU cycle also used
  // function(inputs) {
  //    perform operation for 5 minutes and return result
  // }

  // logical approach: if input is not right, then don't call the function

  val divide = new PartialFunction[Int, Int] {

    def apply(x: Int) = 42 / x

    // error condition, what if x is 0
    // return true if x is non zero
    // gaurd/pre-condition
    // may not be scalable for multiple types/range checks
    def isDefinedAt(x: Int): Boolean = x != 0
  }

  println(divide.isDefinedAt(0)) // false
  println(divide.isDefinedAt(2)) // true

  if (divide.isDefinedAt(2)) {
    println("by 2", divide(2))
  }

  // map doesn't respect the partial function, works
  // val results = List(3, 5, 8, 2,   10).map (divide)

  // crash due to divide by zero
  // val results = List(3, 5, 8, 2, 0,  10).map (divide)

  // collect respect partial function, it calls isDefinedAt,
  // if true, then calls apply function of partial
  val results = List(3, 5, 8, 2, 0,  10).collect (divide)
  println(results)

  // partial function with case statement
  // case statement validate the inputs with if, or type
  // if the case is not satisfied, then the function is not called
  // isDefinedAt, apply is written by scala compiler
  val sqRoot: PartialFunction[Double, Double] = {
    case d: Double if d > 0 => Math.sqrt(d)
  }

  println("sqrt(-1)", sqRoot.isDefinedAt(-1))
  println("sqrt(2)", sqRoot.isDefinedAt(2))

  if (sqRoot.isDefinedAt(2)) {
    println("sqrt(2)", sqRoot.isDefinedAt(2))
  }

  val results2 = List(2.0, 4.0, 8.0, 10.0, -1.0, -3.0, 100.0)
                    .collect(sqRoot)

  println("results2", results);


}
