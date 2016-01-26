package kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ryo
 *
 */
public class KisoKadai01 {
	public static  void main(String[] args) throws IOException{
		System.out.println("[ 九九表 ]");

		int x;
		int y;
	while ( true){
		try{
			System.out.println("Xは");
			BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
	        String tate = br.readLine( );
	         x= Integer.parseInt(tate);
	        System.out.println("Yは");
	        BufferedReader br2 =new BufferedReader (new InputStreamReader (System.in));
	        String yoko = br2.readLine( );
	         y = Integer.parseInt(yoko);
	        	 for(int i = 1; i <=x; i++){
	        		  for(int j = 1; j <=y; j++){
	        			  System.out.printf(" %2d", i * j);
	        		  }
	        		  System.out.println();
	        	 }
		}catch ( NumberFormatException e ) {
			System.out.println( "数値に変換できる文字を入力してください" );
		}
	}
	}
}
