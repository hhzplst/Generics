public class Book extends LibraryItem implements Borrowable {
  public Date getCheckoutDate() {
    return checkoutDate;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setCheckoutDate(Date d) {

  }

  public void setDueDate(Date d) {

  }
}