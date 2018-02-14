// 整数値を読み込んで値を表示
/**
 * 右に示すように、キーボードから読み込んだ整数値をそのまま反復して表示する
 * プログラムを作成せよ。
 */
	import java.util.Scanner;

	class En3of2{
		//mainメソッドの宣言。
		public static void main(String[]args){
			Scanner stdIn = new Scanner(System.in);

			System.out.print("整数値：");
			int a = stdIn.nextInt();   // aに整数値を読み込む
			System.out.println(a+"と入力しましたね。");//"と入力しましたね。"を出力する。
		}
}
