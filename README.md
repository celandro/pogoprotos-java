# pogoprotos-java
Provides compiled java bindings from https://github.com/AeonLucid/POGOProtos/tree/master

The latest protos can be imported into any maven project by adding the following to your pom.xml
```
<repositories>
    <repository>
        <id>pogoprotos-java-mvn-repo</id>
        <url>https://raw.github.com/celandro/pogoprotos-java/mvn-repo/</url>
        <snapshots>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
        </snapshots>
    </repository>
</repositories>
<dependencies>
<dependency>
    	<groupId>com.pokebattler</groupId>
    	<artifactId>pogoprotos</artifactId>
    	<version>${gamemaster.version}</version>
	</dependency>
</dependencies>
```

Quick build instructions

1. Pull latest POGOProtos
  * `git submodule update --init --recursive`
  * `cd POGOProtos && git pull origin master`
2. Update the version to the latest version number (will be in the tags)
  * modify pom.xml     <version>2.8.0</version>
3. Build project 
  * `mvn install`
  * ---OR---
  * `docker run -it --rm --name my-maven-project  -v "C:\Users\celan\.m2":/root/.m2 -v "F:\PokeBattler\pogoprotos-java":/usr/src/mymaven -w /usr/src/mymaven maven:3.2-jdk-7 mvn clean install`
4. Release project same as above but with deploy
  * `mvn deploy`
* ---OR---
  * `docker run -it --rm --name my-maven-project  -v "C:\Users\celan\.m2":/root/.m2 -v "F:\PokeBattler\pogoprotos-java":/usr/src/mymaven -w /usr/src/mymaven maven:3.2-jdk-7 mvn clean install deploy`
