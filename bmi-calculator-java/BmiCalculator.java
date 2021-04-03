package bmiCalculator;

public class BmiCalculator {

	// variable declaration
	private double height;
	private double weight;
	private double bmi;
	private String bmiCategory;
	
	//getters and setters
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi(float bmi) {
		this.bmi = bmi;
	}
	public String getBmiCategory() {
		return bmiCategory;
	}
	public void setBmiCategory(String bmiCategory) {
		this.bmiCategory = bmiCategory;
	}
	
	//method to calculate BMI
	public double calculateBmi(double ht, double wt)
	{
		bmi = wt / (ht * ht);
		
		return bmi;
	}
	
	//method to decide BMI Category
	public String decideCategory(double bmi)
	{
		if(bmi<= 18.5)
			bmiCategory = "Underweight";
		else if((bmi>=18.6)&&(bmi<=24.9))
			bmiCategory = "Normal Weight";
		else if((bmi>=25)&&(bmi<=29.9))
			bmiCategory = "Overweight";
		else
			bmiCategory = "Obesity";
		
		return bmiCategory;
	}
}



















