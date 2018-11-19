
public class Zoo {
	//Write a class for “Animal”
	//1. Make a UML Diagram.
	//a. What are the characteristics
	//b. What are the actions?
	//c. What features do you need to protect?
	//2. Write the code for the class.
	//3. Write code in main to demonstrate the class can create instances of the class and
	//edit the appropriate member variables.
	
	public int year;
	private int legs;
	public String species;
	private String furry;
	private int weight;
	public String meansOfAttack;
	
	public Zoo (int y, int l, String s, String f, int weight, String mOA) {
		year = y; 
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
	public void setFurry(String f) {
		if (f.equals ("yes")) {
			furry = f;
		}
		else if (f.equals("no")) {
			furry =f;
		}
		else {
			furry = "yes";
			System.out.println("furry can only be 'yes' or 'no'. Defaulting to yes"); 
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
	public int getYear() {
		return year; 
	}
	public int getLegs() {
		return legs;
	}
	public String getFurry() {
		return furry;
	}
	public int getWeight() {
		return weight; 
	}
		
	public String toString() {
		if (furry.equals("yes")) {
			return "this animal is a " + species + ", born in " + year + " with " + legs + " legs. It weighs: " + weight +
		" pounds. It's main mean of attack is " + meansOfAttack  + ". And it is furry"; }
			else {
				return "this animal is a " + species + ", born in " + year + " with " + legs + " legs. It weighs: " + weight +
				" pounds. It's main mean of attack is " + meansOfAttack + ". And it is not furry"; }
}

	}

