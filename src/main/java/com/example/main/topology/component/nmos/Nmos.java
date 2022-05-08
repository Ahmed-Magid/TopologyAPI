package com.example.main.topology.component.nmos;

import com.example.main.topology.component.Component;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.HashMap;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Nmos extends Component {
    @JsonProperty("m(1)")
    private M1 m1;

    public Nmos(String id, M1 m1) {
        super("nmos", id, new HashMap<>());
        this.m1 = m1;
    }
}
