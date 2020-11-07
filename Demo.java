public class Demo {
  public static void removeDuplicates(SuperArray s) {
    for (int i = s.size() - 1; i >= 0; i--) {
      boolean isFirst = (s.indexOf(s.get(i)) == i);
      if (!isFirst) {
        s.remove(i);
      }
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    removeDuplicates(a);
    removeDuplicates(b);
    SuperArray overlap = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      String element = a.get(i);
      if (b.contains(element)) {
        overlap.add(element);
      }
    }
    return overlap;
  }
  public static SuperArray zip(SuperArray a, SuperArray b) {
    int size_a = a.size();
    int size_b = b.size();
    int min_size; int max_size;
    if (size_a < size_b) {
      min_size = size_a;
      max_size = size_b;
    } else {
      min_size = size_b;
      max_size = size_a;
    }
    SuperArray merged = new SuperArray(size_a + size_b);
    for (int i = 0; i < 2*min_size; i++) {
      if (i%2 == 0) {
        merged.add(a.get(i/2));
      }
      if (i%2 != 0) {
        merged.add(b.get(i/2));
      }
    }
    if (size_a == min_size) {
      for (int i = min_size; i < max_size; i++) {
        merged.add(b.get(i));
      }
    } else {
      for (int i = min_size; i < max_size; i++) {
        merged.add(a.get(i));
      }
    }
    return merged;
  }
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    // Testing findOverlap()
    SuperArray words2 = new SuperArray();
    words2.add("hello");  words2.add("ebi");     words2.add("una");
    words2.add("una");    words2.add("ebi");     words2.add("kani");    words2.add("una");
    words2.add("una");    words2.add("ebi");     words2.add("toro");
    System.out.println(words2);
    System.out.println(findOverlap(words, words2));
    // Testng zip()
    SuperArray fruits = new SuperArray();
    fruits.add("apple"); fruits.add("orange"); fruits.add("kiwi");
    fruits.add("apple"); fruits.add("orange"); fruits.add("banana");
    fruits.add("watermelon"); fruits.add("kiwi");
    System.out.println(fruits);
    System.out.println(zip(fruits, words));
    System.out.println(zip(words, fruits));
  }
}
