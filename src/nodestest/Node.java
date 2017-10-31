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
     *
     * @param newNodeId
     * @param newNodeName
     * @param newNodeParent
     */
    public Node( String newNodeId, String newNodeName, Node newNodeParent)
    {
        nodeId = newNodeId;
        nodeName = newNodeName;
        nodeParent = newNodeParent;
        nodeChildren = new ArrayList<>();
    }

    public Node()
    {
        this.nodeId = null;
        this.nodeName = null;
        this.parentString = null;
        this.nodeParent = null;
        this.nodeChildren = new ArrayList<>();
    }

    /**
     *
     */
    public void setRoot()
    {
        this.nodeParent = null;
    }

    /**
     *
     * @return
     */
    public String getNodeId()
    {
        return this.nodeId;
    }

    /**
     *
     * @return
     */
    public String getNodeName()
    {
        return this.nodeName;
    }

    /**
     *
     * @return
     */
    public Node getNodeParent()
    {
        return this.nodeParent;
    }

    /**
     *
     * @param newNodeId
     */
    public void setNodeId(String newNodeId)
    {
        this.nodeId = newNodeId;
    }

    /**
     *
     * @param newNodeName
     */
    public void setNodeName(String newNodeName)
    {
        this.nodeName = newNodeName;
    }

    public void setParentString(String parentString)
    {
        this.parentString = parentString;
    }

    public String getParentString()
    {
        return parentString;
    }

    /**
     *
     * @param newNodeParent
     */        
    public void addParent(Node newNodeParent)
    {
        this.nodeParent = newNodeParent;
    }

    public void addChild(Node childNode)
    {
        this.nodeChildren.add(childNode);
    }

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
