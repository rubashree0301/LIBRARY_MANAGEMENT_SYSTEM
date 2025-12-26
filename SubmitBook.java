package libpackage;

import java.util.Scanner;
import java.time.LocalDate;

public class submitBook {
	public static boolean leapyear(int year) {
		if((year%4==0 && year%100!=0)||(year%400==0)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int dayDifference(LocalDate take,LocalDate submit) {
		int d1=take.getDayOfMonth();
		int d2=submit.getDayOfMonth();
		int m1=take.getMonthValue();
		int m2=submit.getMonthValue();
		int y1=take.getYear();
		int y2=submit.getYear();
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(leapyear(y1)) {
			daysInMonth[1]=29;
		}
		if(leapyear(y2)) {
			daysInMonth[1]=29;
		}
		int days=0;
		
		while(y1<y2 || m1<m2 || d1<d2 ) {
			d1++;
			days++;
			if(d1>daysInMonth[m1-1]) {
				d1=1;
				m1++;
			}
			if(m1>12) {
				m1=1;
				y1++;
				if(leapyear(y1)) {
					daysInMonth[1]=29;
				}
				else {
					daysInMonth[1]=28;
				}
			}	
		}
		return days;		
	}
	public static int  fineCheck(LocalDate entry,LocalDate submit) {
		int days=submitBook.dayDifference(entry,submit);
		int fine=0;
		if(days>20) {
			fine=(days-20)*2;
		}
		return fine;
		
	}
	public static void bookSubmit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book id");
		int bookId=sc.nextInt();
		System.out.println("enter customer id");
		int customerId=sc.nextInt();
		System.out.println("enter Taken entry id");
		int entryId=sc.nextInt();
		System.out.println("enter submit date");
		int date=sc.nextInt();
		System.out.println("enter submit month");
		int month=sc.nextInt();
		System.out.println("enter submit year");
		int year=sc.nextInt();
		libraryEntry entryObj=entryManage.mapEntry.get(entryId);
		LocalDate submitDate=LocalDate.of(year, month, date);
		Book book=Main.bookMap.get(bookId);
		book.setBookCount(book.getBookCount()+1);
		int fine=submitBook.fineCheck(entryObj.getDate(),submitDate);
		if(fine==0) {
			System.out.println("you are on correct date");
		}
		else {
			System.out.println("your are late .need to pay fine"+fine);
		}
	}
}