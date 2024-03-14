package diagramadeclases;

public class Diagramadeclases {

	String name = null;
	int numberSats = 0;
	double TotalMass = 0;
	double Volume = 0;
	int diameter = 0;
	int SunDistance = 0;
	boolean isVisible;
	double Density = 0;
	typePlanet tipo;

	public Diagramadeclases(String name, int numberSats, double TotalMass, double Volume, int diameter, int SunDistance, typePlanet tipo, boolean isVisible) {

		this.name = name;
		this.numberSats = numberSats;
		this.TotalMass = TotalMass;
		this.Volume = Volume;
		this.diameter = diameter;
		this.SunDistance = SunDistance;
		this.tipo = tipo;
		this.isVisible = isVisible;

	}

	public void Print() {
		double Dense = this.calculateDensity();

		System.out.println("Planet: " + name);
		System.out.println("Number of satellites: " + numberSats);
		System.out.println("Total mass of the planet: " + TotalMass);
		System.out.println("Total volume of the planet: " + Volume);
		System.out.println("Total diameter of the planet: " + diameter);
		System.out.println("Total distance to the sun: " + SunDistance);
		System.out.println("Type of planet: " + tipo);
		System.out.println("Is the planet visible? " + isVisible);
		System.out.println("Total density of the planet: " + Dense);

	}

	private double calculateDensity() {

		return this.Density = this.TotalMass / this.Volume;

	}

}
