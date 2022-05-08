package com.example.main.topology.component.resistor;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Resistance {
    @JsonProperty("default")
    private int defaultValue;
    private int min;
    private int max;
}
