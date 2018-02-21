/**
 * 二つの実数地を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
 */
	import java.util.Scanner;

	class En2_5{
		//mainメソッドの宣言。
		public static void main(String[]args){
			//キーボードからの入力を行う際にScannerが必要になる
			Scanner stdIn = new Scanner(System.in);

			//numxの値の入力を促す
			System.out.print("numxの値：");
			//numxに実数値を読み込む
			double numx = stdIn.nextDouble();

			//yの値の入力を促す
			System.out.print("numyの値：");
			//yに実数値を読み込む
			double numy = stdIn.nextDouble();

			//x+yの値を表示
			System.out.println("合計は"+(numx+numy)+"です。");
			//x+yの平均を表示
			System.out.println("平均は"+(numx+numy)/2+"です。");
		}
}
