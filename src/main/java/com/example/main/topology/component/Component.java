package com.example.main.topology.component;

import com.example.main.topology.component.nmos.Nmos;
import com.example.main.topology.component.resistor.Resistor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import java.util.Map;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(Resistor.class),
        @JsonSubTypes.Type(Nmos.class) }
)
public abstract class Component {
    protected String type;
    protected String id;
    protected Map<String, String> netlist;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return Objects.equals(type, component.type) && Objects.equals(id, component.id) && Objects.equals(netlist, component.netlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, netlist);
    }
}
