
/*
  JAVA Example:
  class Logger {
    public static void info(String message) {}

    public void setLogLevel(int level) {} // instance method
  }

  Logger.info("Starting app");

  Logger logger = new Logger();
  logger.setLogLevel(1);
 */


// What is object in SCALA
// NO STATIC IN SCALA, instead we need to use object
// Singleton - Single Instance
// Java == Static class / Static members
object Logger {
  // object contructor, to be used very first time to initialize
  // lazy initiation, on first use
  println("Logger Starting")
  // member variable for object
  var logLevel = 0;
  def setLogLevel(value: Int) = logLevel = value;
}


object ObjectBasic extends  App {
  println("Basic Objects");
  println("LEvel ", Logger.logLevel)
  Logger.setLogLevel(5);
}
