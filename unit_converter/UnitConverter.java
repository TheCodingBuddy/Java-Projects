package cpm.codingbuddy.unit_converter;
public class UnitConverter {

	private Double kg;
	private Double grams;
		
	// getters and setters
	public Double getKg() {
		return kg;
	}
	public void setKg(Double kg) {
		this.kg = kg;
	}
	public Double getGrams() {
		return grams;
	}
	public void setGrams(Double grams) {
		this.grams = grams;
	}

	//convert kilogram to gram (1 kg = 1000 grams)
	public void convertKilogramToGram(Double kg) {
		grams = kg * 1000;
		setGrams(grams);
	}
	// Convert Gram to Kilogram (1 gram = 0.001 kg)
	public void convertGramToKilogram(Double gram) {
		kg = gram/1000;
		setKg(kg);
	}
	
	//Convert Pounds to Kilogram (1 lb = 2.20462262 kg)
	public void convertPoundToKilogram(Double pounds) {
		kg = pounds / 2.20462262;
		setKg(kg);
	}
	
	//Convert Pounds to Gram (1 lb = 453.59237 g )
	public void convertPoundToGrams(Double pounds) {
		grams = pounds * 453.59237;
		setGrams(grams);
	}
	
	//convert Milligrams to Kilograms (1 mg = 0.000001 kg) 
	public void convertMilligramsToKilogram(Double milligrams) {
		kg = milligrams * 0.000001;
		setKg(kg);
	}
		
	//convert Milligram to Gram (1 mg = 0.001 g)
	public void convertMilligramsToGrams(Double milligrams) {
		grams = milligrams * 0.001;
		setGrams(grams);
	}
}
