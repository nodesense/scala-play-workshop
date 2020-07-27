
// Option
// Either 2xx or 4xx/5xx
// Either right value or exception

// success outcome else it ends up in exception

import scala.util.{Try, Success, Failure}

// Try --> wrapper for try catch block
// return Success with value if not error
// return Failure with actual Exception/throwale if any exception
object TrySuccessExample extends  App {
  def safeDiv(a: Int, b: Int): Try [Int] = Try (a/b)

  val x = safeDiv(10, 0); // Success

  if (x.isSuccess) {
    println("Result is ", x.get)
  }

  if (x.isFailure) {
    println("Exception is ", x.failed.get);
    // throw x.failed.get;
  }
}
