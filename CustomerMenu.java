package libpackage;

import java.util.Scanner;

public class CustomerMenu {
	public static void showCustomerMenu() {
		Scanner scanner =new Scanner(System.in);
		int loop=1;
		while(loop==1) {
			System.out.println("press 1 to getbook");
			System.out.println("press 2 to submitbook");
			System.out.println("press 3 to show all book details");
			System.out.println("press 4 to exit");
			int choice=scanner.nextInt();
			switch(choice) {
				case 1:
					GetBook.getbook();
					break;
				case 2:
					submitBook.bookSubmit();
					break;
				case 3:
					show.bookShow();
					break;
				case 4:
					loop=0;
					break;
				default:
					break;
			}
		}
	}

}