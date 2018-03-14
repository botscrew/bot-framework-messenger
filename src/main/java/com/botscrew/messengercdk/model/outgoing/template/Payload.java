package com.botscrew.messengercdk.model.outgoing.template;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Payload {

    @JsonProperty("template_type")
    private String templateType;

    public Payload(String templateType) {
        this.templateType = templateType;
    }
}
