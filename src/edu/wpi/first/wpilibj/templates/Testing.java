
package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Testing extends SimpleRobot {

    private double[] variables = new double[5];
    
    public void autonomous() {
        
    }

    public void operatorControl() {
        variables[0] = SmartDashboard.getNumber("Variable 1: ");
        variables[1] = SmartDashboard.getNumber("Variable 2: ");
        variables[2] = SmartDashboard.getNumber("Variable 3: ");
        variables[3] = SmartDashboard.getNumber("Variable 4: ");
        variables[4] = SmartDashboard.getNumber("Variable 5: ");
    }
    
    public void test() {
    
    }
}
