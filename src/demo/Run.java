package demo;

import java.util.HashMap;

public class Run {
  public static void main(String[] args) {
    int count = 0;
    Book book = new Book();
    HashMap<Integer, Person> personHashMap = new HashMap<>();
    for (int i = 1; i <= 100; i++) {
      personHashMap.put(i, new Person());
    }
    for (Person person : personHashMap.values()
    ) {
      count++;
      person.start();
      try {
        Thread.sleep(100);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
      if (count >= 50) {
        System.out.println("het sach");
        break;
      }
    }

  }
}
