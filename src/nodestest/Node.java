/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodestest;

import java.util.ArrayList;

/**
 *
 * @author remiama
 */
public class Node {
    
    public static final String NODE_TYPE = "NODE";
    public String nodeId;
    public String nodeName;
    public String parentString;
    public Node nodeParent;
    public ArrayList<Node> nodeChildren;

    /**
     * Sets all values to null
     */
    public Node()
    {
        this.nodeId = null;
        this.nodeName = null;
        this.parentString = null;
        this.nodeParent = null;
        this.nodeChildren = new ArrayList<>();
    }

    /**
     * Sets the value of the root node by making sure it has no parent
     */
    public void setRoot()
    {
        this.nodeParent = null;
    }

    /**
     * This methods returns the node IF of the object calling the method.
     * @return Node ID of the object calling the method
     */
    public String getNodeId()
    {
        return this.nodeId;
    }

    /**
     * This method returns the name of the node as a string
     * @return A string with the name of the node
     */
    public String getNodeName()
    {
        return this.nodeName;
    }

    /**
     * This methods returns the parent of the caller.
     * @return A node object that is the parent
     */
    public Node getNodeParent()
    {
        return this.nodeParent;
    }

    /**
     * This method sets the node ID of the object
     * @param newNodeId The ID of the node as a string
     */
    public void setNodeId(String newNodeId)
    {
        this.nodeId = newNodeId;
    }

    /**
     * This sets the name of the node.
     * @param newNodeName The name of the node as a string.
     */
    public void setNodeName(String newNodeName)
    {
        this.nodeName = newNodeName;
    }

//    /**
//     * This method sets th
//     * @param parentString 
//     */
//    public void setParentString(String parentString)
//    {
//        this.parentString = parentString;
//    }
//
//    public String getParentString()
//    {
//        return parentString;
//    }

    /**
     * This method sets a reference to a parent node.
     * @param newNodeParent The Node object that is the parent of the caller
     */        
    public void addParent(Node newNodeParent)
    {
        this.nodeParent = newNodeParent;
    }

    /**
     * This method adds a child the arrayList of children of the caller
     * @param childNode The arrayList of children
     */
    public void addChild(Node childNode)
    {
        this.nodeChildren.add(childNode);
    }

    /**
     * This method returns all of the children strings from the arrayList
     * as a String. If a leaf node, returns a "leaf node" string.
     * @return The node names of the children or a "leaf node" string
     */
    public String getChildrenStrings()
    {
        String childrenList;

        if( !this.nodeChildren.isEmpty() )
        {
        childrenList = nodeChildren.toString();
        
        return childrenList;             
        }
        else
        {
            return "leaf node";
        }

    }

}
