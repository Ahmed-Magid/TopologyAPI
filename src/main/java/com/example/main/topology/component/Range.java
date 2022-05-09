package com.example.main.topology.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Range {
    @JsonProperty("default")
    private float defaultValue;
    private float min;
    private float max;
}
