package com.example.main.topology.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class Range {
    @JsonProperty("default")
    private float defaultValue;
    private float min;
    private float max;
}
