
public class Tester {
  public static void main(String[] args) {
    SuperArray first_dynamic = new SuperArray();
    //Testing size()
    System.out.println(first_dynamic.size());
    //Testing add()
    first_dynamic.add("Hello");
    first_dynamic.add("Hello again!");
    System.out.println(first_dynamic.size());
    //Testing get()
    System.out.println(first_dynamic.get(0));
    System.out.println(first_dynamic.get(1));
    System.out.println(first_dynamic.get(2));
    //Testing set()
    System.out.println(first_dynamic.set(0,"Bye!"));
    System.out.println(first_dynamic.set(0,"Hello"));
    //Testing resize() and revised add()
    first_dynamic.add("alphabet");
    System.out.println(first_dynamic.size());
    first_dynamic.add("albatross");
    System.out.println(first_dynamic.size());
    first_dynamic.add("hyena");
    System.out.println(first_dynamic.size());
    first_dynamic.add("crocodile");
    System.out.println(first_dynamic.size());
    first_dynamic.add("zebra");
    System.out.println(first_dynamic.size());
    first_dynamic.add("lion");
    System.out.println(first_dynamic.size());
    first_dynamic.add("gorilla");
    System.out.println(first_dynamic.size());
    first_dynamic.add("giraffe");
    System.out.println(first_dynamic.size());
    first_dynamic.add("horse");
    System.out.println(first_dynamic.size());
    first_dynamic.add("anteater");
    //Should print 12 entries
    System.out.println(first_dynamic.size());
    for (int i = 0; i < first_dynamic.size(); i++) {
      System.out.println(first_dynamic.get(i));
    }
    //Test clear()
    first_dynamic.clear();
    System.out.println(first_dynamic.size());
    //Test isEmpty()
    System.out.println(first_dynamic.isEmpty());
    first_dynamic.add("apple");
    System.out.println(first_dynamic.isEmpty());
    //Test toString()
    System.out.println(first_dynamic.toString());
    first_dynamic.add("banana");
    first_dynamic.add("watermelon");
    first_dynamic.add("kiwi");
    System.out.println(first_dynamic.toString());
    first_dynamic.clear();
    System.out.println(first_dynamic.toString());
  }
}
