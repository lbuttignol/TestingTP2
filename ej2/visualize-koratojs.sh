#!/bin/bash
CP=lib/korat/korat.jar:./lib/korat/alloy4viz.jar:./lib/korat/commons-cli-1.0.jar:./lib/korat/javassist.jar:./lib/korat/junit.jar:./bin/
	
# java -cp $CP korat.Korat --class cachelist.NodeCachingLinkedList --args 2,1 --serialize "example.example"  --printCandVects	
java -cp $CP korat.Korat --class cachelist.NodeCachingLinkedList --args 4,3 --visualize  --printCandVects	

# --cvExpected 2