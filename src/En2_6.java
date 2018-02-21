/**
 * 三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。
 */
	import java.util.Scanner;

	class En2_6{
		//mainメソッドの宣言。
		public static void main(String[]args){
			//キーボードからの入力を行う際にScannerが必要になる
			Scanner stdIn = new Scanner(System.in);

			//底辺の値の入力を促す
			System.out.print("底辺：");
			//widthに実数値を読み込む
			double width = stdIn.nextDouble();

			//高さの値の入力を促す
			System.out.print("高さ：");
			//heightに実数値を読み込む
			double height = stdIn.nextDouble();

			//底辺+高さの平均を表示
			System.out.println("面積は"+(width*height)/2+"です。");
		}
}
