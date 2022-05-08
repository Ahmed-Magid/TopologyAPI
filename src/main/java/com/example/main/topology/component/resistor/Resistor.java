package com.example.main.topology.component.resistor;

import com.example.main.topology.component.Component;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Resistor extends Component {
    private Resistance resistance;

    public Resistor(String id, Resistance resistance, Map<String, String> netList) {
        super("resistor", id, netList);
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        return String.format("Resistor(id=%s, resistance=%s, netList=%s)", id, resistance, netlist);
    }
}
