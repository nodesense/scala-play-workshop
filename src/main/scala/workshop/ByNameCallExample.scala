package workshop

object ByNameCallExample  extends  App {

  def nano() = {
    println("Called nano function")
    System.nanoTime()
  }

  def timenow(t: Long) = {
    println("Time now called")
    println("T ", t)
  }

  // by name parameter/block
  def delayed(t: => Long ) = {
    println("Delayed called")
    println("T ", t)
    println("T2 ", t)
    println("-----------")
  }

  // function in the scala
  // p represent the code block as is, not yet evaluated

  def ifElseExpr(p: => Boolean, truePart: => Unit, elsePart: => Unit) = {
    println("Ifelse func, executing predicate")

    if (p) truePart else elsePart

  }


  // it calls nano() function, get the time
  // pass the time to timenow function as long value
  // timenow prints the value
  timenow ( nano() ) // normal function
  println("--------------------")

  // nano() is passed as a block of code, not yet evaluated
  // it will be evaluated inside nano() func
  delayed( nano() ) // by-name block

  // Boolean
  // if (true/false) {.....} else {...}

  // p => true
  ifElseExpr ( {
    println("True predicate")
    true
  },
    {
      println("condition true")
    },
    {
      println("condition false ")
    }
  )
  // p => false
  ifElseExpr ( {
    println("false predicate")
    false
  } ,
    {
      println("condition true")
    },
    {
      println("condition false ")
    })
  // p =>  10 > 5 && 5 < 8 [entire expression, this expression is not evaluated)
  // scala create a majic function inside, move that code 10 > 5 && 5 < 8 inside function
  // function is passed as object called p
  ifElseExpr ( 10 > 5 && 5 < 8,
    {
      println("condition true")
    },
    {
      println("condition false ")
    } )
  /* p => {
    val i = 10;
    val j = 20;
    println("I, J", i, j)
    i < j
  }


   */
  ifElseExpr( {
    val i = 10;
    val j = 20;
    println("I, J", i, j)
    i < j
  } ,
    {
      println("condition true")
    },
    {
      println("condition false ")
    })

}
