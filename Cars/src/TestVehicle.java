
public class TestVehicle {
	
	//Create new Person a
	Person a = new Person();
	
	//New truck with 2 axels and truck assigned to Person a
	Truck truck = new Truck(2, a);
	
	//Create new Person b
	Person b = new Person();
	
	//Transfer ownership of truck from a to b
	truck.ownership(b);

	//Motorcycle with no side car
	Motorcycle noSideCar = new Motorcycle(false);

}
