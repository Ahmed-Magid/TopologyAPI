


# Topology API
A software that provides the functionality to access, manage and store device topologies.

## Why Java?


- Java offers a great way to deal with JSON files with the help of **Jackson Core API**, a library that can easily convert between **POJOs** and **JSON** using serialization and deserialization features that maps class attributes with JSON keys and vice-versa.
- Java is a strong Object-Oriented Programming Language that can implement software engineering principles effectively.

## 🌐 Used Technologies
1. [Java Programming Language](https://www.java.com/en/ "Java Programming Language")
2. [Jackson Core](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-core/latest/index.html "Jackson Core")
3. [Lombok](https://projectlombok.org/ "Lombok")
4. [Maven Build Tool](https://maven.apache.org/ "Maven Build Tool")
5. [JUnit 5](https://junit.org/junit5/ "JUnit 5")
6. [SonarQube Code Analysis Tool](https://www.sonarqube.org/ "SonarQube Code Analysis Tool")


## 🧩 Installation

 Add the following dependencies to your **pom.xml** for **Maven**, or **build.gradle** for **Gradle**.
 

 - **Jackson Core (Maven)**
 ```
 <dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.0.1</version>
</dependency>
 ```
 
 - **Jackson Core (Gradle)**
 ```
 implementation group: 'com.fasterxml.jackson.core', name: 'jackson-databind', version: '2.0.1'
 ```
 
 - **Lombok (Maven)**
 ```
 <dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.24</version>
    <scope>provided</scope>
</dependency> 
 ```
 - **Lombok (Gradle)**
 ```
 compileOnly group: 'org.projectlombok', name: 'lombok', version: '1.18.24'
 ```
 
 - **JUnit 5 (Maven)**
 ```
 <dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.8.2</version>
    <scope>test</scope>
</dependency
 ```

- **JUnit 5 (Gradle)**
```
testImplementation group: 'junit', name: 'junit', version: '4.13.2'
testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.8.2'
```

- **SonarQube (Maven)**
```
<dependency>
    <groupId>org.sonarsource.scanner.maven</groupId>
    <artifactId>sonar-maven-plugin</artifactId>
    <version>3.9.1.2184</version>
</dependency>
```

- **SonarQube (Gradle)**
```
implementation group: 'org.sonarsource.scanner.maven', name: 'sonar-maven-plugin', version: '3.9.1.2184'
```

## ⚙️ Usage

- This software allows you to manage topologies located in JSON file and/or memory.
- A topology contains a number of different kinds of components and a net list.
- This software allows you to do the following:
  #### 1. Read a topology from JSON file and store it in memory.
  ```java
  Topology readJSON(String fileName);
  ```
  #### 2. Write a topology object to a JSON file.
  ```java
  boolean writeJSON(String fileName, String topologyID);
  ```
  #### 3. Query about the topology currently in the memory.
  ```java
  List<Topology> queryTopologies();
  ```
  #### 4. Find a topology in the memory given its ID.
  ```java
  Topology findTopology(String topologyID);
  ```
  #### 5. Delete a topology from the memory given its ID.
  ```java
  boolean deleteTopology(String topologyID);
  ```
  #### 6. List the components of a topology given its ID.
  ```java
  List<Component> queryDevices(String topologyID);
  ```
  #### 7. List the components of a topology that are connected to given net list, given the ID of the topology.
  ```java
  List<Component> queryDevicesWithNetListNode(String topologyID, String netListNodeID);
  ```
