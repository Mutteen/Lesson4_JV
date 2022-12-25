package practiceMenu;

public class Program {
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		int select =0;
		Student sv = new Student();
		do {
			select = menu.getMenu();
			switch(select) {
			case 1:
				menu.s1();
				break;
			case 2:
				menu.s2(sv);
				break;
			case 3: 
				menu.s3(sv);
				break;
			case 4:
				break;
			default:
				System.out.println("Nhap dung menu: ");
				break;				
			}
		}while(select != 4);
		
	}
	

}
