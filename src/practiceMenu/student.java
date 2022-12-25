package practiceMenu;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public String ID;
	public String Name;
	public String Address;
	public List<Student> list =new ArrayList<Student>();

	public Student() {}
	
	public Student(String ID, String Name, String Address) {
		this.ID = ID;
		this.Name = Name;
		this.Address = Address;
	}
	
	public Student(ArrayList<Student> list) {
		this.list = list;
	}
	
	public void addStudent() {
		CheckData cd = new CheckData();
		
		System.out.println("Nhap so luong sinh vien: ");
		int n = cd.checkIsIntType();
		while(n <= 0) {
			System.out.println("Xin moi nhap so luong phan tu > 0: ");
			n = cd.checkIsIntType();	
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i+1));
			System.out.println("Nhap ID: ");
			String ID = cd.checkIsStringType();
			System.out.println("Nhap ten: ");
			String Name = cd.checkIsStringType();
			System.out.println("Nhap dia chi: ");
			String Address = cd.checkIsStringType();
			Student s = new Student(ID, Name, Address);
			
		this.list.add(s);
		}
	}
	
	public void showListStudent() {
		for (Student student : list) {
			System.out.println(student);
		}
	}


	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", Address=" + Address + "]";
	}
}

//for(int i=0; i<list.size(); i++) {
//Student listStudent = list.get(i);
//System.out.println("Student [ID=" + listStudent.ID + ", Name=" + listStudent.Name + ", Address=" + listStudent.Address +"]");
//}
