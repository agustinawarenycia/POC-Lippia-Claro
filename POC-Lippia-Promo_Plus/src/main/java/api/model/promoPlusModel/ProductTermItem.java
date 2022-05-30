package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductTermItem{

	@JsonProperty("duration")
	private Duration duration;

	@JsonProperty("name")
	private String name;

	@JsonProperty("validFor")
	private ValidFor validFor;

	public void setDuration(Duration duration){
		this.duration = duration;
	}

	public Duration getDuration(){
		return duration;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setValidFor(ValidFor validFor){
		this.validFor = validFor;
	}

	public ValidFor getValidFor(){
		return validFor;
	}
}