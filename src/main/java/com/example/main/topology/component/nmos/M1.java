package com.example.main.topology.component.nmos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class M1 {
    @JsonProperty("default")
    private float defaultValue;
    private int min;
    private int max;
}
