package libpackage;
import java.util.*;
public class entryManage {
	public static int entryId=0;
	public static ArrayList<libraryEntry> entryList=new ArrayList<>();
	public static HashMap<Integer,libraryEntry> mapEntry=new HashMap<>();
	public static void takeEntry(int customerId,int bookId,String status) {
		libraryEntry entry=new libraryEntry(entryId++,customerId,bookId,status);
		String s=entry.getEntryId()+" "+entry.getCustomerId()+" "+entry.getBookId()+" "+entry.getStatus();
		FileHandler.writeFile(entry.getBookId(),s);
		entryList.add(entry);
		mapEntry.put(entry.getEntryId(),entry);
		
	}
	
}