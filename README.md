# JPA Simple App Maven Archetype

This project store a Maven Archetype to create projects Java that have only JPA, to study purposes.

## Install

```shell
$ git clone 
$ cd jpa-simple-app-archetype
$ mvn install
```

## Generate project

```shell
mvn archetype:generate                                  \
  -DarchetypeGroupId=in.gilsondev.archetypes            \
  -DarchetypeArtifactId=jpa-simple-app                  \
  -DarchetypeVersion=1.0-SNAPSHOT                       \
  -DgroupId=<my.groupid>                                \
  -DartifactId=<my-artifactId>
```