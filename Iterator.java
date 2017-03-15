public interface Iterator<E> {
  E getNext();
  boolean hasNext();
  boolean isEmpty();
}