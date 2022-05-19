package com.example.main.topology.component;

import lombok.*;

import java.util.Map;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)

public class Resistor extends Component {
    private Range resistance;

    public Resistor(String id, Range resistance, Map<String, String> netList) {
        super("resistor", id, netList);
        this.resistance = resistance;
    }
}
