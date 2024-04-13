/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapefactory;

/**
 *
 * @author tapiw
 */
public class Factoryshapecreation {
    //use getShape method to get an object of type Shape
    public Shape getShape (String shapeType){
        if(shapeType==null){
            return null;
        }
   if (shapeType.equalsIgnoreCase("CIRCLE")){
       return (Shape) new Circle();
   }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
       return (Shape) new Rectangle();
   }else if(shapeType.equalsIgnoreCase("SQUARE")){     
      return (Shape) new Square();
    }
return null;
}
}
