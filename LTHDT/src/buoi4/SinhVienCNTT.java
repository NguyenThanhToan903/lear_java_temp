package buoi4;

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
		return super.toString()+","+taiKhoan+","+email;
	}
	public void doiMatKhau(String newPass) {
		matKhau = new String(newPass);
	}
	public String  layEmail() {
		return email;
	}
	
	
}
