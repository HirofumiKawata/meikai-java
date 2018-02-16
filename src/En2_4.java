/**
 * 右に示すように、キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力する
 * プログラムを作成せよ。
 */
	import java.util.Scanner;

	class En2_4{
		//mainメソッドの宣言。
		public static void main(String[]args){
			Scanner stdIn = new Scanner(System.in);

			System.out.print("整数値：");
			// aに整数値を読み込む
			int a = stdIn.nextInt();
			//a+10の値を表示
			System.out.println("10を加えた値は"+(a+10)+"です。");
			//a-10の値を表示
			System.out.println("10を減じた値は"+(a-10)+"です。");
		}
}
