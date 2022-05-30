package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RelatedPartyItem{

	@JsonProperty("role")
	private String role;

	@JsonProperty("id")
	private String id;

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}
}