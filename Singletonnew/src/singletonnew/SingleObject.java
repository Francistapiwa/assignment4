/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonnew;

/**
 *
 * @author tapiw
 */
public class SingleObject {
 //create an object of SingleObject
    private static SingleObject instance = new SingleObject();
 //Make the constructor private so that this class cannot be instantiated
    private SingleObject(){}
 //Get the only object available
 public static SingleObject getInstance(){
 return instance;}

    void showMessage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
