package com.tenco.temp1;

public class Potion {

	private String name;
	private int recovery;
	private int theNumber;

	int hp;// 나중에 지울거임 포켓몬 hp

	public Potion(String name, int recovery, int theNumber) {
		this.name = name;
		this.recovery = recovery;
		this.theNumber = theNumber;

	}

	public void usePotion() {
		System.out.println(name + "사용했습니다.");
		// 포켓몬 hp 회복
		if (hp <= 100) {
			System.out.println("더이상 회복약 사용이 불가 합니다.");

		}
		hp = hp + recovery;
		System.out.println(recovery + " 회복했습니다");

	}

	public void lookPotion() {
		System.out.println(   "    ====");
		System.out.println(   "    =  =");
		System.out.println(   "    ====");
		System.out.println(  "  ==  + ==");
		System.out.println( " ==  +   ==");
		System.out.println(" ==+   +  ==");
		System.out.println("  ==   + ==");
		System.out.println("    =====");
		
		System.out.println(" 아이템 이름 : " + name );
		System.out.println(" 회복량: " + recovery );
		System.out.println(" 수 량 : " + theNumber );
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRecovery() {
		return recovery;
	}

	public void setRecovery(int recovery) {
		this.recovery = recovery;
	}

	public int getTheNumber() {
		return theNumber;
	}

	public void setTheNumber(int theNumber) {
		this.theNumber = theNumber;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	

} // end of class
