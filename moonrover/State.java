/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moonrover;
/**
 * State class - the description of this class
 * @author tapiw
 * @version 9.1
 */
public class State {
    protected String name = "NULL";
    protected String subState = "NULL";

    State() {}
    
    /** 
     * Press right pedal 
     * @param numOfTimesPressed Use to get how many times pressed
     * @return boolean
     */
    public Boolean pressRightPedal(int numOfTimesPressed) {
        return false;
    }
    
    
    /** 
     * Press right pedal 
     * @param numOfSecondsPressed
     * @param numOfTimesPressed Use to get how many times pressed
     * @return boolean
     */
    protected void pressRightPedalForTime(int numOfSecondsPressed) {}

    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        return false;
    }

    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        return false;
    }

    protected void voidPressLeftPedalForTime(int numOfSecondsPressed) {}
}