package kadai;

import java.util.Scanner;

public class KisoKadai02 {
	public static void main(String[] args) {
		int answer;
		int my;
		int r;
		int counter = 0;
		System.out.println("[数当てゲーム]");
		System.out.println("1～100の数を当てよう。");

		answer = (int)(Math.random() * (100+1));
			while(true) {
				counter ++;
				my =  new Scanner(System.in).nextInt();

				if(my < answer) {
					System.out.println(my + "よりは大きい。");
				} else if(my > answer){
					System.out.println(my + "よりは小さい。");
				} else{
					System.out.println("正解!");
					break;
				}
			}

			System.out.println("正解までに " + counter + "回かかりました。");
		}
	}

