package workshop

object ForYieldOptionExample extends  App {
  def toInt(s: String): Option[Int] = {
      try {
        Some(s.toInt)
      } catch {
        case _ => None
      }
  }

  def sq(x: Int): Option[Int] = {
    println("SQ called", x)
    Some(x * x)
  }

  // use case, take string, convert to number, if valid number, sq it
  // classic code style 1
  val n: Option[Int] = toInt("IN")
  if (n.isDefined) {
    val n2 = sq(n.get)
    println("N2", n2)
  }

  // monad, Option, Future can be used with For Comprehension

  // for comprehension
  val result2 = for {
                     n <- toInt("100")
                     n2 <- sq(n) // called only if Some(value) present, not called for None
                     } yield n2;

  println("result2", result2)



}
