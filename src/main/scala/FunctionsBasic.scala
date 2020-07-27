object FunctionsBasic extends  App {

  // first class citizen, function itself is an object
  // functions ==> lambda, annoymose function
  // =>

  // Scala compiler generate FunctionN from the => expression
  val add = (a: Int, b: Int) => a + b // single line
  val sub = (a: Int, b: Int) => { // multi line
    println("a ", a)
    a - b
  }

  // method, not first class citizen, not an object
  def mul(a: Int, b: Int) = a * b;

  val sum = add;

  println("Add ", add(10, 20))
  println("Sub ", sub(10, 20))

  println("Add ", add.apply(1, 2));

  // mul.apply(10, 20); // error, mul is method, unapplied
  // convert scala method into function(N)

  // mulFunc is Function2 with return type Int
  // Function2[Int, Int,  Int]
  val mulFunc =  mul _; // create wrapper function for  method
  val mul2Func: Function2[Int, Int, Int] =  mulFunc;

  println(mulFunc(10, 20));
  println(mulFunc.apply(2, 4));
  println(mul2Func.apply(2, 4));
  println(mul2Func(2, 4));



}
