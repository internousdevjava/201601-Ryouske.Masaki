/**
 *
 */
package kadai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class kisoKadai03 {
	public static void main(String[] args) throws IOException{
		int menyu;

		while(true){
			System.out.println("■メインメニュー■");
			System.out.println("[1]ファイル新規作成[2]フォルダー新規[3]読み込み[9]終了");
			System.out.println("数字で入力してください");

			try{
			 	menyu = new Scanner(System.in).nextInt();

				 if( menyu==1){
					 memo(null);
					 System.out.println("新規作成ファイル");
				 }if(menyu==2){
					 dirm(null);
					 System.out.println("新規作成フォルダー");
				 }if(menyu==3){
					 miru(null);
					 System.out.println("読み込み");

				 }if(menyu==9){

					 System.out.println("終了");
					 break;
				 }

			 }catch(Exception ex) {
		            System.out.println("数字を入力してください");
			 }

		}
	}

	public static void memo(String[] args) throws IOException {
		 InputStreamReader is = new InputStreamReader(System.in);

	        System.out.println("ファイル名を入力してください");


	        BufferedReader input =
	                new BufferedReader (new InputStreamReader (System.in));
	            String fname = input.readLine( );
		File newfile = new File("C:\\test\\"+fname);

	    try{
	      if (newfile.createNewFile()){
	        System.out.println("ファイルの作成に成功しました");
	      }else{
	        System.out.println("ファイルの作成に失敗しました");
	        System.out.println("すでに存在している可能性があります");
	      }
	    }catch(IOException e){
	      System.out.println(e);
	    }
	  }
	public static void dirm(String[] args) throws IOException {
		System.out.println("ディレクトリを作ります");
		BufferedReader input =
                new BufferedReader (new InputStreamReader (System.in));
            String dna = input.readLine( );
            File newfile = new File("c:\\"+dna);

	    if (newfile.mkdirs()){
	      System.out.println("ディレクトリの作成に成功しました");
	    }else{
	      System.out.println("ディレクトリの作成に失敗しました");
	    }
	  }

	public static String Name;
	public static void miru(String[] args) throws IOException {
		System.out.println("中を確認します");
		BufferedReader input =
                new BufferedReader (new InputStreamReader (System.in));
			String dna = input.readLine( );

		Name= dna;
		int flag=0;
		String path = "C:\\test\\";
	    File dir = new File(path);
	    String[] files = dir.list();
	    for (int i = 0; i < files.length; i++) {
	        String file = files[i];
	       if(Name.equals(file)){
	    	   flag =1;
	       }

	       }
	    if(flag==1){
	    	System.out.println("ファイルあったよ");
	    	sabu(null);

	    }else{
	    	System.out.println("なかったよ");
	    }
	}

	public static void kaku(String args[]){
		try{

		      File file = new File("C:\\test\\"+Name);
		      System.out.println("テキストを入力してください");


		        BufferedReader input =
		                new BufferedReader (new InputStreamReader (System.in));
		            String text = input.readLine( );
		      if (checkBeforeWritefile(file)){
		        FileWriter filewriter = new FileWriter(file, true);

		        filewriter.write(text);

		        filewriter.close();
		      }else{
		        System.out.println("ファイルに書き込めません");
		      }
		    }catch(IOException e){
		      System.out.println(e);
		    }
		  }

		  private static boolean checkBeforeWritefile(File file){
		    if (file.exists()){
		      if (file.isFile() && file.canWrite()){
		        return true;
		      }
		    }

		    return false;
		  }
		  public static void sabu(String args[]) throws IOException{
			  while(true){
				  System.out.println("＜ファイルメニュー＞");
				  System.out.println("[1]上書き[2]書き込み[3]読み込み[9]戻る");
				  System.out.println("数字で入力してください");
				  try{
					 int sabu2 = new Scanner(System.in).nextInt();
					 if( sabu2==1){
						 ue(null);
						 System.out.println("上書き");
					}if(sabu2==2){
						 kaku(null);
						 System.out.println("書き込み");
					}if(sabu2==3){
						 yomu(null);
						 System.out.println("確認");
					}if(sabu2==9){
						System.out.println("戻る");
						main(null);
					}
				}catch(Exception ex) {
		            System.out.println("数字を入力してください");
		        }
			  }
		  }

	public static void ue(String[] args) {
	    try{

	      File file = new File("C:\\test\\"+Name);
	      System.out.println("ファイル上書き込み");
	      BufferedReader input =
	                new BufferedReader (new InputStreamReader (System.in));
	            String text = input.readLine( );

	      if (checkBeforeWritefile(file)){
	        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));

	        pw.println(text);

	        pw.close();
	      }else{
	        System.out.println("ファイルに書き込めません");
	      }
	    }catch(IOException e){
	      System.out.println(e);
	    }

	  }

	public static void yomu(String[] args) {
	    try{


	    	File file = new File("C:\\test\\"+Name);
		      FileReader filereader = new FileReader(file);

	      int ch;
	      while((ch = filereader.read()) != -1){
	        System.out.print((char)ch);
	      }

	      filereader.close();
	    }catch(FileNotFoundException e){
	      System.out.println(e);
	    }catch(IOException e){
	      System.out.println(e);
	    }
	  }
}





