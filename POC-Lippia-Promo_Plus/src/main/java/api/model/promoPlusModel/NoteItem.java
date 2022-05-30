package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NoteItem{

	@JsonProperty("id")
	private String id;

	@JsonProperty("text")
	private String text;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}
}