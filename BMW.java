package week3.day1;

public class BMW extends Car{
	public static void bmvmethod() {
		
	}
public static void main (String[] args){
	BMW obj = new BMW();
	obj.applyBrake();
	obj.soundHorn();
	obj.turnOnAC();
	obj.sunRoof();
	obj.add(1, 2);
	obj.add(1, 2, 3);
	bmvmethod();
	
}
}
