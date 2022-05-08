package com.example.main.api;

import com.example.main.topology.Topology;
import com.example.main.topology.component.Component;
import com.example.main.util.JsonManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TopologyAPI implements API {

    private JsonManager jsonManager;
    private List<Topology> topologies;

    public TopologyAPI() {
        jsonManager = new JsonManager();
        topologies = new ArrayList<>();
    }

    @Override
    public Topology readJSON(String fileName) {
        Optional<Topology> topology = Optional.ofNullable(jsonManager.readJSON(fileName, Topology.class));
        topology.ifPresent(topo -> topologies.add(topo));
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
        return foundTopology.isPresent() && topologies.remove(foundTopology.get());
    }

    @Override
    public List<Component> queryDevices(String topologyID) {
        Optional<Topology> foundTopology = Optional.ofNullable(findTopology(topologyID));
        return foundTopology.map(Topology::getComponents).orElse(null);
    }

    @Override
    public List<Component> queryDevicesWithNetListNode(String topologyID, String netListNodeID) {
        Optional<Topology> foundTopology = Optional.ofNullable(findTopology(topologyID));
        return foundTopology.map(topology -> topology.getComponents().stream().filter(component -> component.getNetlist().containsValue(netListNodeID)).toList()).orElse(null);
    }
}
