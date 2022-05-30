package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlternateProductOfferingProposalItem{

	@JsonProperty("id")
	private String id;

	@JsonProperty("alternateProduct")
	private AlternateProduct alternateProduct;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setAlternateProduct(AlternateProduct alternateProduct){
		this.alternateProduct = alternateProduct;
	}

	public AlternateProduct getAlternateProduct(){
		return alternateProduct;
	}
}