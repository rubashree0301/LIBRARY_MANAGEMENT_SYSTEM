package libpackage;
import java.util.*;
public class GetInput {
	public static int customerId=0;
	public static int bookId=0;
	public static Customer getCustomerDetails() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter name");
		String name=scanner.next();
		System.out.println("enter email in 'abc@gmail.com' format");
		String email=scanner.next();
		while (!Validation.validateEmail(email)) {
			System.out.println("your mail is not in above format.Enter again..");
			email=scanner.next();
		}
		System.out.println("enter your password");
		String password=scanner.next();
		System.out.println("confirm your password");
		String confirmPassword=scanner.next();
		while(!password.equals(confirmPassword)){
			System.out.println(" your password not match re-enter your password");
			password=scanner.next();
			System.out.println("confirm your password");
			confirmPassword=scanner.next();
		}
		
		System.out.println("enter phoneno 'format':6382255329");
		String phoneno=scanner.next();
		while(!Validation.validatePhoneno(phoneno)) {
			System.out.println("your phoneno is not in above format.Enter again..");
			phoneno=scanner.next();
		}
		Customer obj=new Customer(customerId++,name,email,password,phoneno);
		System.out.println("customer account created successfully");
		return obj;
		
	}
	
	public static Book getBookDetails() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter book name");
		String bookName=scanner.nextLine();
		System.out.println("enter author");
		String author=scanner.nextLine();
		System.out.println("enter genre name");
		String genre=scanner.nextLine();
		
		System.out.println("enter rating");
		int rating =scanner.nextInt();
		System.out.println("enter book count");
		int bookCount=scanner.nextInt();
		Book obj=new Book(bookId++,bookName,author,genre,rating,bookCount);
		return obj;
	}
}