package kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai02 {
	public static void main(String[] args) throws IOException {
		int answer;
		int my;
		int counter = 0;
		System.out.println("[数当てゲーム]");
		System.out.println("1～100の数を当てよう。");

		answer = (int)(Math.random() * (100+1));
			while(true) {
				counter ++;
				try{
					BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
					String kaku = br.readLine( );
					my =  Integer.parseInt(kaku);

					if(my < answer) {
						System.out.println(my + "よりは大きい。");
					} else if(my > answer){
						System.out.println(my + "よりは小さい。");
					} else{
						System.out.println("正解!");
						break;
					}
				}catch ( NumberFormatException e ) {
					System.out.println( "数値に変換できる文字を入力してください" );
				}
				System.out.println("正解までに " + counter + "回かかりました。");
			}
		}
	}


