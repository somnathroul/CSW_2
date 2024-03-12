
import java.util.*;  
public class Q2{  
public static void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
al.add("Harish");  
al.add("Mahto");  
al.add("Bom");  
al.add("Dandia");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  