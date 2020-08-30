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
		
		Student s1=new Student("ȫ�浿1", "0817");
		Student s2=new Student("ȫ�浿2", "0818");
		Student s3=new Student("ȫ�浿3", "0819");
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
//		for(Student list: students) {
//			System.out.println(s1.getName());
//			System.out.println(list.toString());
//		}
	
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� �����մϴ�.");
		
		
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("��� �˻��� �ϰ� �����ø� y, �����Ͻ÷��� n�� �Է����ּ���");
			String input = sc.nextLine();
			if(input.equals("y")) {
				System.out.println("�˻��� �̸��� �Է��ϼ���");
				String sName=sc.nextLine();
				int count=0;
				for(Student list: students) {
					if(sName.equals(list.getName())) {
						System.out.println("�ش� �л��� �й�: " +list.getNo());
						count++;
					}
				}
				if(count==0) {
					System.out.println("�ش� �л��� �����ϴ�.");
				}
			}else if(input.equals("n")) {
				flag = false;
			}else {
				System.out.println("�߸� �����̽��ϴ�.");
			}
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		
		
	}
	
}
