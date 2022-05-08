package com.example.main.topology.component.nmos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class M1 {
    @JsonProperty("default")
    private int defaultValue;
    private int min;
    private int max;
}
