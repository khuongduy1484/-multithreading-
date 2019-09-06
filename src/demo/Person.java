package demo;

import java.util.concurrent.Semaphore;

public class Person extends Thread {
  public Book book = new Book();
  Semaphore semaphore = new Semaphore(50);

  @Override
  public void run() {
    try {
      semaphore.acquire();
      System.out.println(Thread.currentThread().getName());
      book.borrowBook();
      semaphore.release();
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
