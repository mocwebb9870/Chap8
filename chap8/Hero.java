package chap8;

public class Hero extends Chara{

	public Hero(int input_hp, int input_atk, String input_nickname) {

		super(input_hp, input_atk, input_nickname);

	}

	public void attack(Monster target)  {
		System.out.println(this.name + "の攻撃！\t" + this.atk + "のダメージ！");
		target.hp = target.hp - this.atk;
	}

	void specialAttack(Monster target) {
		target.hp = (target.hp - this.atk * 10);
		System.out.println(this.name + "の必殺剣！！！");
		System.out.println(target.name + "に" + (this.atk * 10) + "のダメージ！！！");

	}


}
