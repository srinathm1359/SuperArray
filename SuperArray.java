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
    resize();
    data[size] = element;
    size += 1;
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

  private void resize() {
    String[] array = new String[size + 1];
    for (int i = 0; i < size; i++) {
      array[i] = data[i];
    }
    data = array;
  }

  public void clear() {
    data = new String[10];
    size = 0;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public String toString() {
    if (size == 0) {
      return "[]";
    }
    String toReturn = "[";
    for (int i = 0; i < size; i++) {
      toReturn += data[i];
      if (i == size - 1) {
        toReturn += "]";
      } else {
        toReturn += ", ";
      }
    }
    return toReturn;
  }
}
