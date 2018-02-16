/**
 * 二つの実数地を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
 */
	import java.util.Scanner;

	class En2_5{
		//mainメソッドの宣言。
		public static void main(String[]args){
			Scanner stdIn = new Scanner(System.in);

			//xの値の入力を促す
			System.out.print("xの値：");
			//xに実数値を読み込む
			double x = stdIn.nextDouble();

			//yの値の入力を促す
			System.out.print("yの値：");
			//yに実数値を読み込む
			double y = stdIn.nextDouble();

			//x+yの値を表示
			System.out.println("合計は"+(x+y)+"です。");
			//x+yの平均を表示
			System.out.println("平均は"+(x+y)/2+"です。");
		}
}
