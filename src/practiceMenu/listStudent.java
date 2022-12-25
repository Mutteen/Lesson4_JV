package practiceMenu;

import java.util.ArrayList;

public class listStudent {
	private ArrayList<student> list;
	
	public listStudent(ArrayList<student> list) {
		this.list = list;
	}

	public listStudent() {
		this.list = new ArrayList<student>();
	}
	
	public void addStudent(student s) {
		this.list.add(s);
	}
	
	public void showListStudent() {
		for(int i=0; i<list.size(); i++) {
			student listStudent = list.get(i);
			System.out.println("Student [ID=" + listStudent.ID + ", Name=" + listStudent.Name + ", Address=" + listStudent.Address +"]");
		}
	}
}
