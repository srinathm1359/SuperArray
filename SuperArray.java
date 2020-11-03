public class SuperArray {
  private String[] data;
  private int size; //The current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size < data.length) {
      data[size] = element;
      size +=  1;
      return true;
    }
    return true;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String toReturn = data[index];
    data[index] = element;
    return toReturn;
  }
}
