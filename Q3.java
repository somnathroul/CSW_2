
import java.util.*;  
public class Q3{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Diwankar");  
v.add("Bhatnagar");  
v.add("Suman");  
v.add("Dandapat");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  