package com.example.main.api;

import com.example.main.topology.Topology;
import com.example.main.topology.component.Component;
import com.example.main.util.JsonManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TopologyAPI implements API {

    private final JsonManager jsonManager;
    private final List<Topology> topologies;

    public TopologyAPI() {
        jsonManager = new JsonManager();
        topologies = new ArrayList<>();
    }

    @Override
    public Topology readJSON(String fileName) {
        Optional<Topology> topology = Optional.ofNullable(jsonManager.readJSON(fileName, Topology.class));
        topology.ifPresent(topologies::add);
        return topology.orElse(null);
    }

    @Override
    public boolean writeJSON(String fileName, String topologyID) {
        Optional<Topology> foundTopology = Optional.ofNullable(findTopology(topologyID));
        return foundTopology.isPresent() && jsonManager.writeJSON(fileName, foundTopology.get());
    }

    @Override
    public List<Topology> queryTopologies() {
        return topologies;
    }

    @Override
    public Topology findTopology(String topologyID) {
        return topologies.stream().filter(topology -> topology.getId().equals(topologyID)).findFirst().orElse(null);
    }

    @Override
    public boolean deleteTopology(String topologyID) {
        Optional<Topology> foundTopology = Optional.ofNullable(findTopology(topologyID));
        topologies.remove(foundTopology.get());
        return true;
    }

    @Override
    public List<Component> queryDevices(String topologyID) {
        Optional<Topology> foundTopology = Optional.ofNullable(findTopology(topologyID));
        return foundTopology.map(Topology::getComponents).orElse(List.of());
    }

    @Override
    public List<Component> queryDevicesWithNetListNode(String topologyID, String netListNodeID) {
        Optional<Topology> foundTopology = Optional.ofNullable(findTopology(topologyID));
        return foundTopology.map(topology -> topology.getComponents().stream().filter(component -> component.getNetlist().containsValue(netListNodeID)).toList()).orElse(List.of());
    }
}
