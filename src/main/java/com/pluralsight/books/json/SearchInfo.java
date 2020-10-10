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
        "textSnippet"
})
public class SearchInfo {

    @JsonProperty("textSnippet")
    private String textSnippet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("textSnippet")
    public String getTextSnippet() {
        return textSnippet;
    }

    @JsonProperty("textSnippet")
    public void setTextSnippet(String textSnippet) {
        this.textSnippet = textSnippet;
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
