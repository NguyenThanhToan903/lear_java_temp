package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
	private String mSSV, hoTen;
	private Date ngSinh;
	private int n;
	private String mon[], diem[];
	private final int max = 50;
	
	public SinhVien() {
		mSSV = new String();
		hoTen = new String();
		ngSinh = new Date();
		n = 0;
		mon = new String[max];
		diem = new String[max];
	}
	public SinhVien(String mssv, String ht, int d1,int m1, int y1,int n1, String mon1, String diem1) {
		mSSV = new String(mssv);
		hoTen = new String(ht);
		ngSinh = new Date(d1, m1, y1);
		n = n1;
		mon = new String[max];
		diem = new String[max];
		mon[0] = mon1;
		diem[0] = diem1;
		
	}
	public SinhVien(SinhVien S) {
		mSSV = new String(S.mSSV);
		hoTen = new String(S.hoTen);
		ngSinh = new Date(S.ngSinh);
		n = S.n;
		mon = new String[max];
		diem = new String[max];
		for(int i = 0; i<n; i++){
			mon[i] = new String(S.mon[i]);
			diem[i] =new String(S.diem[i]);
		}
	}
	public void  nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap MSSV: "); mSSV = sc.nextLine();
		System.out.println("Nhap Ho Ten: "); hoTen = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");ngSinh.nhapDate();
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so mon: ");n = sc.nextInt(); sc.nextLine();
		for(int i=0; i<n; i++){
			System.out.println("Nhap mon thu "+(i+1)+": "); mon[i] = sc.nextLine();
			System.out.println("Nhap diem thu "+(i+1)+": "); diem[i] = sc.nextLine();
			
		}
	}
	
	public String toString() {
		String sv = new String();
		sv += "MSSV: "+mSSV+" ";
		sv += "HO Ten: "+hoTen+"\n";
		sv += "Ngay thang nam sinh: "+ngSinh.toString();
		sv += "\nSo HP: "+n+"\n";
		for(int i=0; i<n; i++){
			sv += "Mon "+mon[i]+": "+diem[i]+".\n";
		}
//		sv += "Dien TB: "+diemTB();
		return sv;
	}
	public float diemTB() {
		float tb = 0.0f;
		for(int i=0; i<n; i++){
			if(diem[i].equals("A")) tb += 4.0;
			else if(diem[i].equals("B+")) tb +=3.5;
			else if(diem[i].equals("B")) tb +=3;
			else if(diem[i].equals("C+")) tb +=2.5;
			else if(diem[i].equals("C")) tb +=2;
			else if(diem[i].equals("D+")) tb +=1.5;
			else if(diem[i].equals("D")) tb +=1;
			else tb +=0;
		}
		return tb/n;
	}
	
	public void them(String m, String d) {
		if(n<max){
			mon[n] = new String(m);
			diem[n] = new String(d);
			n++;
		}
		else{
			System.out.println("Loi!!, Mang day!");
		}
	}
	public void xoa(String m) {
		int i=0;
		for(i=0; i<n; i++){
			if(mon[i].equals(m))break;
		}
		if(i<n){
			for(int j=i; i<n-1; i++){
				mon[j] = mon[j+1];
				diem[j] = diem[j+1];
			}
		}
		n--;
	}
	public String layMS() {
		return mSSV;
	}
	
	public String layTen() {
		return hoTen.substring(hoTen.lastIndexOf(" ")+1);
	}
}
