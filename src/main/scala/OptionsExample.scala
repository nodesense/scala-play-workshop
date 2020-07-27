object OptionsExample extends  App {
  // Option

  // string "123", convert to int
  // write a function, pass "123", get back 123
  // write a function, pass "IN", get back ?? what is the output

  // Option -- alternative, either get a number, or none

  // OPTION
  // Option is a wrapper for success value, or none value

  // cons: Exception is swolled
  def toInt(input: String): Option[Int] = {
    try {
      Some(input.toInt) // success value
    } catch {
      case _ => None // return None if any error
    }
  }

  println("Output", toInt("123"))
  println("Output", toInt("IN"))

  val result = toInt("345");

  println("Isdefined ", result.isDefined)
  println("isEmpty ", result.isEmpty)

  if (result.isDefined) {
    println("The value is ", result.get)
  }

  val dataPoints = List("10", "20", "nan", "Missing", "#,", "40")
  val results = dataPoints.map(toInt)
    .filter (option => option.isDefined)
    .map (option => option.get)

  println("results ", results);


  // what if we call same in 1000 places

}
