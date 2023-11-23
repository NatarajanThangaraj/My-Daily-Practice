package Inheritance;
import java.util.Arrays;
import Inheritance.StaticMethods;
public class Explicitcasting {
	public static void main(String []args) {
		//MountBike myBike=new MountBike(50,3,120);
		StaticMethods obj=new StaticMethods();
		System.out.println(obj.variable);
//		Bicycle bicyc=new MountBike(80,9,130);
//		//Object obj=new Bicycle(50,3);
//		MountBike newOne=(MountBike) bicyc;
//		System.out.println(newOne.gear);
	}
}
class Bicycle{
	public int gear;
	public int speed;
	public Bicycle(int startSpeed,int startGear) {
		gear=startGear;
		speed=startSpeed;
	}
	public void setGear(int newValue) {
		gear=newValue;
	}
	public void applyBreak(int decrement) {
		speed-=decrement;
	}
	public void speedUp(int increment) {
		speed+=increment;
	}
}
class MountBike extends Bicycle{
	public int seatHeight;
	public MountBike(int startSpeed,
			         int startGear,
			         int startHeight) {
		super(startSpeed, startGear);
		seatHeight=startHeight;
		
	}
	public void setHeight(int newValue) {
		seatHeight=newValue;
	}
}


