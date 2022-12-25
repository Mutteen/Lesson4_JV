package practiceMenu;

import java.util.Scanner;

public class CheckData implements ICheckData {	
	public int checkIsIntType() {
		int arrLength = 0;
		boolean check = true;
		while(check) {
			try {
				Scanner sc = new Scanner(System.in);
				arrLength = sc.nextInt();
				check = false;
			} catch (Exception e) {
				System.out.println("Xin moi nhap dung kieu du lieu: ");
				check = true;
			}
		}
		return arrLength;
	}
	
	public String checkIsStringType() {
		String stringInput = "";
		boolean check = true;
		while(check) {
			try {
				Scanner sc = new Scanner(System.in);
				stringInput = sc.nextLine();
				check = false;
			} catch (Exception e) {
				System.out.println("Xin moi nhap dung kieu du lieu: ");
				check = true;
			}
		}
		return stringInput;
	}
}
