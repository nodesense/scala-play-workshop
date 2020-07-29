import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, Await}
import scala.concurrent.duration._
import scala.language.postfixOps
import scala.util.{Failure, Success}

object FutureAsyncExample extends  App {

  val future1 = Future {
    println("Future 1 running")
    // throw new Exception("unexpected")
    42
  }

  // Async, onComplete callback, unblocking
  // onComplete

  future1.onComplete {
    case Success(n) => println("Future done, the result is ", n)
    case Failure(exception) => println("Oh crash", exception)
  }



}
