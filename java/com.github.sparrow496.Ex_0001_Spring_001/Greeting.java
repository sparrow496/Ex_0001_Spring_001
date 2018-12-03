package hello;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting extends ResourceSupport {

    private final String content;
    private final String addicionalText;

    @JsonCreator
    public Greeting(
    		@JsonProperty("content") String content,
    		@JsonProperty("addicionalText") String addicionalText) 
    {
        this.content = content;
        this.addicionalText = addicionalText;
    }

    public String getContent() {
        return content;
    }
    
    public String getAddicionalText() {
		return addicionalText;
	}
}