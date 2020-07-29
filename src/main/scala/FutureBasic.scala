
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, Await}
import scala.concurrent.duration._
import scala.language.postfixOps
//ExecutionContext

// Pool of threads, pre-allocated by JVM
// ExecutionContext will pick a thread from the pool
// execute the task on the thread pulled from pool
// once the task is executed, the thread is released back to pool

object FutureBasic extends  App {
  // Future, shall submit the task to execution context
  // get the result
  val future1 = Future {
    // task code
    println("Future tasks")
    Thread.sleep(5 * 1000)
    42 // return value after the task completion
  }

  // how to get the results from future
  // two ways
  // 1. Blocking [Await] - not recommended
  // 2. Non-clocking

  // not recommended option, blocking,
  // blocks the calling thread

  println("await start")

  // wait maximum of 10 second
  // exit immediate after getting result from future
  val result = Await.result(future1, 10 second)
  println("await end, result ", result)


}
