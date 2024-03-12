import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		for(int i:li) {
			System.out.println(i);
		}
	}

}
