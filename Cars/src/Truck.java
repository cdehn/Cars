
public class Truck extends Vehicle implements VehicleInterface {

	private int NumberOfAxels;
	public Person newOwner;
	
	public Truck(int NumberOfAxels, Person Owner) {
		this.NumberOfAxels = NumberOfAxels;
		this.Owner = Owner;
	}
	
	public int getNumberOfAxels(){
		return NumberOfAxels;
	}
	public void setNumberOfAxels(int axels){
		this.NumberOfAxels = axels;
	}
	
	public Person ownership(Person newOwner){
		super.transferOwnership(newOwner);
		return newOwner;
	}
}

