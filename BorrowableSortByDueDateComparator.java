import java.util.Comparator;

public class BorrowableSortByDueDateComparator implements Comparator<Borrowable> {
  public int compare(Borrowable b1, Borrowable b2) {
    return b1.getDueDate().compareTo(b2.getDueDate());
  }
}