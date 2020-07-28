class Product {
  // error if the variables are not initialized in constructor
  // class members must be initialized
  // var name: String = ""; // default value
  // var price: Int = 0;

  // public by default
  var name: String = _; // here underscore represent null

  // by default, public scope, no public keyword for same
  // private, only to this class
  // protected, this class and child classes
  private var _price: Int = _; // here underscore represent 0

  // JAVA: getPrice() { return this._price;}
  // JAVA: setPRice(int value) { this._price = price}

  // SCALA specific getter and setter
  // SCALA getter, simple def method

  def price = _price; // getter
  // SCALA Setter, tricky, this is not compatible with Java Byte code

  // NO Space between price_=, this will be generated method name in jvm

  // now SCALA expose getter and setter by name price
  def price_= (value: Int) = _price = value
  // something similar to below line
  // def setPrice (value: Int) = _price = value;

  // the entire block itself a default constructor
  // always invoked for any new object creation
  println("Product created", name, _price)
}

object ProductApp extends  App {
  val p1 = new Product();
  p1.name = "iPhone X"
  println("Name is ", p1.name);

  // p1._price = 10; // error, private

  p1.price = 100; // this calls the setter method price_= and pass value 100 as arg

  println("Price ", p1.price); // calls the getter price
}