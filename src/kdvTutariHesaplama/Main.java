package kdvTutariHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Ücreti giriniz : ");

		double kdv;
		double tutar = input.nextDouble();
		
		kdv = (tutar > 0 && tutar < 1000) ? 0.18 : 0.08;
		
		double kdvTutar = tutar * kdv;
		double kdvliTutar = tutar + kdvTutar;

		System.out.println("Kvd olmayan tutar : " + tutar);
		System.out.println("Kdv oranı : " + kdv);
		System.out.println("Kdv tutarı : " + kdvTutar);
		System.out.println("Kdv dahil tutar : " + kdvliTutar);
	}

}
