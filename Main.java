package libpackage;
import java.util.*;

public class Main {
	private static final String adminEmail="rubashree0301@gmail.com";
	private static final String adminPassword="Abishree#03";
	public static ArrayList<Customer> customerList=new ArrayList<>();
	public static ArrayList<Book>  bookList=new ArrayList<>();
	public static HashMap<Integer,Book> bookMap=new HashMap<>();
	public static HashMap<Integer,Customer> customerMap=new HashMap<>();
	
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		int loop=1;
		while(loop==1){
			System.out.println("press 1 to create customer account");
			System.out.println("press 2 to login customer account");
			System.out.println("press 3 to admin login ");
			
			System.out.println("press 4 to exit");
			try {
				int choice=scanner.nextInt();
				switch(choice) {
					case 1:
						Customer cust=GetInput.getCustomerDetails();
						customerList.add(cust);
						customerMap.put(cust.getCustomerId(), cust);
						break;
					case 2:
						System.out.println("enter customerId");
						int customerId=scanner.nextInt();
						System.out.println("enter password");
						String password=scanner.next();
						boolean login=CustomerLogin.login(customerId,password);
						if(login==true) {
							System.out.println("login success");
							CustomerMenu.showCustomerMenu();
						}
						else {
							System.out.println("login failed. customerid and password not matching");
						}
						break;
					case 3:
						System.out.println("enter admin email id");
						String emailAdmin=scanner.next();
						System.out.println("enter admin pasword");
						String passwordAdmin=scanner.next();
						if(emailAdmin.equals(adminEmail) && passwordAdmin.equals(adminPassword)) {
							System.out.println("Admin login success");
							AdminMenu.showAdminMenu();
						}
						else {
							System.out.println("Admin login failed");
						}
						break;
					case 4:
						loop=0;
						break;
					default :
						break;		
				}
			}
			catch(Exception e){
				System.out.print(e.getMessage());
				
			}
		}
			
		
	}

}