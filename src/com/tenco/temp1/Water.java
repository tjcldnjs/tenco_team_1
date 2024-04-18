package com.tenco.temp1;

public class Water {

	String name;
	int power;
	int hp;
	int mp;
	
	public Water(String name) {
		this.name = name ;
		power = 4;
		hp = 60;
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

		// 내가 공격받기
		public void beAttackted(int power) {
			if (hp <= 0) {
				System.out.println("상대방이 죽었습니다. ");
				return;
			}
			hp = hp -power;
		}
		
		public void showInfo() {
			System.out.println("이름 : " + this.name);
			System.out.println("공격력 : " + this.power);
			System.out.println("남은 hp : " + this.hp);
			System.out.println("남은 mp : " + this.mp);
		}
}
