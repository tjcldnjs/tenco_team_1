package com.tenco.temp1;

public class Fire {

	String name;
	int power;
	int hp;
	int mp;

	public Fire(String name) {
		this.name = name;
		power = 7;
		hp = 40;
		mp = 40;
	}

	// Water 공격하기

	public void attakWater(Water w) {
		System.out.println(this.name + " 가 " + w.name + " 를 데미지 " + this.power + " 만큼 공격합니다.");
		w.beAttackted(this.power);
		if (mp <= 0) {
			System.out.println(this.name + "의 MP 가 없습니다.");
			return;
		}
		mp -= 5;
	}

	// Electric 공격하기

	public void attakElectric(Electric e) {
		System.out.println(this.name + " 가 " + e.name + " 를 데미지 " + this.power + " 만큼 공격합니다.");
		e.beAttackted(this.power);
		if(mp <= 0) {
			System.out.println(this.name + "의 MP 가 없습니다.");
			return;
		}
		mp -= 5;	
	}

	public void beAttackted(int power) {
		if (hp <= 0) {
			System.out.println(" 죽었습니다. ");
			return;
		}
		hp = hp - power;
	}

	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("남은 hp : " + this.hp);
		System.out.println("남은 mp : " + this.mp);
	}
}
