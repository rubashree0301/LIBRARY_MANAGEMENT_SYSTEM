package libpackage;
public class show{
	public static void customerShow() {
		for(Customer customer:Main.customerList) {
			System.out.println("customerName is"+customer.getName());
			System.out.println("customer id is"+customer.getCustomerId());
			
		}
	}
	public static void bookShow() {
		for(Book book:Main.bookList) {
			System.out.print("book name"+book.getBookName());
			System.out.print("book id"+book.getBookId());
			System.out.println("book count is"+book.getBookCount());
		}
	}
	
}