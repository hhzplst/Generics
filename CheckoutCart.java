import java.util.Collections;
import java.util.ArrayList;

public class CheckoutCart<E extends Borrowable> extends LibraryCollection<E> {

  public Iterator<E> getDueDateIterator() {
    Collections.sort(list, new BorrowableSortByDueDateComparator());
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

   public Book[] getOverDueBooks(Date d) {
     ArrayList<Book> result = new ArrayList<>();

     Iterator<E> it = getDueDateIterator();
     while(it.hasNext()) {
      E e = it.getNext();
      if (e instanceof Book)
        if(e.getDueDate().before(d))
          result.add((Book)e);
     }
     return (Book[])result.toArray();
   }
}