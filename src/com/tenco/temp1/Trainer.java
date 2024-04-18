package com.tenco.temp1;

public class Trainer {

	 private String trainerName;
	 private String trainerGender;

	//생성자
	public Trainer(String trainerName, String trainerGender) {
		this.trainerName = trainerName;
		this.trainerGender = trainerGender;
		trainerInfo();
	}
	
	//트레이너 정보 확인하기
	public void trainerInfo() {
		System.out.println("이름 : " + this.trainerName + "\t성별 : " + this.trainerGender);
	}
	
	//장소 이동 
	public void choiceRoad(String choiceRoad) {
		System.out.println("'" + this.trainerName + "'가 " + choiceRoad + "(으)로 이동합니다.");
	}
	
	//포켓몬 선택하기
	public void choosePokemon(String choosePokemon) {
		System.out.println(choosePokemon + " 선택했습니다.");
	}
	
	//공격하게 하기
	public void makeAttack(String choosePokemon) {
		System.out.println("'" + this.trainerName + "'가 " + choosePokemon + " 공격 선택했습니다.");
	}
	
	//방어하게 하기
	public void makeDefense(String choosePokemon) {
		System.out.println("'" + this.trainerName + "'가 " +choosePokemon + " 방어 선택했습니다.");
	}
	
}
