interface topic {
	public boolean understood();
	public int getDuration();
}
class topic1 implements topic{
	public String title;
	public int duration;
	public topic1(String title, int duration) {
		this.title=title;
		this.duration=duration;
	}
	public boolean understood() {
		return true;
	}
	public int getDuration() {
		return this.duration;
	}
}
class topic2 implements topic{
	public String title;
	public int duration;
	public topic2(String title, int duration) {
		this.title=title;
		this.duration=duration;
	}
	public boolean understood() {
		return true;
	}
	public int getDuration() {
		return this.duration;
	}
	}
	class subject{
		public String subname;
		public int subduration;
		public topic t1,t2;
		public subject(String subname) {
			this.subname=subname;
			this.t1=new topic1("oops", 5);
			this.t2=new topic2("control flow" , 3);
			this.subduration=this.t1.getDuration()+ this.t2.getDuration();
		}
		public boolean startReading() {
			return t1.understood();
		}
	}

public class coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subject s1= new subject("java");
		s1.startReading();
	}

}
