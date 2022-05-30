package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Price{

	@JsonProperty("taxIncludedAmount")
	private TaxIncludedAmount taxIncludedAmount;

	public void setTaxIncludedAmount(TaxIncludedAmount taxIncludedAmount){
		this.taxIncludedAmount = taxIncludedAmount;
	}

	public TaxIncludedAmount getTaxIncludedAmount(){
		return taxIncludedAmount;
	}
}