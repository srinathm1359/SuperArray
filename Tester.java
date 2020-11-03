
public class Tester {
  public static void main(String[] args) {
    SuperArray first_dynamic = new SuperArray();
    System.out.println(first_dynamic.size());
    first_dynamic.add("Hello");
    first_dynamic.add("Hello again!");
    System.out.println(first_dynamic.size());
  }
}
