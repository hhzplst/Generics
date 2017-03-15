public abstract class LibraryItem {
  private int id;
  private String description;
  protected Date checkoutDate, dueDate;
  private static int next_ID = 0;

  public LibraryItem() {
    id = ++next_ID;
  }

  public void setDescription(String s) {
    description = s;
  }

  public String getDescription() {
    return description;
  }
}