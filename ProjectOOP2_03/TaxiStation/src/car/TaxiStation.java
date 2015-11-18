/*
 * �����, � ������� ������ ������ �����������, �������� �������������.
 * ����� ������ ��������� �� ���� ��������.
 * ����� ������ ������� (����������) � �������� �� � ���������:
 *  - �������;
 *  - �� ����� �� ����������.
 *  ������ �����, ��� �������� .txt ����� �� ������� ����������� ����������.
 *  ������� ��������� �� �����.
 *  ������������ ��������� ����������.
 *  ��������� ��������� �� ���� � ������� �������.
 *  ������� ����������, ������� ������������ ��������� ��������� ������������ ��������. 
 */

package car;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import car.Car;
import openCar.Cabriolet;
import openCar.Roadster;
import openCar.Targa;
import passengerCar.Coupe;
import passengerCar.Hatchback;
import passengerCar.Hearse;
import passengerCar.Limousine;
import passengerCar.SUV;
import passengerCar.Sedan;
import passengerCar.Universal;
import van.Minibus;
import van.Minivan;
import mpv.Furgon;
import mpv.Pickup;

public class TaxiStation {

	public static void main(String[] args) throws IOException {
		
			// ������ ������ ����������� ����������.
		ArrayList<Car> carList = new ArrayList<>();
		carList = buildTaxiStation();
		
			// ������ .txt ���� �� ������� �����������.
		createNewTxtFile("TaxiStation.txt", carList);
		
			// ������� �� ����� ��������� ����������.	
		costOfTaxiStation(carList);
			
			// ������� �� ����� ��������� � ������� for each.		
		for (Car ob : carList) {
			System.out.println(ob);
		}
		
			// ���������� �� ������� �������.	
		sortedByFuelConsumption(carList);
			// ������� �� ����� ���������, ��������������� �� ������� �������.
		printTaxiStation(carList);
			// ������ .txt ���� �� ������� �����������, ��������������� �� ������� �������.
//		createNewTxtFile("SortedByFuelConsumption.txt", carList);
				
			// ���������� �� ����.		
		Collections.sort(carList, new SortedByPrice() );
			// ������� �� ����� ���������, ��������������� �� ����.
		System.out.println();
		System.out.print("���������� �� ����:");
		printTaxiStation(carList);
			// ������ .txt ���� �� ������� �����������, ��������������� �� ����.
//		createNewTxtFile("SortedByPrice.txt", carList);
		
			 
			// ������� ����������, ������� ������������ ��������� ��������� ���������� ��������.	 
		speedDiapazon(carList);
	
	}
	
// �������� ������, � ������� ����� ������� ��� ���� �����
	static ArrayList<Furgon> furgonList = new ArrayList<>();
	static ArrayList<Hearse> hearseList = new ArrayList<>();
	static ArrayList<Pickup> pickupList = new ArrayList<>();
	static ArrayList<Cabriolet> cabrioletList = new ArrayList<>();
	static ArrayList<Roadster> roadsterList = new ArrayList<>();
	static ArrayList<Targa> targaList = new ArrayList<>();
	static ArrayList<Coupe> coupeList = new ArrayList<>();
	static ArrayList<Hatchback> hatchbackList = new ArrayList<>();
	static ArrayList<Limousine> limousineList = new ArrayList<>();
	static ArrayList<Sedan> sedanList = new ArrayList<>();
	static ArrayList<SUV> suvList = new ArrayList<>();
	static ArrayList<Universal> universalList = new ArrayList<>();
	static ArrayList<Minibus> minibusList = new ArrayList<>();
	static ArrayList<Minivan> minivanList = new ArrayList<>();
	
// �����, ��� �������� ������ ����������� ����������	
	public static ArrayList<Car> buildTaxiStation() throws IOException{
		ArrayList<Car> arr = new ArrayList<>();
//		addCarsToCarList("NewCarsToTaxiStation.txt");
		arr.addAll(furgonList);
		arr.addAll(hearseList);
		arr.addAll(pickupList);
		arr.addAll(cabrioletList);
		arr.addAll(roadsterList);
		arr.addAll(targaList);
		arr.addAll(coupeList);
		arr.addAll(hatchbackList);
		arr.addAll(limousineList);
		arr.addAll(sedanList);
		arr.addAll(suvList);
		arr.addAll(universalList);
		arr.addAll(minibusList);
		arr.addAll(minivanList);
		return arr;
	}
	
// �����, ��� ���������� ����������� �������	
	public static void addCarsToCarList() {
		sedanList.add(new Sedan("Toyota", "Camry", 8.5, 20000, 170));
		sedanList.add(new Sedan("VW", "Passat B6", 8.1, 11000, 150));
		sedanList.add(new Sedan("Opel", "Astra", 8.1, 8300, 144));
		roadsterList.add(new Roadster("Porsche", "Boxter", 12, 75000, 220));
		universalList.add(new Universal("Ford", "Mondeo", 8.6, 9400, 163));
		universalList.add(new Universal("Mazda", "6", 8.2, 17600, 151));
		minibusList.add(new Minibus("GAZ", "2705", 11.5, 12000, 122));
	}

// �����, ������� ��������� ���������� �� �����	
	public static void addCarsToCarList(String fileOnComputer){
		System.out.println();
		File newCarsToTaxiStation = new File(fileOnComputer);
		try {
			FileReader tsfl = new FileReader(newCarsToTaxiStation);
			BufferedReader tsbr = new BufferedReader(tsfl);
			String line = tsbr.readLine();
			while ( (line) != null) {
				String[] descriptionCar = line.split(",");
				String brandL = descriptionCar[0].trim(); 
				String modelL = descriptionCar[1].trim(); 
				Double fuuelL = Double.valueOf(descriptionCar[2].trim()); 
				Integer priceL = Integer.valueOf(descriptionCar[3].trim());
				Integer maxspeedL = Integer.valueOf(descriptionCar[4].trim());
				switch(descriptionCar[5].trim()) {
				case "Furgon" : furgonList.add(new Furgon(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "Hearse" : hearseList.add(new Hearse(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "Pickup" : pickupList.add(new Pickup(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "Cabriolet" : cabrioletList.add(new Cabriolet(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "Roadster" : roadsterList.add(new Roadster(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "Targa" : targaList.add(new Targa(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "Coupe" : coupeList.add(new Coupe(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "Hatchback" : hatchbackList.add(new Hatchback(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "Limousine" : limousineList.add(new Limousine(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "Sedan" : sedanList.add(new Sedan(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "SUV" : suvList.add(new SUV(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "Universal" : universalList.add(new Universal(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "Minibus" : minibusList.add(new Minibus(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
				case "Minivan" : minivanList.add(new Minivan(brandL, modelL, fuuelL, priceL, maxspeedL)); break;
			}
			line = tsbr.readLine();}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
// �����, ������� ������ .txt ����, � ������ ��� ��� ������������� �����������
	public static void createNewTxtFile(String nameOfFile, ArrayList<? extends Car> carList) throws IOException {
		int size = carList.size();
		File taxiStation = new File(nameOfFile);
		taxiStation.createNewFile();
		FileWriter tsw = new FileWriter(taxiStation);
		for (int i=0; i<size; i++) {
			String classOfCar = carList.get(i).getClass().getSimpleName();
			String strCar = carList.get(i).toString() + ", " + classOfCar + "\n";
			tsw.write(strCar);
		}
		tsw.flush();
		tsw.close();
	}
	
// ����� ��� ���������� �� ������� �������
	public static void sortedByFuelConsumption(ArrayList<? extends Car> arr) {
		System.out.println();
		System.out.print("���������� �� ������� �������:");
		Collections.sort(arr, 				
				new Comparator<Car>() {			
				@Override
				public int compare(Car obj1, Car obj2) {
					double fc1 = obj1.getFuelConsumption();
					double fc2 = obj2.getFuelConsumption();
					if (fc1>fc2) {
						return 1;
					}
					else if (fc1<fc2) {
						return -1;
					}
					else {
						return 0;
					}
				}
				}	
		);	
	}
		
// �����, ������� ������������ ��������� ����������
	public static void costOfTaxiStation(Collection<Car> arr) {
		int priceOfTaxiStation = 0;
		Iterator<Car> itr = arr.iterator();
		while (itr.hasNext()) {
			priceOfTaxiStation += itr.next().getPrice();
		}
		System.out.println("��������� ���������: " + priceOfTaxiStation + " ��������.\n");
	}
		
// �����, ������� ������� �� ����� ���������
	public static void printTaxiStation(ArrayList<Car> arr){
		System.out.println();
	     Iterator<Car> itr = arr.iterator();
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.println(element);
	      }
	}
		
// �����, ������� ������� ����������, ������� ������������ ��������� ��������� ���������� ��������
	public static void speedDiapazon(Collection<Car> arr) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ������ ������� ��������� ��������: ");
		int startDiapazon = sc.nextInt();
		System.out.print("������� ������� ������� ��������� ��������: ");
		int endDiapazon = sc.nextInt();
		int sum = 0;
		for (Car tc : arr) {
			if (tc.getMaxSpeed()>=startDiapazon & tc.getMaxSpeed()<=endDiapazon) {
				 System.out.println(tc);
				 sum++;  
			 }
		}
		if (sum == 0) {
			System.out.println("�� ����� ������ �� �������.");
		}
		sc.close();
	 }

	
}