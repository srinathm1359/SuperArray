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
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Index " + index + " must be in between 0 and " + (size() - 1) + " inclusive.");
    }
    return data[index];
  }

  public String set(int index, String element) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Index " + index + " must be in between 0 and " + (size() - 1) + " inclusive.");
    }
    String toReturn = data[index];
    data[index] = element;
    return toReturn;
  }

  private void resize() {
    String[] array = new String[size + size / 10];
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

  public boolean contains(String s) {
    for (int i = 0; i < size; i++) {
      if (s.equals(data[i])) {
        return true;
      }
    }
    return false;
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("Initial Capacity " + initialCapacity + " cannot be negative");
    }
    data = new String[initialCapacity];
    size = 0;
  }

  public void add(int index, String element) {
    if (index < 0 || index > size()) {
      throw new IndexOutOfBoundsException("Index " + index + " must be in between 0 and " + size() + " inclusive.");
    }
    if (size == data.length) {
      resize();
    }
      String[] data_afterAdd = new String[size - index];
      for (int i = 0; i < data_afterAdd.length; i++) {
        data_afterAdd[i] = data[i + index];
      }
      data[index] = element;
      for (int i = index + 1; i < size + 1; i++) {
        data[i] = data_afterAdd[i - index - 1];
      }
      size++;
    }

  public String remove(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Index " + index + " must be in between 0 and " + (size() - 1) + " inclusive.");
    }
    if (size > index) {
      String[] second_data = new String[data.length - 1];
      for (int i = 0; i < index; i++) {
        second_data[i] = data[i];
      }
      for (int i = index; i < data.length - 1; i++) {
        second_data[i] = data[i+1];
      }
      String value = data[index];
      data = second_data;
      size--;
      return value;
    }
    size--;
    return null;
  }

  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String[] arrayForm = new String[size];
    for (int i = 0; i < size; i++) {
      arrayForm[i] = data[i];
    }
    return arrayForm;
  }

  public int lastIndexOf(String value) {
    for (int i = size - 1; i >= 0; i--) {
      if (data[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other) {
    if (size != other.size()) {
      return false;
    }
    for (int i = 0; i < size; i++) {
      if (data[i] != other.get(i)) {
        return false;
      }
    }
    return true;
  }
}
