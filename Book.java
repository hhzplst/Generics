public class Book extends LibraryItem implements Borrowable {
  private String title, publisher;

  public String getTitle() {
    return title;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setTitle(String t) {
    title = t;
  }

  public void setPublisher(String p) {
    publisher = p;
  }

  public Date getCheckoutDate() {
    return checkoutDate;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setCheckoutDate(Date d) {
    checkoutDate = d;
  }

  public void setDueDate(Date d) {
    dueDate = d;
  }
}