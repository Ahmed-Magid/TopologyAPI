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

public class Topology {
    private String id;
    private List<Component> components;

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Topology topology = (Topology) other;
        return this.id.equals(topology.getId());
    }
}
