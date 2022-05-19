package com.example.main.api;

import com.example.main.api.API;
import com.example.main.api.TopologyAPI;
import com.example.main.topology.Topology;
import com.example.main.topology.component.Component;
import com.example.main.topology.component.Range;
import com.example.main.topology.component.Nmos;
import com.example.main.topology.component.Resistor;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class APITest {

    private static API api;
    private static Topology fileTopology;
    private static Topology manualFileTopology;

    @BeforeAll
    public static void initializeManualFileTopology() {
        Map<String, String> resistorNetList = new HashMap<>();
        resistorNetList.put("t1", "vdd");
        resistorNetList.put("t2", "n1");
        Map<String, String> nmosNetList = new HashMap<>();
        nmosNetList.put("drain", "n1");
        nmosNetList.put("gate", "vin");
        nmosNetList.put("source", "vss");
        List<Component> components = List.of(
                new Resistor("res1", new Range(100, 10, 1000), resistorNetList),
                new Nmos("m1", new Range(1.5f, 1, 2), nmosNetList)
        );
        manualFileTopology = new Topology("top1", components);
    }

    @BeforeEach
    public void setUp() {
        api = new TopologyAPI();
        fileTopology = api.readJSON("topology.json");
    }

    @Test
    void testReadJSON() {
        Assertions.assertEquals(manualFileTopology, fileTopology);
    }

    @Test
    void testWriteJSON() {
        Assertions.assertTrue(api.writeJSON("test.json", "top1"));
        Assertions.assertEquals(api.readJSON("test.json"), fileTopology);
    }

    @Test
    void testQueryTopologies() {
        Assertions.assertTrue(api.queryTopologies().contains(fileTopology));
    }

    @Test
    void testFindTopology() {
        Assertions.assertEquals(api.findTopology("top1"), fileTopology);
    }

    @Test
    void testDeleteTopology() {
        Assertions.assertTrue(api.deleteTopology("top1"));
        Assertions.assertFalse(api.queryTopologies().contains(fileTopology));
    }

    @Test
    void testQueryDevices() {
        Assertions.assertEquals(api.queryDevices("top1"), manualFileTopology.getComponents());
    }

    @Test
    void testQueryDevicesWithNetListNode() {
        Assertions.assertEquals(api.queryDevicesWithNetListNode("top1", "vss").get(0), fileTopology.getComponents().get(1));
    }
}
