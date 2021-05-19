import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		
	
	String test="I am VK and I am a programmer ";
	String str=test.replaceAll("[^A-Za-z ]", "");
	HashMap<String,Integer> hm=new HashMap<>();
	String arr[]=str.split(" ");
	Set<String> st=new HashSet<String>();
	for(String ar:arr)
	{
		
		if(hm.containsKey(ar))
		{
			hm.put(ar, hm.get(ar)+1);
		}else
		{
			hm.put(ar, 1);
		}
		
		
	}
	
	
	System.out.println("After   "+hm);
	
	Iterator<String> itr=hm.keySet().iterator();
	
	while(itr.hasNext())
	{
		String key=itr.next();
		if(hm.get(key) > 1)
		{
			System.out.println(key +"  is duplicated "+ hm.get(key)+"  times");
		}
		
		
		
	}
	
	
	}

}
