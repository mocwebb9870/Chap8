package chap8;

public class Golem extends Monster{

	Golem(int input_hp, int input_atk, String input_nickname) {
		super(input_hp, input_atk, input_nickname);

	}

	@Override
	public void attack(Chara target) {
		System.out.println(this.name + "の攻撃！\t" + this.atk + "のダメージ！");
		target.hp = target.hp - this.atk;

	}

	void godHand(Chara target) {
		System.out.println(this.name + "は神の鉄槌を振るった！");
		target.hp = target.hp - this.atk * 5;
		System.out.println((this.atk * 5) + "のダメージ！！！");

	}


}
