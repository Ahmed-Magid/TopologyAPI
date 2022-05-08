package com.example.main.topology.component.resistor;

import com.example.main.topology.component.Component;
import lombok.*;

import java.util.HashMap;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Resistor extends Component {
    private Resistance resistance;

    public Resistor(String id, Resistance resistance) {
        super("resistor", id, new HashMap<>());
        this.resistance = resistance;
    }
}
