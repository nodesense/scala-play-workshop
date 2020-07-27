
object Methods extends  App {
  // Methods - Similar to Java Instance Method
  // Functions - convered on next chapter, similar to Java Lambda

  // methods, defined using def keyword
  // doesn't return value
  def hello() = println("Hello World"); // single line
  def helloWorld() = { // multi line
    println("Hello");
    println("World")
  }

  hello()
  helloWorld()

}
