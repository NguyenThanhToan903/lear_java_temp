package buoi3;

import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
		SinhVien A = new SinhVien();
		System.out.println("Nhap thong tin Sinh Vien: ");A.nhap();
		System.out.println("Nhap diem cho Sinh Vien: ");A.nhapDiem();
		System.out.println("Nhap them mon LTHDT: "); A.them("LTHDT", "A");
		System.out.println("Thong tin Sinh Vien: "+A.toString()+A.diemTB());
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap so SinhVien: ");n =sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		for(int i=0; i<n; i++){
			System.out.println("Nhap Sinh Vien thu "+(i+1)+":");
			ds[i] = new SinhVien();
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		System.out.println("Danh sach Sinh vien vua nhap:");
		for(int i=0; i<n; i++){
			System.out.println("Sinh vien thu "+(i+1)+ds[i]+":"+"Diem TB: "+ ds[i].diemTB());
			
		}
		for(SinhVien S1: ds){
			if(S1.diemTB()<1) System.out.println(S1.layMS()+S1.layTen());
		}
		System.out.println("SV co diem TB cao nhat");
		float tbmax = ds[0].diemTB();
		for(int i=0; i<n; i++){
			if(ds[i].diemTB()>tbmax){
				tbmax = ds[i].diemTB();
			}
		}
		int i;
		for(i=0; i<n; i++){
			if(ds[i].diemTB()==tbmax) break;
		}
		System.out.println("Sinh Vien co diem TB cao nhat: "+ds[i]);
		System.out.println("Hien thi danh sach theo thu tu Alphabet: ");
		for(i=0; i<n-1; i++){
			for(int j=i; j<n; j++){
				if(ds[i].layTen().compareTo(ds[j].layTen())>0){
					SinhVien t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
			}
		}
		for(i=0; i<n; i++){
			System.out.println(ds[i]);
		}
	}

}
