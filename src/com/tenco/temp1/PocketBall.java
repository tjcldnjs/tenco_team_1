package com.tenco.temp1;

public class PocketBall {
	private String name;
	private int power;
	private int count;
	private String state;
	
	int hp; // 삭제 예정 hp 포켓몬
	
	public PocketBall(String name, int count, String state) {
		
		this.name = name ;
		this.count = count;
		this.state = state;
	}
		
		
	public void gotCha () {
		System.out.println( name + " 사용했습니다!");
		if(hp ==  40) {
			System.out.println("포켓몬이 도망 쳤습니다.");
		} else if(hp <= 10) { 
			System.out.println("포켓몬이 잡혔습니다.");
		}
		
	}
	
	public void pocketBall() {
		System.out.println(   "      ====");
		System.out.println(   "    =      =");
		System.out.println(   "   =         =");
		System.out.println(  "  ==---()----==");
		System.out.println( "   ==      ==");
		System.out.println("      ====");
		
		System.out.println(" 아이템 이름 : " + name );
		System.out.println(" 회복량: " + count );
		System.out.println(" 위력: " + power );
		System.out.println(" 수 량 : " + state );
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
	
	
	
} // end of class
