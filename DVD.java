public class DVD extends LibraryItem implements Borrowable {
  private String format;

  public String getFormat() {
    return format;
  }

  public void setFormat(String f) {
    format = f;
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