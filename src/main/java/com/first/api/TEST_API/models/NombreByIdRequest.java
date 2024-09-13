package com.first.api.TEST_API.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NombreByIdRequest {
    public Integer getId() {
        return Id;
    }

    @JsonProperty("id")
    Integer Id;
}
