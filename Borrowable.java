public interface Borrowable {
  Date getCheckoutDate();
  Date getDueDate();
  void setCheckoutDate(Date d);
  void setDueDate(Date d);
}