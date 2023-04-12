package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SDSinhVienCNTT {

	public static void main(String[] args) {
		SinhVien ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so sinh vien: ");
		int n = sc. nextInt();
		ds = new SinhVien[n];
		for(int i=0; i<n; i++){
			System.out.println("Nhap sinh vien thu "+(i+1)+"sinh vien (0) hay SVCNTT (1)");
			int c = sc.nextInt();
			if(c==0){
				ds[i] = new SinhVien();
				System.out.println("Nhap thong tin cho sinh vien: ");
			}
			else{
				ds[i] = new SinhVienCNTT();
				System.out.println("Nhap thong tin cho sinh vien CNTT: ");
			}
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		for(SinhVien S: ds){
			System.out.println(S + "\nDiem TB: "+S.diemTB());
		}
		sc.nextLine();
		System.out.println("Nhap mail cua sinh vien can tiem.");
		String e = sc.nextLine();
		boolean f = true;
		for(SinhVien s: ds){
			if(s instanceof SinhVienCNTT ){
				if(((SinhVienCNTT) s).layEmail().equals(e)){
					System.out.println(((SinhVienCNTT) s) + "\nDiem TB: "+s.diemTB());
					f = false;
					break;
				}
			}
		}
		if(f) System.out.println("Khong tim thay sinh vien co email: "+ e);

	}

}
