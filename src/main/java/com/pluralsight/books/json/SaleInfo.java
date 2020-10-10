package com.pluralsight.books.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.pluralsight.books.json.ImageLinks;
import com.pluralsight.books.json.IndustryIdentifier;
import com.pluralsight.books.json.PanelizationSummary;
import com.pluralsight.books.json.ReadingModes;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country",
        "saleability",
        "isEbook"
})
public class SaleInfo {

    @JsonProperty("country")
    private String country;
    @JsonProperty("saleability")
    private String saleability;
    @JsonProperty("isEbook")
    private Boolean isEbook;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("saleability")
    public String getSaleability() {
        return saleability;
    }

    @JsonProperty("saleability")
    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    @JsonProperty("isEbook")
    public Boolean getIsEbook() {
        return isEbook;
    }

    @JsonProperty("isEbook")
    public void setIsEbook(Boolean isEbook) {
        this.isEbook = isEbook;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
