package libpackage;

public class Validation {
	
	public static Boolean validateEmail(String email) {
		int index=email.indexOf('@');
		if(index==-1) {
			
			return false;
		}
		String first=email.substring(0, index+1);
		String last=email.substring(index+1,email.length());
		if(first.length()==0) {
			return false;
		}
		if(!last.equals("gmail.com")) {
			return false;
		}
		return true;
		
	}
	public static Boolean validatePhoneno(String phoneno){
		int n=phoneno.length();
		if(n<10) {
			return false;
		}
		for(int i=0;i<n;i++) {
			if(phoneno.charAt(i)>='0' && phoneno.charAt(i)<='9') {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
		
	}

}