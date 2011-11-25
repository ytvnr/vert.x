import org.vertx.java.core.app.VertxApp
import java.util.concurrent.atomic.AtomicLong;

class EchoServer implements VertxApp {

  static AtomicLong counter = new AtomicLong(0)

  void start() {
    println "in groovy start " + counter.incrementAndGet()
  }

  void stop() {
    println "in groovy stop"
  }

}