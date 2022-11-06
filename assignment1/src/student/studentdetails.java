package student;

public class studentdetails {
	
	int age;
	int Roll_no;
	public void display1() {
		System.out.println("welcome every one");
	}
	public void display2() {
		System.out.println("Automation is easy");
	}
	public static void main(String[] args) {
		studentdetails ab= new studentdetails() ;
		ab.age=32;
		ab.Roll_no =17;
		ab.display1();
		ab.display2();
		System.out.println(ab.age);
		System.out.println(ab.Roll_no);
		
		
	}

}
