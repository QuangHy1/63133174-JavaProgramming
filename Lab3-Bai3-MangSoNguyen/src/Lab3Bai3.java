import java.util.Scanner;
import java.lang.Math;

public class Lab3Bai3 {

	public void Nhap(int[] a, int n) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			System.out.printf("a[%d]: ", i);
			a[i] = scan.nextInt();
		}
		scan.close();
	}
	
	public void Xuat(int[] a, int n) {
		for(int i=0; i<n; i++) {
			System.out.printf("%3d", a[i]);
		}
	}
	
	public void Min(int[] a, int n) {
		int min = a[0];
		for(int i=1; i<n; i++) {
			min = Math.min(min, a[i]);
		}
		System.out.printf("\nSố nhỏ nhất trong mảng là: %d", min);
	}
	
	public void Avg(int[] a, int n) {
		double sum=0;
		int count=0;
		for(int i=0; i<n; i++) {
			if(a[i] % 3 == 0) {
				sum += a[i];
				count ++;
			}
		}
		System.out.printf("\nTrung bình cộng các phần tử chia hết cho 3: %f", (double)sum / count);
	}

	public static void main(String[] args) {
		int[] a = new int[100];
		int n;
		
		Scanner scan = new Scanner(System.in);
		
		Lab3Bai3 lab3bai3 = new Lab3Bai3();
		
		System.out.print("Nhập số lượng phần tử của mảng: ");
		n = scan.nextInt();
		lab3bai3.Nhap(a, n);
		System.out.print("\nMảng vừa nhập là: ");
		lab3bai3.Xuat(a, n);
		lab3bai3.Min(a, n);
		lab3bai3.Avg(a, n);
		scan.close();

	}


}
