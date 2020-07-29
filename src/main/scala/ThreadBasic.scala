import scala.collection.mutable._ // mutable collection

object  ThreadBasic extends  App {
  // JVM Thread
  // two approach

  var queue: Queue[Int] = Queue()

  class ProducerThread extends  Thread {
    override def run() = {
      var product = 0;
      // running on secondary/worker thread
      // thread start execution here
      // logic goes here
      println("Producer thread running");

      while (true) {
        println("Producing ", product)
        queue.enqueue(product)
        product += 1
        // Don't use this
        Thread.sleep(500)
      }


      println("Producer thread ending")
      // end of the function, threact exit
    }
  }

  class ConsumerThread extends  Runnable {
    override def run(): Unit = {
       println("Consumer thread running");
      while (true) {
        if (queue.isEmpty) {
          // pool, check, waste thread cycle
          // it check often, skip
          println("Queue is empty ")
        } else {
          var product = queue.dequeue()
          println("consumer product ", product)
        }

        Thread.sleep(2000)
      }
      println("Consumer thread ending")
    }
  }

  // Running on primary thread
  println("Primary Thread");

  val producerThread = new ProducerThread();
  producerThread.start(); // create thread, calls run method

  // for runnable thread
  var consumerThread = new Thread(new ConsumerThread()); // passing runnable instance
  consumerThread.start(); // run method

  println("Primary Thread ending...")
}
