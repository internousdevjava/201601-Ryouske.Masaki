package kadai;

import java.util.Scanner;

/**
 * @author ryo
 *
 */
public class KisoKadai01 {
	public static void main(String[] args){
		System.out.println("[ 九九表 ]");


	while ( true){
		System.out.println("Xは");
		int x = new Scanner(System.in).nextInt();
		System.out.println("Yは");
		int y = new Scanner(System.in).nextInt();
		for(int i = 1; i <=x; i++){
			for(int j = 1; j <=y; j++){
				System.out.printf(" %2d", i * j);
				}
			System.out.println();
		}
	}
	}
}