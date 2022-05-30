package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Duration{

	@JsonProperty("amount")
	private double amount;

	@JsonProperty("units")
	private String units;

	public void setAmount(double amount){
		this.amount = amount;
	}

	public double getAmount(){
		return amount;
	}

	public void setUnits(String units){
		this.units = units;
	}

	public String getUnits(){
		return units;
	}
}