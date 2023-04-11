package buoi3;

import buoi2.Diem;

public class DoanThang {
	private Diem d1, d2;
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem A, Diem B) {
		d1 = new Diem(A);
		d2 = new Diem(B);
	}
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	public void nhap(){
		System.out.println("Nhap toa do d1: ");d1.nhapDiem();
		System.out.println("Nhap toa do d2: ");d2.nhapDiem();
		
	}
	public void in() {
		System.out.println("["+d1+","+d2+"]");
		
	}
	public String toString() {
		return "["+d1+","+d2+"]";
	}
	public void tinhTien(int dx, int dy) {
		d1.tTien(dx, dy);
		d2.tTien(dx, dy);
	}
	public float doDai() {
		return d1.khoangCach(d2);
	}
	public double goc() {
		float dx, dy ;
		dx = Math.abs(d2.giaTriX() - d1.giaTriX());
		dy = Math.abs(d2.giaTriY() - d2.giaTriY());
		return (Math.toDegrees(Math.atan2(dx, dx)));
	}
	
	
}
