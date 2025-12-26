package libpackage;

import java.util.*;
public class AdminMenu {
	public static void showAdminMenu() {
		int loop=1;
		Scanner scanner=new Scanner(System.in);
		while(loop==1) {
			System.out.println("press 1  create or add new book");
			System.out.println("press 2 to modify book count");
			System.out.println("press 3 to show all customers");
			System.out.println("press 4 to show all books");
			System.out.println("press 5 to exit");
			int choice=scanner.nextInt();
			switch(choice) {
				case 1:
					Book bookObj=GetInput.getBookDetails();
					Main.bookList.add(bookObj);
					Main.bookMap.put(bookObj.getBookId(), bookObj);
					break;
				case 2:
					System.out.println("enter Book id");
					int bookId=scanner.nextInt();
					bookObj=Main.bookMap.get(bookId);
					System.out.println("press 1 to add book count");
					System.out.println("press 2 to subtract book count");
					int option=scanner.nextInt();
					System.out.println("enter no of books");
					int number=scanner.nextInt();
					if(option==1) {
						bookObj.setBookCount(bookObj.getBookCount()+number);
					}
					else if(option==2){
						bookObj.setBookCount(bookObj.getBookCount()-number);
						
					}
					
					else {
						System.out.println("invalid choice");
					}	
					break;
				case 3:
					show.customerShow();
					break;
				case 4:
					show.bookShow();
					break;
				case 5:
					loop=0;
					break;
				default:
					break;
			}
			
		}
		
		
	}

}