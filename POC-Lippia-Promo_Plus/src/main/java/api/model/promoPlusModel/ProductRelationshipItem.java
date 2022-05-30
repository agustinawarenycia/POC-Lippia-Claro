package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductRelationshipItem{

	@JsonProperty("product")
	private Product product;

	@JsonProperty("relationshipType")
	private String relationshipType;

	public void setProduct(Product product){
		this.product = product;
	}

	public Product getProduct(){
		return product;
	}

	public void setRelationshipType(String relationshipType){
		this.relationshipType = relationshipType;
	}

	public String getRelationshipType(){
		return relationshipType;
	}
}