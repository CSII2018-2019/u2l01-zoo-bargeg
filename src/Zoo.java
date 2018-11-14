
public class Zoo {
	//Write a class for “Animal”
	//1. Make a UML Diagram.
	//a. What are the characteristics
	//b. What are the actions?
	//c. What features do you need to protect?
	//2. Write the code for the class.
	//3. Write code in main to demonstrate the class can create instances of the class and
	//edit the appropriate member variables.
	
	private int birthYear;
	private int legs;
	private String species;
	private boolean furry;
	private int weight;
	private String meansOfAttack;
	
	public Zoo (int y, int l, String s, boolean f, int weight, String mOA) {
		birthYear = y; 
		setLegs(l);
		species = s;
		setFurry(f); 
		setWeight (weight); 
		meansOfAttack = mOA;
	
}
	public void setLegs(int l) {
		if (l >= 0) {
			legs = l;
		}
		else {
			legs = 4;
			System.out.println("legs can not be negative, defaulting to 4");
		}
}
	public void setFurry(boolean f) {
		if (f == true) {
			String furryOrNot = "yes";
		}
		else {
			String furryOrNot = "no";
}
}
	
	public void setWeight(int w) {
		if (w >= 0) {
			weight = w;
		}
		else {
			weight = 100;
			System.out.println("Weight cannot be negative, defaulting to 100");
		}
	}
	public String toString() {
		return "this animal is a " + species + ", born in " + birthYear + " with " + legs + " legs. It weighs: " + weight +
				" pounds. It's main mean of attack is " + meansOfAttack; 
}

	}

