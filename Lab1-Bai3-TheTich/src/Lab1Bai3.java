import java.util.Scanner;
import java.lang.Math;

public class Lab1Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double canh;
		System.out.printf("Nhập chiều dài cạnh của đa giác: ");
		canh = scan.nextDouble();
		scan.close();
		System.out.printf("Thể tích lập phương: %f", canh * canh * canh); // Cach 1: canh * canh * canh
		System.out.println();
		System.out.printf("Thể tích lập phương: %f", Math.pow(canh, 3)); // Cach 2: Math.pow(canh, 3)
	}

}
