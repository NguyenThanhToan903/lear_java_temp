package buoi4;
import java.util.Scanner;


public class SDDongVat {

	public static void main(String[] args) {
		
		ConVat ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dong vat: ");
		int n = sc.nextInt();
		ds = new ConVat[n];
		int c = 0;
		for(int i=0; i<n; i++){
			System.out.println("Nhap con vat thu "+(i+1)+" la Bo (0), la Heo (1), la De (2), con khac (3)");
			c = sc.nextInt(); sc.nextLine();
			if(c==0){
				ds[i] = new Bo();
				System.out.println("Nhap thong tin con Bo:");
			}
			else if(c==1){
				ds[i] = new Heo();
				System.out.println("Nhap thong tin con Heo:");
			}
			else if(c==2){ 
				ds[i] = new De();
				System.out.println("Nhap thong tin con De:");
			}
			else {
				System.out.println("Nhap ten dong vat: ");
				String m = sc.nextLine();
				if(m.equals("Ga")){
					ds[i] = new Ga();
					System.out.println("Nhap thong tin con Ga:");
				}
				else{
					System.out.println("He thong khong tim thay con"+m+"!!!. Vui long lai.\nError: Not Found!");
					i--;
					continue;
				}
			}
			ds[i].nhap();
		}
		for(ConVat d : ds){
			System.out.println(d);
			d.keu();
		}

	}

}
