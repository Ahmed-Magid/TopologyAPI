package com.example.main.api;

import com.example.main.topology.Topology;
import com.example.main.topology.component.Component;

import java.util.List;

public class TopologyAPI implements API {

    @Override
    public Topology readJSON(String fileName) {
        return null;
    }

    @Override
    public boolean writeJSON(String fileName, String topologyID) {
        return false;
    }

    @Override
    public List<Topology> queryTopologies() {
        return null;
    }

    @Override
    public boolean deleteTopology(String topologyID) {
        return false;
    }

    @Override
    public List<Component> queryDevices(String topologyID) {
        return null;
    }

    @Override
    public List<Component> queryDevicesWithNetListNode(String topologyID, String netListNodeID) {
        return null;
    }
}
