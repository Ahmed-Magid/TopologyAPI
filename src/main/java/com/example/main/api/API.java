package com.example.main.api;

import com.example.main.topology.Topology;
import com.example.main.topology.component.Component;

import java.util.List;

public interface API {
    Topology readJSON(String fileName);
    boolean writeJSON(String fileName, String topologyID);
    List<Topology> queryTopologies();
    Topology findTopology(String topologyID);
    boolean deleteTopology(String topologyID);
    List<Component> queryDevices(String topologyID);
    List<Component> queryDevicesWithNetListNode(String topologyID, String netListNodeID);
}
