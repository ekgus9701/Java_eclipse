
public class VegicleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle minivan= new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		
		double gallons;
		int dist=252;
		gallons=minivan.fuelneeded(dist);
		System.out.println("To go "+dist+" miles minivan needs "+gallons+"gallons of fuel.");
		gallons= sportscar.fuelneeded(dist);
		System.out.println("To go "+dist+" miles sportscar needs "+gallons+"gallons of fuel.");

	}

}