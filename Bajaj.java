package week3.day1;

public class Bajaj extends Auto {
	{ //cannot use in main
	applyBrake(); //from vehicle 
	handStart();  //from Auto 
	}
	public static void main (String[] args){
		Bajaj obj = new Bajaj();
		obj.applyBrake();
		obj.soundHorn();
		obj.turnONMeter();
		obj.handStart();
		
	}
}
