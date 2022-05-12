package com.example.main.topology.component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Resistor extends Component {
    private Range resistance;

    public Resistor(String id, Range resistance, Map<String, String> netList) {
        super("resistor", id, netList);
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        return String.format("Resistor(id=%s, resistance=%s, netList=%s)", id, resistance, netlist);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resistor resistor = (Resistor) o;
        return super.equals(o) && Objects.equals(resistance, resistor.resistance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resistance);
    }
}
