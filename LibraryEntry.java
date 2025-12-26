package libpackage;
import java.time.LocalDate;
//import java.util.Date;
public class libraryEntry {
	private int customerId;
	private int bookId;
	private LocalDate date;
	private String status;
	private int entryId;
	public int getEntryId() {
		return entryId;
	}
	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public libraryEntry(int entryId,int customerId, int bookId,String status) {
		this.entryId=entryId;
		this.customerId = customerId;
		this.bookId = bookId;
		this.date=LocalDate.now();
		this.status=status;
		
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	

}