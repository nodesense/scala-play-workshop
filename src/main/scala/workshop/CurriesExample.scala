package workshop

/* SCOPE
 {
     int i = 10 // scope with in block
}
  // i is expired,
*/

/*
  SCOPE with visiblity

  {
    // outer scope
     int i = 10;

     if (true) {
        // i is visible in this block
        int j = 20 + i;
     }

    // i still exist
    return function() {
         // i is visible here too
         // runtime shall preserve value of the i as long the function ref is not gc
         i = i + 20
         return i;
     }

    }



 */

object  CurriesExample extends  App {
  // design pattern
  // a function that returns another function is called curry
  // Closure -- Functional state, encapsulation

  // sequence generator example
  // seq1by2 = 0, 2, 4, 6, ...
  // seq100by20 = 100, 120, 140, 140, ...

  // this function return another function of type () => Int
  def seq (seed: Int, step: Int = 1): () => Int = {
    var counter = seed

    //0, 1, 2, 3, ..
    val incr = () => {
      // counter is visible, scope is maintained until incr function garbage collected
      val current = counter
      counter += step
      current
    }

    incr // return the function
  }

  // seq0by1 is a incr function returned by seq
  // until seq0by1 goes out of scope, ie Garbage collected or
  // seq0by1 = null, the value of current is maintained as closure/functional state
  val seq0by1 = seq(0, 1);

  println("seq0by1", seq0by1()) // 0
  println("seq0by1", seq0by1()) // 1
  println("seq0by1", seq0by1()) // 2
  println("seq0by1", seq0by1()) // 3

  val seq100by20 = seq(100, 20);

  println("seq100by20", seq100by20()) // 100
  println("seq100by20", seq100by20()) // 120
  println("seq100by20", seq100by20()) // 140
  println("seq100by20", seq100by20()) // 160
  println("seq0by1", seq0by1()) // 4
  println("seq100by20", seq100by20()) // 180
}
