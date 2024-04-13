/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonnew;

/**
 *
 * @author tapiw
 */
public class SingletonPatternDemo { 
    
    public static void main (String[] args){
      //Illegal construct
      //compile time error : The constructor single object is not available
      //SingleObject object = newSingleObject;
      
      //Get the only object available  
      SingleObject object = SingleObject.getInstance();
     //show message
      object.showMessage();
  }  
}
