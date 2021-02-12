package chap8;

public class Chap8_Main {

	public static void main(String[] args) {
		Hero yusya = new Hero(500, 30,"ゆうしゃ");
		Matango matango = new Matango(100,50,"マタンゴ");
		Cleric soryo = new Cleric(200,100,"そうりょ");

		// 互いに攻撃

		yusya.smash(matango);
		matango.attack(yusya);
		yusya.attack(matango);
		matango.smash(yusya);

		// その後のステータスを表示
		yusya.printStatus();
		matango.printStatus();

		//回復
		soryo.aid(yusya);
		yusya.printStatus();
		
		//攻撃
		yusya.attack(matango);
		matango.printStatus();
		
		//戦闘終了
		matango.down();
	}

}
