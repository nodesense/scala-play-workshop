import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, Await}
import scala.concurrent.duration._
import scala.language.postfixOps
import scala.util.{Failure, Success}


object FutureForComprehension extends  App {
    case class User(id: String)
    case class Product(id: String, name: String)
    case class Balance(balance: Int)
    case class Order(amount: Int)

    def getUser(id: String): User = {
      println("getting user from db/web service")
      User(id)
    }

    def getProduct() = {
      println("get product from db/web")
      Product("10", "Phone 1")
    }

    def getOrder(product: Product) : Order = {
      println("getting order from db/web")
      Order(10000)
    }

    def getBalance(user: User) = {
      println("getting balance from db/web")
      Balance(2000)
    }


    val userFuture = {
      Thread.sleep(3000)
      Some(getUser("1"))
    }

    val productFuture = {
      Thread.sleep(3000)
      Some(getProduct())
    }

    val orderFuture = {
        Thread.sleep(3000)
        Some(getOrder(Product("100", "Iphone")))
    }

    val balanceFuture = {
      Thread.sleep(3000)
      // throw  new Exception("Insuccifient balance")
      Some(getBalance(User("1")))
    }

    // how to use for comprehension with future

    val result = for {
                      user <- userFuture
                      product <- productFuture
                      order <- orderFuture
                      balance <- balanceFuture

                } yield (user, product, order, balance)

    println("result ", result)

}
