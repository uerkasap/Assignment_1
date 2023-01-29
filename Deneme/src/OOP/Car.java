package OOP;

public class Car {

	private String Brand;
	private String Color;
	private double Motor;
	private int Doors;
	
	//getter & setter (private objelere diðer sýnýfta eriþmek için) Sað týk->Source->Generate Getters and Setters üzerinden de otomatik oluþturulabilir.
	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getMotor() {
		return Motor;
	}

	public void setMotor(double motor) {
		Motor = motor;
	}

	public int getDoors() {
		return Doors;
	}

	public void setDoors(int doors) {
		Doors = doors;
	}
	//constructor
	public Car(String Brand, String Color, double Motor, int Doors){
	
		this.Brand = Brand;
		this.Color = Color;
		this.Motor = Motor;
		this.Doors = Doors;
			
	}
	//constructor & overloading
	public Car(){
		this.Brand = "Bilgi Yok";
		this.Color = "Bilgi Yok";
		this.Motor = 0;
		this.Doors = 0;
	}
	
	
	public void ShowInfo(){
	
	System.out.println(this.Brand+" "+this.Color+" "+this.Motor+" "+this.Doors);
	
	}
	
}
