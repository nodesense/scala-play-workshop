object MainApp {


  def main(args: Array[String]): Unit = {
    println("Hello World")

    // primitives
    // Boolean : true/false
    // Byte, Char, Short, Int, Double, Float, Long
    val b = true;

    // Double is a class, d is an instance/object
    //Scalac compiler: Primitive as Object Oriented
    // When scalac compile scala code to java byte code,
    // there, scalac will use native jvm types boolean, int, double, float, char [similar to java]
    val d: Double = 3.14;

    // implicits [covered later]
    val f = d.floatValue(); // we got functions for primitives
    val i = d;

  }

}
