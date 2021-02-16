package chap8;

public class Chara_Main {

	public static void main(String[] args) {
		Hero yusya = new Hero(500, 30,"ゆうしゃ");
		Cleric soryo = new Cleric(200,10,"そうりょ");
		SuperDancer sdancer = new SuperDancer(100, 15, "すぱだん");
		Matango matango = new Matango(100,20,"マタンゴ");
		Golem golem = new Golem(1000,500,"ゴーレム");

		// 互いに攻撃

		yusya.smash(matango);
		matango.attack(yusya);
		System.out.println();

		// その後のステータスを表示
		yusya.printStatus();
		matango.printStatus();

		matango.flyAttack(yusya);
		yusya.printStatus();
		System.out.println();

		//回復
		soryo.aid(yusya);
		yusya.printStatus();
		System.out.println();

		//踊り
		sdancer.superDance(yusya);
		sdancer.superDance(soryo);
		sdancer.superDance(sdancer);
		yusya.printStatus();
		soryo.printStatus();
		sdancer.printStatus();
		System.out.println();

		//攻撃
		yusya.specialAttack(matango);
		matango.printStatus();
		System.out.println();

		//戦闘終了
		matango.down();
		System.out.println();

		//ゴーレム


	}

}
