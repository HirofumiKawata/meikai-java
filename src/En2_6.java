/**
 * 三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。
 */
	import java.util.Scanner;

	class En2_6{
		//mainメソッドの宣言。
		public static void main(String[]args){
			Scanner stdIn = new Scanner(System.in);

			//底辺の値の入力を促す
			System.out.print("底辺：");
			//xに実数値を読み込む
			double x = stdIn.nextDouble();

			//高さの値の入力を促す
			System.out.print("高さ：");
			//yに実数値を読み込む
			double y = stdIn.nextDouble();

			//底辺+高さの平均を表示
			System.out.println("面積は"+(x*y)/2+"です。");
		}
}
