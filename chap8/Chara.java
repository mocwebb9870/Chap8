package chap8;

public abstract class Chara {
	protected int hp;
	protected int mp;
	protected int atk;
	protected String name;

	Chara(int input_hp, int input_atk, String input_nickname){
		this.hp = input_hp;
		this.atk = input_atk;
		this.name = input_nickname;
		System.out.println(this.name + "\t体力:" + this.hp + "\t攻撃力:" + this.atk);

	}

	final void printStatus(){
		System.out.println(this.name + "\tの体力" + this.hp + "\t攻撃力" + this.atk);
	}

//基礎攻撃
	public abstract void attack(Monster target);

//attackメソッドはこれコピペして使ってね

	/*
	public void attack(Chara target)  {
		System.out.println(this.NICKNAME + "の攻撃！\t" + this.ATK + "のダメージ！");
		target.HP = target.HP - this.ATK;
	}

	*/

//定数ダメ
	void teisu(Monster target) {
		System.out.println(this.name + "の攻撃！" );
		this.atk = (180);
		target.hp = target.hp - this.atk;
	}

//飛び込み
	void flyAttack(Monster target) {
		System.out.println(this.name + "は飛び上がった！");
		System.out.println(this.name + "の攻撃！\t");
		target.hp = (target.hp - this.atk * 3);
		System.out.println(this.name + "の攻撃！\t" + (this.atk * 3) + "のダメージ！");

	}

//会心の一撃
	void smash(Monster target) {
		System.out.println(this.name + "の攻撃！\t" + "smaaaash!!");
		target.hp = target.hp - this.atk * 2;
		System.out.println(this.atk *2 + "のダメージ！");

	}

	void sleep() {
		this.hp += 500;
		System.out.println(this.name + "は、眠って回復した！");
	}

	void run() {
		System.out.println(this.name + "は逃げ出した！");
		System.out.println("戦闘は終了した…");
	}

	final void down() {
		System.out.println(this.name + "は倒れた！");
		System.out.println("戦闘は終了した…");
	}

}
