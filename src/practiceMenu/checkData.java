package practiceMenu;

import java.util.Scanner;

public class checkData implements ICheckData {
	public int arr;
	public String ID;
	public String Name;
	public String Address;
	
	public checkData() {
		// TODO Auto-generated constructor stub
	}
	
	public int elementOfArray() {
		boolean check = true;
		while(check) {
			try {
				Scanner sc = new Scanner(System.in);
				arr = sc.nextInt();
				check = false;
			} catch (Exception e) {
				System.out.println("Xin moi nhap dung so luong phan tu: ");
				check = true;
			}
		}
		return arr;
	}
	
	public String checkID() {
		boolean check = true;
		while(check) {
			try {
				Scanner sc = new Scanner(System.in);
				ID = sc.nextLine();
				check = false;
			} catch (Exception e) {
				System.out.println("Xin moi nhap dung ID: ");
				check = true;
			}
		}
		return ID;
	}
	
	public String checkName() {
		boolean check = true;
		while(check) {
			try {
				Scanner sc = new Scanner(System.in);
				Name = sc.nextLine();
				check = false;
			} catch (Exception e) {
				System.out.println("Xin moi nhap dung Name: ");
				check = true;
			}
		}
		return Name;
	}
	
	public String checkAddress() {
		boolean check = true;
		while(check) {
			try {
				Scanner sc = new Scanner(System.in);
				Address = sc.nextLine();
				check = false;
			} catch (Exception e) {
				System.out.println("Xin moi nhap dung Address: ");
				check = true;
			}
		}
		return Address;
	}

}
