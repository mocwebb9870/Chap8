package chap8;

public class Matango extends Monster{

	Matango(int input_hp, int input_atk, String input_nickname) {

		super(input_hp, input_atk, input_nickname);

	}

	public void attack(Chara target)  {
		System.out.println(this.name + "の攻撃！\t" + this.atk + "のダメージ！");
		target.hp = target.hp - this.atk;
	}

}
