package libpackage;

public class CustomerLogin {
 public static boolean login(int customerId,String password){
	 Customer cust=Main.customerMap.get(customerId);
	 if(cust.getPassword().endsWith(password)) {
		 return true;
	 }
	 
	 return false;
 }
}