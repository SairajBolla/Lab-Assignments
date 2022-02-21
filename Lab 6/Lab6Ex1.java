
import java.util.*;
import java.lang.*;
import java.util.Set;
import java.util.List;

public class Lab6Ex1{

	
	 static List getValues(HashMap map)
	{
            Collection collection = map.values();
		List  list =new ArrayList<>(collection);
		Collections.sort(list);	
		return list;
	}

	
	public static void main(String[] args)
	{

		HashMap hm = new HashMap();

		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);

		List list = getValues(hm);
       

		
	}
}
