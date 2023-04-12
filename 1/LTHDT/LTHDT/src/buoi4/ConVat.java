package buoi4;

import java.util.Scanner;

public abstract class ConVat{
	private String giong, mauLong;
	private float canNang;
	public abstract void keu();
	
	public ConVat() {
		giong = new String();
		mauLong = new String();
		canNang = 0.0f;
	}
	public ConVat(ConVat cV) {
		giong = new String(cV.giong);
		mauLong = new String(cV.mauLong);
		canNang = cV.canNang;
	}
	public ConVat(String giong1, String mauLong1,float canNang1) {
		giong = new String(giong1);
		mauLong = new String(mauLong1);
		canNang = canNang1;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap giong: ");
		giong = sc.nextLine();
		System.out.println("Nhap mau long: ");
		mauLong = sc.nextLine();
		System.out.println("Nhap can nang: ");
		canNang = sc.nextFloat(); sc.nextLine();
	}
	public void in() {
		System.out.println("Giong: "+giong+"\nMau long"+mauLong+"\nCan nang"+canNang);
	}
	public String toString() {
		return "Giong: "+giong+"\nMau long: "+mauLong+"\nCan nang: "+canNang;
	}
	
}
