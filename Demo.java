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
  }
}
