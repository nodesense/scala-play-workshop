object FunctionNBasic extends  App {

  // FunctionN
  // is a declaration
  // N can be 0 up to 22

  // Function0
  // 0 arguments to the function
  // return type can be explicit, must be defined in the type system

  // TypeScript, Java, C#, C++, diamand operator
  //   class Stack<T> {}
  //    new Stack[Book]

  // function is object, first class citizen
  // assign to variable, pass to function, high order func, closure,....

  // return string type
  val func0 = new Function0[String] {
    def apply(): String = sys.props("java.version");
  } // generics are defined with []

  // Function1
  // 1 arg: Int
  // return type is int
                            // arg type,    return type
  val power = new Function1[Int,              Int] {
    def apply(n: Int): Int = n * n
  }

  // involve function
  println("Func0", func0()) // sugar part, internally it calls apply method
  println("Func0", func0.apply())

  println("Power", power(5))

  println("Power", power.apply(3))


}
