package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductOfferingQualificationItemItem{

	@JsonProperty("product")
	private Product product;

	@JsonProperty("alternateProductOfferingProposal")
	private List<AlternateProductOfferingProposalItem> alternateProductOfferingProposal;

	@JsonProperty("action")
	private String action;

	@JsonProperty("qualificationItemResult")
	private String qualificationItemResult;

	@JsonProperty("id")
	private String id;

	public void setProduct(Product product){
		this.product = product;
	}

	public Product getProduct(){
		return product;
	}

	public void setAlternateProductOfferingProposal(List<AlternateProductOfferingProposalItem> alternateProductOfferingProposal){
		this.alternateProductOfferingProposal = alternateProductOfferingProposal;
	}

	public List<AlternateProductOfferingProposalItem> getAlternateProductOfferingProposal(){
		return alternateProductOfferingProposal;
	}

	public void setAction(String action){
		this.action = action;
	}

	public String getAction(){
		return action;
	}

	public void setQualificationItemResult(String qualificationItemResult){
		this.qualificationItemResult = qualificationItemResult;
	}

	public String getQualificationItemResult(){
		return qualificationItemResult;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}
}