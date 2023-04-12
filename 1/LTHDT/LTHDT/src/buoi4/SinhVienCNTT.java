package buoi4;
import buoi3.SinhVien;

import java.util.Scanner;

import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien{
	private String taiKhoan, matKhau, email;
	public SinhVienCNTT() {
		super();
		taiKhoan = new String();
		matKhau = new String();
		email = new String();
	}
	
	public SinhVienCNTT(String mssv, String ht, int d1,int m1, int y1,int n1, String mon1, String diem1, String taiKhoan1, String matKhau1, String email1) {
		super(mssv, ht, d1, m1, y1, n1, mon1, diem1);
		taiKhoan = new String(taiKhoan1);
		matKhau = new String(matKhau1);
		email = new String(email1);
	}
	
	public SinhVienCNTT(SinhVienCNTT sv) {
		super(sv);
		taiKhoan = new String(sv.taiKhoan);
		matKhau = new String(sv.matKhau);
		email = new String(sv.email);
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tai khoan: ");
		taiKhoan = sc.nextLine();
		System.out.println("Nhap mat khau: ");
		matKhau = sc.nextLine();
		System.out.println("Nhap email: ");
		email = sc.nextLine();
	}
	public void in() {
		super.toString();
		System.out.println(","+taiKhoan+","+email);
	}
	public String toString() {
		return super.toString()+"Tai khoan: "+taiKhoan+"\nEmail: "+email;
	}
	public void doiMatKhau(String newPass) {
		matKhau = new String(newPass);
	}
	public String  layEmail() {
		return email;
	}
	
	
}
