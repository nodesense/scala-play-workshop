import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, Await}
import scala.concurrent.duration._
import scala.language.postfixOps
import scala.util.{Failure, Success}


object  FutureForComprehension2  extends  App {

  case class User(id: String)
  case class Product(id: String, name: String)
  case class Balance(balance: Int)
  case class Order(amount: Int)

  def getUser(id: String): Future[User] = Future {
    println("getting user from db/web service")
    User(id)
  }

  def getProduct(): Future[Product] = Future {
    println("get product from db/web")
    Product("10", "Phone 1")
  }

  def getOrder(product: Product) : Future[Order] = Future {
    println("getting order from db/web")
    Order(10000)
  }

  def getBalance(user: User): Future[Balance] = Future {
    println("getting balance from db/web")
    Balance(2000)
  }

  val result = for {
                      user <- getUser("1")
                      product <- getProduct()
                      order <- getOrder(product)
                      balance <- getBalance(user)
  } yield (user, product, order, balance)

  println("result ", result)

  result.onComplete {
    case Success(n) => println("Future done, the result is ", n)
    case Failure(exception) => println("Oh crash", exception)
  }

  println("result ", result)

  Thread.sleep(10000)
}
