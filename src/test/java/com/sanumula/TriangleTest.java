package com.sanumula;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sanumula on 9/12/16.
 */
public class TriangleTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLengths1(){
        Triangle t = new Triangle(0,0,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLengths2(){
        Triangle t = new Triangle(2,1,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLengths3(){
        Triangle t = new Triangle(8,5,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLengths4(){
        Triangle t = new Triangle(-1,4,5);
    }

    @Test
    public void testEquilateral1(){
        Triangle t = new Triangle(5,5,5);
        Assert.assertEquals(TriangleType.EQUILATERAL,t.getType());
    }

    @Test
    public void testEquilateral2(){
        Triangle t = new Triangle(6.7,6.7,6.7);
        Assert.assertEquals(TriangleType.EQUILATERAL,t.getType());
    }

    @Test
    public void testIsoscelesTriangle1(){
        Triangle t= new Triangle(4,4,7);
        Assert.assertEquals(TriangleType.ISOSCELES,t.getType());
    }

    @Test
    public void testIsoscelesTriangle2(){
        Triangle t = new Triangle(5.98798,10,5.98798);
        Assert.assertEquals(TriangleType.ISOSCELES,t.getType());
    }

    @Test
    public void testScaleneTriangle1(){
        Triangle t = new Triangle(5,6,7);
        Assert.assertEquals(TriangleType.SCALENE,t.getType());
    }

    @Test
    public void testScaleneTriangle2(){
        Triangle t = new Triangle(5.56437,6.875,7.755343);
        Assert.assertEquals(TriangleType.SCALENE,t.getType());
    }


}
