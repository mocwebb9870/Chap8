package chap8;

public class Dancer extends Chara{

	Dancer(int input_hp, int input_atk, String input_nickname) {
		super(input_hp, input_atk, input_nickname);

	}

	public void dance(Chara target) {
		target.atk = (target.atk + 100);
		System.out.println(this.name + "は踊りによって" + target.name + "の攻撃力を上げた！");
	}

//攻撃させたくない場合、overrideを空にしておく
	public void attack(Chara target) {
		System.out.println(this.name + "は踊りに集中している！");

	}

	@Override
	public void attack(Monster target) {
		System.out.println(this.name + "は踊りに集中している！");

	}

}
