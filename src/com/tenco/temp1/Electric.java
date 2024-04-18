package com.tenco.temp1;

public class Electric {

	String name;
	int power;
	int hp;
	int mp;
	
	public Electric(String name) {
		this.name = name ;
		power = 6;
		hp = 50;
		mp = 40;
	}
	// Fire 공격하기
	
	public void attakFire(Fire f) {
		System.out.println(this.name + " 가 " + f.name + " 를 데미지 " + this.power + " 만큼 공격합니다.");
		f.beAttackted(this.power);
		if(mp <= 0) {
			System.out.println(this.name + "의 MP 가 없습니다.");
			return;
		}
		mp -= 5;
	}
	
	// Water 공격하기
	
	public void attakWater(Water w) {
		System.out.println(this.name + " 가 " + w.name + " 를 데미지 " + this.power + " 만큼 공격합니다.");
		w.beAttackted(this.power);
		if(mp <= 0) {
			System.out.println(this.name + "의 MP 가 없습니다.");
			return;
		}
		mp -= 5;
	}

	// 내가 공격받기
	public void beAttackted(int power) {
		if (hp <= 0) {
			System.out.println("상대방이 죽었습니다. ");
			return;
		}
		hp = hp -power;
	}	
	public void showInfo() {
		System.out.println("=== 상태창 ===");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("남은 hp : " + this.hp);
		System.out.println("남은 mp : " + this.mp);
	}
}
