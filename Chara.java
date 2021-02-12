package chap8;

public class Chara {
	private int HP;
	private int ATK;
	private String NICKNAME;

	Chara(int input_hp, int input_atk, String input_nickname){
		this.HP = input_hp;
		this.ATK = input_atk;
		this.NICKNAME = input_nickname;
		System.out.println(this.NICKNAME + "が現れた！" + "体力:" + this.HP + "\t攻撃力:" + this.ATK);

	}

	final void printStatus() {
		System.out.println(this.NICKNAME + "\tの体力" + this.HP + "\t攻撃力" + this.ATK);
	}

	final void attack(Chara target)  {
		System.out.println(this.NICKNAME + "の攻撃！\t" + this.ATK + "のダメージ！");
		target.HP = target.HP - this.ATK;
	}

	//定数ダメ
	void teisu(Chara target) {
		System.out.println(this.NICKNAME + "の攻撃！" );
		this.ATK = (180);
		target.HP = target.HP - this.ATK;
	}

	//会心の一撃
	void smash(Chara target) {
		System.out.println(this.NICKNAME + "の攻撃！\t" + "smaaaash!!");
		target.HP = target.HP - this.ATK * 2;
		System.out.println(this.ATK *2 + "のダメージ！");

	}

	void sleep() {
		this.HP += 500;
		System.out.println(this.NICKNAME + "は、眠って回復した！");
	}
//回復
	void aid(Chara target) {
		target.HP += 1000;
		System.out.println(this.NICKNAME + "は" + target.NICKNAME + "を回復した！");
	}

	void run() {
		System.out.println(this.NICKNAME + "は逃げ出した！");
		System.out.println("戦闘は終了した…");
	}
	
	final void down() {
		System.out.println(this.NICKNAME + "は倒れた！");
		System.out.println("戦闘は終了した…");
	}

}
