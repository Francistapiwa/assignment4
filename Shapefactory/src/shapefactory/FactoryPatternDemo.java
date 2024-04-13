/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapefactory;

/**
 *
 * @author tapiw
 */
public class FactoryPatternDemo {
    public class static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory ();
        
//get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        
        // call draw method of Circle
        shape1.draw();
        
        //get sn object of shape Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        
        //call draw method of rectangle
        shape2.draw();
        
        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");
        
        //call draw method of circle
        shape3.draw();
    }
}
