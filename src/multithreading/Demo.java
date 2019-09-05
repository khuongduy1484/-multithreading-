package multithreading;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo {
  public static void main(String[] args) {
    Random books = new Random();
Book book = new Book();
    ExecutorService executorService = Executors.newCachedThreadPool();

      for (int j = 1; j <= 1000; j++) {
        int userId = j;
        executorService.submit(new Runnable() {
          @Override
          public void run()
          {
            book.borrowBook(books.nextInt(50),userId);
          }
        });
      }
    executorService.shutdown();
    try {
      executorService.awaitTermination(1, TimeUnit.DAYS);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
