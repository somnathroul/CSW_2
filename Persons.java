import java.math.BigInteger;
import java.util.*;
class person{
	private String name;
	private String address;
	private BigInteger phone_no;
	public person(String name,String address,BigInteger phone_no){
		this.name=name;
		this.address=address;
		this.phone_no=phone_no;
	}
	public String getname(){
		return name;
	}
	public String getaddress() {
		return address;
	}
	public BigInteger getnumber() {
		return phone_no;
	}
	public void setname(String name) {
		name=name;
	}
	public void setaddress(String address) {
		address=address;
	}
	public void setnumber(BigInteger phone_no) {
		phone_no=phone_no;
	}
	public String toString() {
		return name + " @ " + phone_no;
	}
	public int hashcode() {
		final int prime = 31;
		int result=1;
		result= prime*result+phone_no.intValue();
		result=prime*result+((name==null)? 0:name.hashCode());
		return result;
	}
	public boolean equals(person other) {
		boolean isNameEqual=name.equals(other.name);
		boolean isAddressEqual=address.equals(other.address);
		boolean isPhoneEqual=phone_no.equals(other.phone_no);
		if(isNameEqual && isAddressEqual && isPhoneEqual) {
			return true;
		}
		else {
			return false;
		}
	}
}
class student extends person{
	private String name;
	private BigInteger roll;
	public student(String name, BigInteger roll) {
		super(name,null,null);
		this.name=name;
		this.roll=roll;
	}
	public String getname(){
		return name;
	}
	public BigInteger getnumber() {
		return roll;
	}
	public void setname(String sname) {
		name=name;
	}
	public void setnumber(BigInteger roll) {
		roll=roll;
	}
	public String toString() {
		return name + " @ " + roll;
	}
	public int hashcode() {
		final int prime = 31;
		int result=1;
		result= prime*result+roll.intValue();
		result=prime*result+((name==null)? 0:name.hashCode());
		return result;
	}
	public boolean equals(student other) {
		boolean isNameEqual=name.equals(other.name);
		boolean isRollEqual=roll.equals(other.roll);
		if(isNameEqual && isRollEqual) {
			return true;
		}
		else {
			return false;
			
		}
	}
}
public class Persons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1 = new person("Pranab", "cuttack", new BigInteger("9861303400"));
		person p2 = new person("Shivam", "Baripada" , new BigInteger("7978659260") );
		student s1= new student("somnath" ,new BigInteger("2241018129"));
		student s2= new student("somnath" ,new BigInteger("2241018129"));
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println( p1.hashcode());
		System.out.println(p2.hashcode());
		System.out.println(s1.hashcode());
		System.out.println(s2.hashcode());
		System.out.println(p1.equals(p2));
		System.out.println(s1.equals(s2));
	}

}
