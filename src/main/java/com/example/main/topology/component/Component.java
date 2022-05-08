package com.example.main.topology.component;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public abstract class Component {
    protected String type;
    protected String id;
    protected Map<String, String> netlist;
}
