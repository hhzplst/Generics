public class Magazine extends LibraryItem {
  private Date issue;
  private String category;

  public Date getIssueDate() {
    return issue;
  }

  public String getcategory() {
    return category;
  }

  public void setIssueDate(Date i) {
    issue = i;
  }
  
}