package workshop

object ForLoopExample  extends  App {
 // for statement
  // while, do-while - statements

  // simple for loop, statement, doesn't return expression
  // for loop work with Range, which a Seq
  for (i <- 1 to 5) {
    println(i)
  }

  def sq(x: Int) : Int = {
    println("sq called ", x)
    x * x
  }

  // for loop as an expression with yield [lazy eval, by name block]
  val numbers = for (i <- 1 to 5) yield i * 2
  println("numbers", numbers)

  val sqNumbers = for (i <- 1 to 5) yield sq(i)

  // use _ as default place holder
  // _ represent i here as default placeholder
  val sqNumbers2 = for (i <- 1 to 5) yield sq(_) // FIXME

  println("sqNumbers", sqNumbers)
  sqNumbers.foreach(x => println(x))

  sqNumbers.foreach(println(_))

  // for comprehension for () or for {}
  // (x, y) represent a tuple, 2 pair
  val results = for { x <- 1 to 5
                      y <- x to 20 } yield (x, y);

  println("Results ", results)

}
