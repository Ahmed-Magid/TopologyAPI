package com.example.main.topology;

import com.example.main.topology.component.Component;
import lombok.*;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Topology {
    private String id;
    private List<Component> components;
}
