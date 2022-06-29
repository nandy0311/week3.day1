package week3.day1;

public  class Car extends Vehicle{
	public void turnOnAC() {

	}
	public void sunRoof() {

	}
	//method overriding
	public void applyBrake() {
		System.out.println("Method overriden from vehicles brake method-ABS Brake");
	}
    //method overloading
	public void add(int a, int b) {
		int sum= a+b;
		System.out.println("add method "+ sum);

	}
	public void add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("method overloading from above add method " + sum);

	}
	
	public static void main (String[] args){
		Car obj = new Car();
		obj.applyBrake();
		obj.add(3, 5);
		obj.add(5, 6, 7);
	}
}
