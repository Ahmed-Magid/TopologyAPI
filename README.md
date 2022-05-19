

# Topology API
A software that provides the functionality to access, manage and store device topologies.

## Used Technologies
1. [Java Programming Language](https://www.java.com/en/ "Java Programming Language")
2. [Jackson Core](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-core/latest/index.html "Jackson Core")
3. [Lombok](https://projectlombok.org/ "Lombok")
4. [Maven Build Tool](https://maven.apache.org/ "Maven Build Tool")
5. [JUnit 5](https://junit.org/junit5/ "JUnit 5")
6. [SonarQube Code Analysis Tool](https://www.sonarqube.org/ "SonarQube Code Analysis Tool")

## Why Java?


- Java offers a great way to deal with JSON files with the help of **Jackson Core API**, a library that can easily convert between **POJOs** and **JSON** using serialization and deserialization features that maps class attributes with JSON keys and vice-versa.
- Java is a strong Object-Oriented Programming Language that can implement software engineering principles effectively.


## Usage

- This software allows you to manage topologies located in JSON file and/or memory.
- A topology contains a number of different kinds of components and a net list.
- This software allows you to do the following:
  #### 1. Read a topology from JSON file and store it in memory.
  	 Topology readJSON(String fileName);
  #### 2. Write a topology object to a JSON file.
  	boolean writeJSON(String fileName, String topologyID);
  #### 3. Query about the topology currently in the memory.
  	List<Topology> queryTopologies();
  #### 4. Find a topology in the memory given its ID.
  	Topology findTopology(String topologyID);`
  #### 5. Delete a topology from the memory given its ID.
  	boolean deleteTopology(String topologyID);
  #### 6. List the components of a topology given its ID.
  	List<Component> queryDevices(String topologyID);
  #### 7. List the components of a topology that are connected to given net list, given the ID of the topology.
  	List<Component> queryDevicesWithNetListNode(String topologyID, String netListNodeID);
