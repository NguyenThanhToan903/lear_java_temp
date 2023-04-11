package buoi4;

import buoi2.Diem;

public class SDDiemMau {

	public static void main(String[] args) {
		DiemMau A = new DiemMau(5, 10, "Trang");
		A.in();
		DiemMau B = new DiemMau();
		B.nhap();
		B.in();
		System.out.println("Tinh tien mot doan (10, 8)");
		B.tTien(10, 8);
		B.in();
		System.out.println("Gan mau Vang");
		B.ganMau("Vang");
		B.in();

	}

}
