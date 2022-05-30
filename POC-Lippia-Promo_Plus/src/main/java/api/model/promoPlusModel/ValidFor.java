package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValidFor{

	@JsonProperty("startDateTime")
	private String startDateTime;

	@JsonProperty("endDateTime")
	private String endDateTime;

	public void setStartDateTime(String startDateTime){
		this.startDateTime = startDateTime;
	}

	public String getStartDateTime(){
		return startDateTime;
	}

	public void setEndDateTime(String endDateTime){
		this.endDateTime = endDateTime;
	}

	public String getEndDateTime(){
		return endDateTime;
	}
}