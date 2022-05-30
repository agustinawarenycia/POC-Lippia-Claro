package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Channel{

	@JsonProperty("id")
	private String id;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}
}