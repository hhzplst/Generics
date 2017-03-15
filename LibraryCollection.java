import java.util.ArrayList;

public class LibraryCollection<E> {
  private ArrayList<E> list = new ArrayList<>();

  public boolean add(E o) {
    return list.add(o);
  }

  public boolean addAll(LibraryCollection<? extends E> c) {
    if (c == null)
      throw new NullPointerException();
    for (E e : c)
      list.add(c);
    return true;
  } 

  public boolean remove(Object o) {
    return list.remove(o);
  }

  public void clear() {
    list.clear();
  }

  public boolean removeAll(LibraryCollection<? extends E> c) {
    for (E e : c) 
      if (list.contains(e))
        list.remove(e);

    return true;
  }

  public boolean retainAll(LibraryCollection<? extends E> c) {
    if (c == null)
      throw new NullPointerException();
    for (E e : list)
      if (!c.contains(e))
        list.remove(e);

    return true;
  }

  public boolean contains(Object o) {
    return list.contains(o);
  }

  public boolean containsAll(LibraryCollection<? extends E> c) {
    if (c == null)
      throw new NullPointerException();
    for (E e : c) {
      if (!list.contains(e))
        return false;
    }
    return true;
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public int size() {
    return list.size();
  }

  public Iterator<E> getIterator() {
    return new Iterator<E>() {
      int index = 0;
      public E getNext() {
        return list.get(index++);
      }
      public boolean hasNext() {
        return index != list.size();
      }
      public boolean isEmpty() {
        return list.size() == 0;
      }
    };
  }
}