package map;
import java.util.*;  
class ComparingByKeyExample{  
 public static void main(String args[]){  
	 HashMap<Integer,String> map=new HashMap<Integer,String>();
	 map.put(55,"Sammit");
	 map.put(26,"Pooja");
	 map.put(27, "Prince");
	 map.put(38, "Krishna");
	 map.put(41, "Hari");
	 map.put(25,"Aman");
	 map.put(33, "Arjun");
	 map.put(44, "Sammar");
	 map.put(10, "Sita");
	 map.put(29, "Gita");
	 map.put(23, "Sharma");	
	 
	 for(Map.Entry m:map.entrySet()) {
		 System.out.println(m.getKey()+" "+m.getValue());
	 }
  


	 
	 for(Map.Entry m:map.entrySet()) {
		 System.out.println(m.getKey()+" "+m.getValue());
	 }
	 
	 
	 map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	  
  
  
 }  
}  