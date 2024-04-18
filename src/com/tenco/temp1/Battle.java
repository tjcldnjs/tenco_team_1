package com.tenco.temp1;

public class Battle {

	public static void main(String[] args) {
		Place place1_1 = new Place("동쪽","공원");
		Place place1_2 = new Place("동쪽","병원");
		Place place2 = new Place("서쪽","공원");
		Place place3 = new Place("남쪽","공원");

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
		
		fire.showInfo();
		
	}

}
