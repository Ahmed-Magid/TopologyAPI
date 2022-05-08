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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topology topology = (Topology) o;
        return Objects.equals(id, topology.id) && Objects.equals(components, topology.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, components);
    }
}
