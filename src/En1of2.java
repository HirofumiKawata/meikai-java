
public class En1of2 {
/**
 * List2-6の2⃣の箇所を、小数部をもつ実数地をxとyに代入するように変更して、その結果を考察せよ。
 */
	public static void main(String[]args){
		//xはint型の変数
		int x;
		//yはint型の変数
		int y;

		//xに63を代入
		x=6.3;
		//yに18を代入
		y=1.8;
		//xの値を表示
		System.out.println("xの値は"+x+"です。");
		//yの値を表示
		System.out.println("yの値は"+y+"です。");
		//合計を表示
		System.out.println("合計は"+(x+y)+"です。");
		//平均を表示
		System.out.println(
				"平均は"+(x+y)/2+"です。");

		/**
		 * 小数部を持つ実数値をxとyに代入すると実行できない。これはxはint型の変数、
		 * yはint型の変数としているので、そのような結果になっているものと思われる。
		 *
		 *追記:整数を表す整数型がint型である。であるから、小数部を持つ実数地に対応
		 *しておらずこのような結果になっていると思われる。
		 *
		 *ヒント：into型のxに実数を入れている
		 *なぜxとyに実数地を入れると
		 */


	}
}
