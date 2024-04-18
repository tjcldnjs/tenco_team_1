package com.tenco.temp1;

public class Battle {

	public static void main(String[] args) {

		Fire fire = new Fire("파이리");
		Water water = new Water("꼬부기");
		Electric electric = new Electric("피카츄");
		
		fire.attakElectric(electric);
		fire.attakElectric(electric);
		fire.attakElectric(electric);
		fire.attakElectric(electric);
		fire.attakElectric(electric);
		fire.attakElectric(electric);
		fire.attakElectric(electric);
		fire.attakElectric(electric);
		fire.attakElectric(electric);
		
		fire.showInfo();
		
	}

}
