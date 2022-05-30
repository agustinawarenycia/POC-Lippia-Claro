package api.model.promoPlusModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponsePromoPlusModel{

	@JsonProperty("note")
	private List<NoteItem> note;

	@JsonProperty("channel")
	private Channel channel;

	@JsonProperty("description")
	private String description;

	@JsonProperty("provideAlternative")
	private boolean provideAlternative;

	@JsonProperty("provideUnavailabilityReason")
	private boolean provideUnavailabilityReason;

	@JsonProperty("relatedParty")
	private List<RelatedPartyItem> relatedParty;

	@JsonProperty("provideOnlyAvailable")
	private boolean provideOnlyAvailable;

	@JsonProperty("productOfferingQualificationDate")
	private String productOfferingQualificationDate;

	@JsonProperty("productOfferingQualificationItem")
	private List<ProductOfferingQualificationItemItem> productOfferingQualificationItem;

	@JsonProperty("instantSyncQualification")
	private boolean instantSyncQualification;

	@JsonProperty("qualificationResult")
	private String qualificationResult;

	@JsonProperty("effectiveQualificationDate")
	private String effectiveQualificationDate;

	@JsonProperty("id")
	private String id;

	@JsonProperty("place")
	private List<PlaceItem> place;

	@JsonProperty("state")
	private String state;

	@JsonProperty("category")
	private Category category;

	public void setNote(List<NoteItem> note){
		this.note = note;
	}

	public List<NoteItem> getNote(){
		return note;
	}

	public void setChannel(Channel channel){
		this.channel = channel;
	}

	public Channel getChannel(){
		return channel;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setProvideAlternative(boolean provideAlternative){
		this.provideAlternative = provideAlternative;
	}

	public boolean isProvideAlternative(){
		return provideAlternative;
	}

	public void setProvideUnavailabilityReason(boolean provideUnavailabilityReason){
		this.provideUnavailabilityReason = provideUnavailabilityReason;
	}

	public boolean isProvideUnavailabilityReason(){
		return provideUnavailabilityReason;
	}

	public void setRelatedParty(List<RelatedPartyItem> relatedParty){
		this.relatedParty = relatedParty;
	}

	public List<RelatedPartyItem> getRelatedParty(){
		return relatedParty;
	}

	public void setProvideOnlyAvailable(boolean provideOnlyAvailable){
		this.provideOnlyAvailable = provideOnlyAvailable;
	}

	public boolean isProvideOnlyAvailable(){
		return provideOnlyAvailable;
	}

	public void setProductOfferingQualificationDate(String productOfferingQualificationDate){
		this.productOfferingQualificationDate = productOfferingQualificationDate;
	}

	public String getProductOfferingQualificationDate(){
		return productOfferingQualificationDate;
	}

	public void setProductOfferingQualificationItem(List<ProductOfferingQualificationItemItem> productOfferingQualificationItem){
		this.productOfferingQualificationItem = productOfferingQualificationItem;
	}

	public List<ProductOfferingQualificationItemItem> getProductOfferingQualificationItem(){
		return productOfferingQualificationItem;
	}

	public void setInstantSyncQualification(boolean instantSyncQualification){
		this.instantSyncQualification = instantSyncQualification;
	}

	public boolean isInstantSyncQualification(){
		return instantSyncQualification;
	}

	public void setQualificationResult(String qualificationResult){
		this.qualificationResult = qualificationResult;
	}

	public String getQualificationResult(){
		return qualificationResult;
	}

	public void setEffectiveQualificationDate(String effectiveQualificationDate){
		this.effectiveQualificationDate = effectiveQualificationDate;
	}

	public String getEffectiveQualificationDate(){
		return effectiveQualificationDate;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setPlace(List<PlaceItem> place){
		this.place = place;
	}

	public List<PlaceItem> getPlace(){
		return place;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}
}