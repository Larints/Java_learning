import java.util.zip.Inflater;

class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;

	// Это конструктор класса Vehicle
	Vehicle(int p, int f, int m) {
		passengers = p;
		mpg = m;
	}

	// Отображение дальности поездки транспортного средства
	int range() {
		return mpg * fuelcap;
	}

	// Расчет количества топлива, необходимого транспортному средству
	// для преодоления заданного расстояния

	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

public class TwoVehicles {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		double gallons;
		int dist = 252;


		// Присваивание значений полям объекта sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		gallons = minivan.fuelneeded(dist);
		System.out.println("Для преодоления заданного расстояния " + dist + " миль мини фургону " + "требуется "
				+ gallons + " галлонов топлива");

		gallons = sportscar.fuelneeded(dist);
		System.out.println("Для преодоления заданного расстояния " + dist + " миль спортивному автомобилю "
				+ "требуется " + gallons + " галлонов топлива");

	}
}
