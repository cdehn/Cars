
public class Car extends Vehicle implements VehicleInterface {

	private int NumberOfDoors;

	public Car(int NumberOfDoors) {
		this.NumberOfDoors = NumberOfDoors;
	}		

	public int getNumberOfDoors(){
		return NumberOfDoors;
	}
	public void setNumberOfDoors(int numberofdoors){
		NumberOfDoors = numberofdoors;
	}
}
