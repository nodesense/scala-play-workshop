package workshop

object ComposeExample extends  App {

  // f(x)
  // g(x)
  // f(g(x)) or g(f(x)))

  def f(s: String) = {
    println("F called")
    "f(" + s + ")"
  }
  def g(s: String) = {
    println("G called")
    "g(" + s + ")"
  }

  def toInt(s: String): Int = {
    s.toInt
  }

  def discount(n: Int): Double = {
    n - (n * 10/100.0)
  }

  // f compose g ==> f(g(x))
  // f andThen g ==> g(f(x))

  // f _ means, we get function from method
  //fComposeG is a function
  val fComposeG = f _ compose g _
  println("with x", fComposeG("x"))

  // f andThen g ==> g(f(x))
  val fAndThenG = f _ andThen g _;
  println("With x ", fAndThenG("x"))

  // amount ==> discount ==> finalAmount ==> GST
}
