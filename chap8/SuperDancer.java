package chap8;

public class SuperDancer extends Dancer{


	SuperDancer(int input_hp, int input_atk, String input_nickname) {
		super(input_hp, input_atk, input_nickname);
	}

	public void superDance(Chara target) {
		target.atk = (target.atk * 2);

		System.out.println("湧き上がる音色によって" + target.name + "の攻撃力が上がった！");
	}

	public void attack(Chara target)  {
		System.out.println(this.name + "の攻撃！\t" + this.atk + "のダメージ！");
		target.hp = target.hp - this.atk;
	}

}
