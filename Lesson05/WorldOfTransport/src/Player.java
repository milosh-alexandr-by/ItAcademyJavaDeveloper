
public class Player implements Men {

	public String name;
	int moneyOfPlayer = 1000;
	String yourLocationCity;
	String yourLocationObjectOfCity;
	
	public Player (String name) {
		this.name = name;
	}
	
	public int getMoneyOfPlayer() {
			return moneyOfPlayer;
	}
	
	public void getMoneyOfPlayerPlus(int plus) {
		moneyOfPlayer = moneyOfPlayer + plus;
	}
	public void getMoneyOfPlayerMinus(int minus) {
		moneyOfPlayer = moneyOfPlayer - minus;
	}
	
	public void yourLocation (Cities city, Home home) {
		System.out.println(city.nameOfCity + "\\" + home.nameOfHome + ".");
	}
	public void yourLocation (Cities city, CenterOfCity center) {
		System.out.println(city.nameOfCity + "\\" + center.nameOfCenterOfCity + ".");
	}
	public void yourLocation (Cities city, AutoShop auto) {
		System.out.println(city.nameOfCity + "\\" + auto.nameOfAutoShop + ".");
	}
	public void yourLocation (Cities city, FuelStation fuel) {
		System.out.println(city.nameOfCity + "\\" + fuel.nameOfFuelStation + ".");
	}
	public void yourLocation (Cities city, Airport air) {
		System.out.println(city.nameOfCity + "\\" + air.nameOfAirport + ".");
	}

}
