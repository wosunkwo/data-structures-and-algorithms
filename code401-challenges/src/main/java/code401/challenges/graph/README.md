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
