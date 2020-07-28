object MathMethods extends  App {

  // explicit return type
  def add(a: Int, b: Int): Int = a + b;

  // type inference return type
  def sub(a: Int, b: Int) = a - b;

  // block
  def mul(a: Int, b: Int) = {
    println("A ", a);

    // no need for return keyword
    a * b // the last evaluated expression value returned

  }

  // block with return keyword
  // when used with return keyword in method, we need to use explicit return type
  def div(a: Int, b: Int): Int = {
    println("A", a);
    return a / b; // not used wildly
  }

  def fact(n: Int): Int = {
    if (n == 1) 1 // return 1
    else n * fact(n - 1)
  }

  // default arguments
  def sum(a: Int = 0, b: Int = 0) = a + b

  // named arguments, nothing much in declaration, it is about the caller
  def diff(a: Int, b: Int)  = sub(a, b)

  println("Add ", add(10, 20));
  println("Sub ", sub(10, 20));
  println("Mul ", mul(10, 20));
  println("Div ", div(20, 10));

  println("Fact", fact(5));

  println("Sum", sum(1, 2))

  println("Sum", sum()) // a = 0, b = 0
  println("Sum", sum(1)) // a = 1, b = 0

  println("Diff", diff(10 ,20));
  // named arguments, caller
  // the scalac compiler, will match a and b based on declartion
  println("Diff ", diff(b = 50, a= 20)); // diff(20, 50)

}
