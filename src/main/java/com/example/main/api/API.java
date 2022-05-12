package com.example.main.api;

import com.example.main.topology.Topology;
import com.example.main.topology.component.Component;

import java.util.List;

public interface API {
    /**
     * Reads the specified JSON file containing a topology, stores it in memory, and returns it as a POJO.
     * @param fileName The name of the JSON file to be read.
     * @return The corresponding topology object to the JSON object.
     */
    Topology readJSON(String fileName);

    /**
     * Searches for the topology with the specified ID and write it as JSON object in the specified JSON file.
     * @param fileName The resulting JSON file after writing.
     * @param topologyID The ID of the topology object to be written.
     * @return True if writing is complete, otherwise false.
     */
    boolean writeJSON(String fileName, String topologyID);

    /**
     * @return The current topologies in the memory.
     */
    List<Topology> queryTopologies();

    /**
     * Searches in the memory for a topology with the specified ID.
     * @param topologyID The ID of the topology to be found.
     * @return The topology object if found in memory, otherwise null.
     */
    Topology findTopology(String topologyID);

    /**
     * Deletes from memory the topology with the specified ID if found.
     * @param topologyID The ID of the topology to be deleted.
     * @return True if found and deleted successfully, otherwise false.
     */
    boolean deleteTopology(String topologyID);

    /**
     * Returns the list of components of the topology with specified ID if found.
     * @param topologyID The ID of the topology.
     * @return A list of the components of the topology.
     */
    List<Component> queryDevices(String topologyID);

    /**
     * Returns a list of the components of the topology of the specified ID that contains the specified value in its components' netlist.
     * @param topologyID The ID of the topology.
     * @param netListNodeID The value of the components' netlist to be searched for.
     * @return The list of components of the topology the contains the specified value.
     */
    List<Component> queryDevicesWithNetListNode(String topologyID, String netListNodeID);
}
