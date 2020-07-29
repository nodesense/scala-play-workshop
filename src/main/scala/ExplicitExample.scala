// implicit
// library 1 - company 1 / github
//   db/thread pool , borrow from application as implicit
// library 2 - company 2 / gitlab
//   db/thread pool , borrow from application as implicit
// app - your product uses library 1 and library 2

//   provide the implicit values, which will be passed to library 1, library 2

//Shared/global stuff in the application
// thread pool, db connection pool, application config

// lib2: lib1.someclass.setpool() // explicit, you need code, tight coupling
// lib1: lib2.someclass.setconfig()



object ExplicitExample extends  App {
  // Rule 1: it works with strict type
  // Rule 2: Implicit can be scoped

  {
    // implicit dtoi is scopped here
    // conversion function as implicit
    implicit def dtoi(d: Double) = {
      println("dtoi called")
      d.toInt
    }

    // compilation error
    // let us solve this by magically providing a implicit conversion function
    val x: Int = 42.0
  }

  {
    // implicit not applied here
    implicit def doubletoint(d: Double) = {
      println("doubletoint called")
      d.toInt
    }
    val y: Int = 42.0;
  }

}
