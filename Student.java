
public class Student {
	String name;
	int age;
	int RollNo;
	String branch;
	int LRollno;
	public Student() {
		name="";
		age =0;
		RollNo=0;
		branch="";
		LRollno=0;
	}
	public Student(int Rollno,String name) {
		this.RollNo=Rollno;
		this.name=name;
	}
	

	public static void main(String[] args) {
		Student[] s=new Student[5];
		int LRollno=1;
		for(int i =0;i<5;i++) {
			
			s[i]=new Student(LRollno,"Noor");
			LRollno++;
			
		}
		for(int i=0;i<5;i++) {
			System.out.println(s[i].name+" "+s[i].RollNo);
		}
		
	}

}
