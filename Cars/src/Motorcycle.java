
public class Motorcycle extends Vehicle implements VehicleInterface {

	private boolean hasSideCar;

	public Motorcycle(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}	
	public boolean gethasSideCar(){
		return hasSideCar;
	}
	public void sethasSideCar(boolean sideCar){
		this.hasSideCar = sideCar;
	}
}
