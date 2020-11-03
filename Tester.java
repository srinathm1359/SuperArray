
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
  }
}
