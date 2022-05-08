package com.example.main.topology.component;

import com.example.main.topology.component.nmos.Nmos;
import com.example.main.topology.component.resistor.Resistor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import java.util.Map;

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
}
