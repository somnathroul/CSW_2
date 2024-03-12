
import java.util.*;  
public class Q4{  
public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("Shubham");  
stack.push("Shivam");  
stack.push("Debyoti");  
stack.push("Lagana");  
stack.push("Chota Don");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  