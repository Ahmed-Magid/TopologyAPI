package com.example.main.topology.component.nmos;

import com.example.main.topology.component.Component;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor

public class Nmos extends Component {
    @JsonProperty("m(1)")
    private M1 m1;

    public Nmos(String id, M1 m1, Map<String, String> netList) {
        super("nmos", id, netList);
        this.m1 = m1;
    }

    @Override
    public String toString() {
        return String.format("Nmos(id=%s, m1=%s, netList=%s)", id, m1, netlist);
    }
}
