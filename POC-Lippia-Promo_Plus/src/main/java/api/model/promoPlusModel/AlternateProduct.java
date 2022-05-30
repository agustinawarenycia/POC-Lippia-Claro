package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AlternateProduct{

	@JsonProperty("isBundle")
	private boolean isBundle;

	@JsonProperty("productCharacteristic")
	private List<ProductCharacteristicItem> productCharacteristic;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("productRelationship")
	private List<ProductRelationshipItem> productRelationship;

	@JsonProperty("id")
	private String id;

	@JsonProperty("isCustomerVisible")
	private boolean isCustomerVisible;

	@JsonProperty("productTerm")
	private List<ProductTermItem> productTerm;

	@JsonProperty("productPrice")
	private List<ProductPriceItem> productPrice;

	public void setIsBundle(boolean isBundle){
		this.isBundle = isBundle;
	}

	public boolean isIsBundle(){
		return isBundle;
	}

	public void setProductCharacteristic(List<ProductCharacteristicItem> productCharacteristic){
		this.productCharacteristic = productCharacteristic;
	}

	public List<ProductCharacteristicItem> getProductCharacteristic(){
		return productCharacteristic;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setProductRelationship(List<ProductRelationshipItem> productRelationship){
		this.productRelationship = productRelationship;
	}

	public List<ProductRelationshipItem> getProductRelationship(){
		return productRelationship;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setIsCustomerVisible(boolean isCustomerVisible){
		this.isCustomerVisible = isCustomerVisible;
	}

	public boolean isIsCustomerVisible(){
		return isCustomerVisible;
	}

	public void setProductTerm(List<ProductTermItem> productTerm){
		this.productTerm = productTerm;
	}

	public List<ProductTermItem> getProductTerm(){
		return productTerm;
	}

	public void setProductPrice(List<ProductPriceItem> productPrice){
		this.productPrice = productPrice;
	}

	public List<ProductPriceItem> getProductPrice(){
		return productPrice;
	}
}