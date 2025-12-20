public class LOAN {

    private Integer loanId;
    private String borrowDate;
    private String returnDate;

    public MEMBER borrows;
    public BOOK involvedIn;

    private boolean isActive;

    public LOAN(Integer loanId, MEMBER member, BOOK book, String borrowDate) {
        this.loanId = loanId;
        this.borrows = member;
        this.involvedIn = book;
        this.borrowDate = borrowDate;
        this.isActive = false;
    }

    public void borrowBook() {
        if (borrows == null || involvedIn == null || involvedIn.isAvailable() == false)
            return;

        involvedIn.setAvailable(false);
        isActive = true;
    }

    public void returnBook(String returnDate) {
        if (isActive == false)
            return;

        this.returnDate = returnDate;
        involvedIn.setAvailable(true);
        isActive = false;
    }
}
