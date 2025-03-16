//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts 3 integers (only positive). The 1st is count of big bags (5 kilos each), the 2nd is count of small bags (1 kilo each)
//and 3rd is the kilos of material provided.
//The program must print the number of bags count that can be packed with the given flour and count of bags, if left.
//Ex: 1, 0, 5 => Big bags 1 can be packed from given 5 Kilos material
//0, 5, 4 => Small bags 4 can be packed, Small bags 1 cannot be packed from given 4 Kilos material
//2, 2, 11 => Big bags 2 can be packed, Small bags 1 can be packed, Small bags 1 cannot be packed from given 11 Kilos material.
//2, 2, 5 => Big bags 1 can be packed, Big bags 1 cannot be packed, Small bags 2 cannot be packed from given 5 Kilos material.
public class WAP_16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter count of big bags (5 kg each): ");
		int bigBags = scanner.nextInt();

		System.out.print("Enter count of small bags (1 kg each): ");
		int smallBags = scanner.nextInt();

		System.out.print("Enter the kilos of material provided: ");
		int totalKilos = scanner.nextInt();

		scanner.close();

		int bigBagUsed = (totalKilos / 5 < bigBags) ? totalKilos / 5 : bigBags;
		totalKilos -= bigBagUsed * 5;

		int smallBagUsed = (totalKilos < smallBags) ? totalKilos : smallBags;
		totalKilos -= smallBagUsed;

		if (bigBagUsed > 0) {
			System.out.println("Big bags " + bigBagUsed + " can be packed");
		}
		if (bigBags - bigBagUsed > 0) {
			System.out.println("Big bags " + (bigBags - bigBagUsed) + " cannot be packed");
		}
		if (smallBagUsed > 0) {
			System.out.println("Small bags " + smallBagUsed + " can be packed");
		}
		if (smallBags - smallBagUsed > 0) {
			System.out.println("Small bags " + (smallBags - smallBagUsed) + " cannot be packed");
		}

	}

}
