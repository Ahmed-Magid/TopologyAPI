package com.example.main.topology;

import com.example.main.topology.component.Component;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Topology {
    private String id;
    List<Component> components;
}
