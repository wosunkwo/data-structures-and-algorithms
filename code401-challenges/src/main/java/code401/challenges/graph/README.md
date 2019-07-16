# Graphs
<!-- Short summary or background information -->
This folder contains 3 java classes:

Node.js - This holds my node object in my graph

Edge.js - This holds my Edges object in my graph

Graph.js - This holds my Graph object that stores the connections between my nodes and edges

## Challenge
<!-- Description of the challenge -->
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

AddNode()

Adds a new node to the graph

Takes in the value of that node

Returns the added node

AddEdge()

Adds a new edge between two nodes in the graph

Include the ability to have a “weight”

Takes in the two nodes to be connected by the edge

Both nodes should already be in the Graph

GetNodes()

Returns all of the nodes in the graph as a collection (set, list, or similar)

GetNeighbors()

Returns a collection of nodes connected to the given node

Takes in a given node

Include the weight of the connection in the returned collection

Size()

Returns the total number of nodes in the graph

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I Utilized the Single-responsibility principle: any methods I wrote waas clean, reusable, and an abstract component
part to the whole challenge.


## API
<!-- Description of each method publicly available in your Graph -->
## addNode():
This takes in a node object an adds it to the graph as long as it doesnt already exist, and returns that node if it
was successfully added
*********************************************************************************************************************

## addEdge():
This takes in two node objects and a weight for the edge and creates a new edge an links it to the two nodes
it returns true if the edge was successfully added or false if it wasnt
*********************************************************************************************************************

## getNodes():
This returns all the nodes in my graph in form of a hashset
*********************************************************************************************************************

## getNeighbour():
This takes in a node object and as long as it already exists in the graph, it will return all the
nodes that share an edge with the passed in node as well as the weight of the edges in form of a hashmap
*********************************************************************************************************************

## size():
This returns the size of the graph (the number of nodes in the graph)
*********************************************************************************************************************

## CODE CHALLENGE

# Challenge Summary
<!-- Short summary or background information -->
I added a new method to my graph class called breadthFirst(). This method goes through my graph and adds every node in my graph to an arrayList using the breadth first logic.


## Challenge Description
<!-- Description of the challenge -->
Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of the built-in methods available to your language, return a collection of nodes in the order they were visited. Display the collection.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I Utilized the Single-responsibility principle: any methods I wrote waas clean, reusable, and an abstract component
part to the whole challenge.

BreadFirst()

Time Complexity: Big 0(n * m) where n is the number of nodes in the graph, and m is the number of edges each node has
Space Complexity: Big 0(n) where n is the number of nodes in the graph



## Solution
<!-- Embedded whiteboard image -->
