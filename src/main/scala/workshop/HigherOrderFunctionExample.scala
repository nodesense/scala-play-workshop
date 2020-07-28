package workshop

object HigherOrderFunctionExample extends  App {

  // Higher order function
  // A function that accept another function as parameter is called higher order function

  // id, sq, cube are not higher order functions
  val id = (n: Int) => n
  val sq = (n: Int) => n * n
  val cube = (n: Int) => n * n * n

  // doWhatISay is a function reference
  // (Int => Int, Int) => Int as whole is type declartion that a fucntion passed as input along with int,
  // returns int
  // = assignement
  // (f, n) => f(n) function body
  // higher order function
  // accept a function as input parameter, invokes the function on need basic
  // this is higher order function
  // first parameter, is a function1[Int, Int]   f: Int => Int
  // second parameter is a number n
  // function body calls the f (n)
  val doWhatISay: (Int => Int, Int) => Int = (f, n) => f(n)

  def doWhatISay2 (f: Function1[Int, Int], n: Int) = f(n)


  //  return  id(100)
  // doWhatISay (id, 100)

  println("ID", doWhatISay (id, 100) )  // 100
  println("SQ", doWhatISay (sq, 3) )  // 9
  println("Cube", doWhatISay (cube, 2) )  // 8


  val numbers = List(10, 20, 30)
  val results2 = numbers.map( n => sq(n)) // or
  val results = numbers.map(cube)
  println("Results ", results)
}
