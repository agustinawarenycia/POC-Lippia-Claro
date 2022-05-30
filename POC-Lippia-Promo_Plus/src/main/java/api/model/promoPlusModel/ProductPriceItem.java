package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductPriceItem{

	@JsonProperty("price")
	private Price price;

	@JsonProperty("priceType")
	private String priceType;

	public void setPrice(Price price){
		this.price = price;
	}

	public Price getPrice(){
		return price;
	}

	public void setPriceType(String priceType){
		this.priceType = priceType;
	}

	public String getPriceType(){
		return priceType;
	}
}