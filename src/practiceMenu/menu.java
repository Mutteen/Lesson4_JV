package practiceMenu;

import java.util.Scanner;

public class menu {
	static listStudent ls = new listStudent();
	public menu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int select;
		
		do {
			select = getMenu();
			switch(select) {
			case 1:
				s1();
				break;
			case 2:
				s2();
				break;
			case 3: 
				s3();
				break;
			case 4:
				System.out.println("Bye");
				select = 5;
				break;
			}
		}while(select <= 4);
		
	}
	
	public static int getMenu() {
		int select;
		System.out.println("\nXin moi nhap lua chon!");
		System.out.println("1.Nhap gia tri va sap xep gia tri");
		System.out.println("2.Nhap sinh vien");
		System.out.println("3.In danh sach sinh vien");
		System.out.println("4.Thoat");
		
		Scanner sc = new Scanner(System.in);
		checkData c = new checkData();
		select = c.elementOfArray();
		
		return select;
	}
	
	public static void s1() {
		int arr;
		checkData c1 = new checkData();
		System.out.println("Nhap so luong phan tu: ");
		arr = c1.elementOfArray();		
		while(arr <= 0) {
			System.out.println("Xin moi nhap so luong phan tu > 0: ");
			arr = c1.elementOfArray();		
		}
		
		int[] array = new int[arr];
		
		for(int i=0; i< arr; i++) {
			System.out.println("Nhap phan tu thu " + (i+1));
			array[i]=c1.elementOfArray();
		}

		for(int i=0; i<arr; i++) {
			for(int j=0; j<arr-i-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j]= array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.println("Day so sau khi duoc sap xep la ");
		for(int i=0; i< arr; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void s2() {
		checkData cd = new checkData();
		
		System.out.println("Nhap so luong sinh vien: ");
		int quantityStudent = cd.elementOfArray();
		
		for(int i=0; i<quantityStudent; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i+1));
			System.out.println("Nhap ID: ");
			String ID = cd.checkID();
			System.out.println("Nhap ten: ");
			String Name = cd.checkName();
			System.out.println("Nhap dia chi: ");
			String Address = cd.checkAddress();
			student s = new student(ID, Name, Address);
			
			ls.addStudent(s);
		}		
	}

	public static void s3() {
		System.out.println("Danh sach sinh vien la: ");
		ls.showListStudent();
	}
}
