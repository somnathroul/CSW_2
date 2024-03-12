
import java.util.*;  
class Q1{  
	
public static void main(String args[]){ 
	
ArrayList<String> list=new ArrayList<String>();  
list.add("Elephant");  
list.add("Murga");  
list.add("Lion");  
list.add("Tiger");  
  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  