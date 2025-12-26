package libpackage;
import java.util.*;
public class GetBook {
	public static void getbook() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter customerId");
		int customerId=scanner.nextInt();
		
		System.out.println("enter bookId");
		int bookId=scanner.nextInt();
		Book book=Main.bookMap.get(bookId);
		if(book.getBookCount()<=0) {
			System.out.println("sorry.. This book is not currently available..out of stock . view availability list ");		
		}
		else {
			book.setBookCount(book.getBookCount()-1);
			entryManage.takeEntry(customerId,bookId,"take");
			
		}
	}

}