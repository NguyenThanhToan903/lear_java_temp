package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class DiemMau extends Diem {
	private String mau;

	public DiemMau() {
		super();
		mau = new String();
	}

	public DiemMau(int x1, int y1, String m1) {
		super(x1, y1);
		mau = new String(m1);
	}

	public DiemMau(DiemMau Dm) {
		super((Diem) Dm);
		mau = new String(Dm.mau);
	}

	public void in() {
		super.hienThi();
		System.out.println("voi mau: " + mau);
	}

	public String toString() {
		return super.toString() + "voi mau: " + mau;
	}

	public void in(String S) {
		System.out.println(S);
		this.in();
	}

	public void nhap() {
		super.nhapDiem();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mau cua diem: ");
		mau = sc.nextLine();
	}

	public void ganMau(String m1) {
		mau = new String(m1);
	}

	public String layMau() {
		return mau;
	}

}
