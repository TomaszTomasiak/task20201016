package com.horus_task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyStructureTestSuite {

    private final MyStructure myStructure = new MyStructure();

    @Test
    public void testFindByNodeWithExistingCode() {

        //Given
        Node node1 = new Node("aaaaa", "11111");
        Node node2 = new CompositeNode("bbbbb", "22222");
        Node node3 = new Node("ccc", "333");
        CompositeNode compositeCode4 = new CompositeNode("dddd", "4444444");
        Node node5 = new Node("ee", "55");
        CompositeNode compositeNode6 = new CompositeNode("ffffff", "6");

        myStructure.addNodeToList(node1);
        myStructure.addNodeToList(node2);
        myStructure.addNodeToList(node3);
        myStructure.addNodeToList(compositeCode4);
        myStructure.addNodeToList(node5);
        myStructure.addNodeToList(compositeNode6);

        //When
        INode node = myStructure.findByCode("bbbbb");

        //Then
        assertEquals(node2, node);


    }

    @Test
    public void testFindByCodeWithNotExistingCode() {

        Node node1 = new Node("aaaaa", "11111");
        Node node2 = new CompositeNode("bbbbb", "22222");
        Node node3 = new Node("ccc", "333");
        CompositeNode compositeCode4 = new CompositeNode("dddd", "4444444");
        Node node5 = new Node("ee", "55");
        CompositeNode compositeNode6 = new CompositeNode("ffffff", "6");

        myStructure.addNodeToList(node1);
        myStructure.addNodeToList(node2);
        myStructure.addNodeToList(node3);
        myStructure.addNodeToList(compositeCode4);
        myStructure.addNodeToList(node5);
        myStructure.addNodeToList(compositeNode6);

        //When
        INode node = myStructure.findByCode("99999");

        //Then
        assertNull(null, node);


    }

    @Test
    public void testFindByRenderWithExistingRender() {

        Node node1 = new Node("aaaaa", "11111");
        Node node2 = new CompositeNode("bbbbb", "22222");
        Node node3 = new Node("ccc", "333");
        CompositeNode compositeCode4 = new CompositeNode("dddd", "4444444");
        Node node5 = new Node("ee", "55");
        CompositeNode compositeNode6 = new CompositeNode("ffffff", "6");

        myStructure.addNodeToList(node1);
        myStructure.addNodeToList(node2);
        myStructure.addNodeToList(node3);
        myStructure.addNodeToList(compositeCode4);
        myStructure.addNodeToList(node5);
        myStructure.addNodeToList(compositeNode6);

        //When
        INode node = myStructure.findByRenderer("4444444");

        //Then
        assertEquals(node, compositeCode4);
    }

    @Test
    public void testFindByRenderWithNotExistingRender() {

        Node node1 = new Node("aaaaa", "11111");
        Node node2 = new CompositeNode("bbbbb", "22222");
        Node node3 = new Node("ccc", "333");
        CompositeNode compositeCode4 = new CompositeNode("dddd", "4444444");
        Node node5 = new Node("ee", "55");
        CompositeNode compositeNode6 = new CompositeNode("ffffff", "6");

        myStructure.addNodeToList(node1);
        myStructure.addNodeToList(node2);
        myStructure.addNodeToList(node3);
        myStructure.addNodeToList(compositeCode4);
        myStructure.addNodeToList(node5);
        myStructure.addNodeToList(compositeNode6);

        //When
        INode node = myStructure.findByRenderer("xxx");

        //Then
        assertNull(null, node);
    }

    @Test
    public void testFindAllNodes() {

        Node node1 = new Node("aaaaa", "11111");
        Node node2 = new CompositeNode("bbbbb", "22222");
        Node node3 = new Node("ccc", "333");
        CompositeNode compositeCode4 = new CompositeNode("dddd", "4444444");
        Node node5 = new Node("ee", "55");
        CompositeNode compositeNode6 = new CompositeNode("ffffff", "6");

        myStructure.addNodeToList(node1);
        myStructure.addNodeToList(node2);
        myStructure.addNodeToList(node3);
        myStructure.addNodeToList(compositeCode4);
        myStructure.addNodeToList(node5);
        myStructure.addNodeToList(compositeNode6);

        //When
        int x = myStructure.count();

        //Then
        assertEquals(6, x);


    }

    @Test
    public void testShouldCreateEmptyListOfNodes() {

        //When
        int x = myStructure.count();

        //Then
        assertEquals(0, x);

    }
}
