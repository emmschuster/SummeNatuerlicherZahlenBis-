import java.util.Scanner;

public class SumNatZahBisN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gib die Grenze ein : ");
		int x = sc.nextInt();
		sc.close();
		int summeIT=rechnenIterativ(x);
		int summeRek=rechnenRekursiv(x,0,0);
		int summeEndRek=rechnenEndRek(x,0);
		System.out.println("Die Summe der natürlichen Zahlen von "+x+" ist "+summeEndRek);
	}
	static int rechnenIterativ(int grenze) {
		if (grenze==0) {
			return grenze;
		}
		int sum=0;
		for (int i = 0; i < grenze; i++) {
			sum = sum+i;
		}
		return sum;
	}
	static int rechnenRekursiv(int grenze, int zahler,int sum) {
		if (grenze==0) {
			return grenze;
		}
		zahler++;
		if (zahler < grenze) {
			sum=sum+zahler;
			//System.out.println(sum);
			return rechnenRekursiv(grenze, zahler, sum);
		}
		return sum;
	}
	static int rechnenEndRek(int grenze, int sum) {
		if (grenze == 0) {
			return grenze;
		} else {
			grenze-=1;
			sum+=grenze;
			System.out.println(grenze +" , "+ sum);
			return rechnenEndRek(grenze, sum);
		}
	}
}