package practiceMenu;

import java.util.Scanner;

public class Menu {

	public int getMenu() {
		int select;
		System.out.println("\nXin moi nhap lua chon!\n"
							+ "1.Nhap gia tri va sap xep gia tri tang dan\n"
							+ "2.Nhap sinh vien\n"
							+ "3.In danh sach sinh vien\n"
							+ "4.Thoat");
		Scanner sc = new Scanner(System.in);
		CheckData c = new CheckData();
		select = c.checkIsIntType();
		
		return select;
	}
	
	//1.Nhap gia tri va sap xep gia tri
	public void s1() {
		int arrLength;
		CheckData c1 = new CheckData();
		System.out.println("Nhap so luong phan tu: ");
		arrLength = c1.checkIsIntType();		
		while(arrLength <= 0) {
			System.out.println("Xin moi nhap so luong phan tu > 0: ");
			arrLength = c1.checkIsIntType();		
		}
		
		int[] array = new int[arrLength];
		
		for(int i=0; i< arrLength; i++) {
			System.out.println("Nhap phan tu thu " + (i+1));
			array[i]=c1.checkIsIntType();
		}

		for(int i=0; i<arrLength; i++) {
			for(int j=0; j<arrLength-i-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j]= array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.println("Day so sau khi duoc sap xep la ");
		for(int i=0; i< arrLength; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	//2.Nhap sinh vien
	public void s2(Student sv) {
		sv.addStudent();
	}

	public void s3(Student sv) {
		System.out.println("Danh sach sinh vien la: ");
		sv.showListStudent();
	}
}
