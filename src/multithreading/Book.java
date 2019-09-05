package multithreading;

import java.util.concurrent.Semaphore;

public class Book {
  Semaphore semaphore = new Semaphore(50);

  public Book() {
  }

  public void borrowBook(int stt,int userId) {
      try {
        semaphore.acquire();
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("user " + userId + " da muon" +" sach " + stt);

    try {
      Thread.sleep(10000);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
      semaphore.release();
  }

}
