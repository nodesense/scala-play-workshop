object EitherExample extends  App {
  // Option will miss negative output always

  // Either will capture both positive and negative outputs
  // get RIGHT or LEFT
  // positive output/ negative output
  // Either[Left, Right]
  def safeDiv(a: Int, b: Int): Either[String, Int] =
        if ( b != 0) Right(a / b) else Left("Divide by Zero")

  val x = safeDiv(10 ,2) // Left ("devidd....)
  println("X", x);
  println("isRight", x.isRight);
  println("isLeft", x.isLeft);

  if (x.isRight) {
    val result = x.right.get;
    val re2 = x.getOrElse()
    println("Result ", result);
  }

  if (x.isLeft) {
    val result = x.left.get;
    println("Error result " + result);
  }

}
