package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductCharacteristicItem{

	@JsonProperty("valueType")
	private String valueType;

	@JsonProperty("name")
	private String name;

	@JsonProperty("value")
	private String value;

	public void setValueType(String valueType){
		this.valueType = valueType;
	}

	public String getValueType(){
		return valueType;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}
}