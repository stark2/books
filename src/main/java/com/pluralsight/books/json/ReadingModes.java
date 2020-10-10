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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "text",
        "image"
})
public class ReadingModes {

    @JsonProperty("text")
    private Boolean text;
    @JsonProperty("image")
    private Boolean image;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("text")
    public Boolean getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(Boolean text) {
        this.text = text;
    }

    @JsonProperty("image")
    public Boolean getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Boolean image) {
        this.image = image;
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
