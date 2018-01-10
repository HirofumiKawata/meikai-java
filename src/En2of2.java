
public class En2of2 {
	/**
	 * 三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
	 */
	public static void main(String[]args){
		//xはint型の変数
		int x;
		//yはint型の変数
		int y;
		//zはint型の変数
		int z;

		//xに2を代入
		x=2;
		//yに3を代入
		y=3;
		//zに5を代入
		z=5;

		//xの値を表示
		System.out.println("xの値は"+x+"です。");
		//yの値を表示
		System.out.println("yの値は"+y+"です。");
		//zの値を表示
		System.out.println("zの値は"+z+"です。");
		//合計を表示
		System.out.println("合計は"+(x+y+z)+"です。");
		//平均を表示
		System.out.println("平均は"+(x+y+z)/2+"です。");
	}
}
