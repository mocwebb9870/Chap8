package chap8;

public class Cleric extends Chara{

	Cleric(int input_hp, int input_atk, String input_nickname) {
		super(input_hp, input_atk, input_nickname);
	}



		//回復
		void aid(Chara target) {
			target.hp += 200;
			System.out.println(this.name + "は" + target.name + "を回復した！");
		}


		@Override
		public void attack(Monster target) {
		System.out.println(this.name + "の攻撃！\t" + this.atk + "のダメージ！");
		target.hp = target.hp - this.atk;

		}



	}

