package com.example.main.topology.component;

import com.example.main.topology.component.Component;
import com.example.main.topology.component.Range;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor

public class Nmos extends Component {
    @JsonProperty("m(l)")
    private Range ml;

    public Nmos(String id, Range ml, Map<String, String> netList) {
        super("nmos", id, netList);
        this.ml = ml;
    }

    @Override
    public String toString() {
        return String.format("Nmos(id=%s, m1=%s, netList=%s)", id, ml, netlist);
    }
}
