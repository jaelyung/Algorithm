import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
	private String name;
	private String no;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Student() {}
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + "]";
	}

	public static void main(String[] args) {
		
		Student s1=new Student("홍길동1", "0817");
		Student s2=new Student("홍길동2", "0818");
		Student s3=new Student("홍길동3", "0819");
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
//		for(Student list: students) {
//			System.out.println(s1.getName());
//			System.out.println(list.toString());
//		}
	
		Scanner sc = new Scanner(System.in);
		System.out.println("검색을 시작합니다.");
		
		
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("계속 검색을 하고 싶으시면 y, 종료하시려면 n을 입력해주세요");
			String input = sc.nextLine();
			if(input.equals("y")) {
				System.out.println("검색할 이름을 입력하세요");
				String sName=sc.nextLine();
				int count=0;
				for(Student list: students) {
					if(sName.equals(list.getName())) {
						System.out.println("해당 학생의 학번: " +list.getNo());
						count++;
					}
				}
				if(count==0) {
					System.out.println("해당 학생이 없습니다.");
				}
			}else if(input.equals("n")) {
				flag = false;
			}else {
				System.out.println("잘못 누르셨습니다.");
			}
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
		
		
	}
	
}
