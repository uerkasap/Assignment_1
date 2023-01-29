package OOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car car1 = new Car();
		Car car1 = new Car("Audi","White",1.6,4);
		car1.ShowInfo();
		
		car1.setBrand("Volvo");
		car1.setColor("Red");
		car1.setDoors(4);
		car1.setMotor(1.6);
		
		System.out.println(car1.getBrand()+" "+car1.getColor()+" "+car1.getMotor()+" "+car1.getDoors());
	}

}
