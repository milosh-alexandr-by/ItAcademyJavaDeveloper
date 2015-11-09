package car;

public class Car {

	private String brand;			// ����� ����������
	private String model;			// ������ ����������
	private double fuelConsumption;	// ������ �������
	private int price;				// ����
	private int maxSpeed; 			// ������������ ��������
	
	public int numberLineSeats;  // ���������� ����� �������
	public int maxNumberLineSeats;  // ������������ ���������� ����� �������
	public int minNumberLineSeats;  // ����������� ���������� ����� �������
	public int numberDoors;  // ���������� ����� ������
	
	public boolean roof;	
	public void hasRoof(boolean hasRoof){
		if (hasRoof==true) {
			System.out.println("������ � ������ ������.");
		}
		else {
			System.out.println("������ � �������������� ������.");
		}
	}
	
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getFuelConsumption() {
		return fuelConsumption;
	}


	public void setFuelConsumption(double fuelConsumption) {
		try {
			if (fuelConsumption<0) {
				throw new Exception("������ ������� �� ����� ���� �������������.");
			}
			this.fuelConsumption = fuelConsumption;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		try {
			if (fuelConsumption<0) {
				throw new Exception("���� �� ����� ���� �������������.");
			}
			this.price = price;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		try {
			if (fuelConsumption<0) {
				throw new Exception("������������ �������� �� ����� ���� �������������.");
			}
			this.maxSpeed = maxSpeed;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ��������������� ������ toString ��� �������� ������ Car
	public String toString() {
		String str = getBrand() + ", " + getModel() + ", " +  getFuelConsumption() + ", " +  getPrice() + ", " + getMaxSpeed();
		return str;
	}
	
}
