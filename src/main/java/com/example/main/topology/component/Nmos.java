package com.example.main.topology.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nmos nmos = (Nmos) o;
        return super.equals(o) && Objects.equals(ml, nmos.ml);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ml);
    }
}
