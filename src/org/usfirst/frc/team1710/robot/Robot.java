
package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
    final String defaultAuto = "Default";
    final String customAuto = "My Auto";
    String autoSelected;
    SendableChooser chooser;
	
    public void robotInit() {
    	RobotMap.driveStick = new Joystick(0);
    	RobotMap.mechStick = new Joystick(1);
    	RobotMap.driveTrain = new RobotDrive(2,6,4,8);
    	RobotMap.shooterR = new Talon(1);
    	RobotMap.shooterL = new Talon(9);
    	RobotMap.sucker = new Talon(3);
    	RobotMap.intakeL = new Talon(7);
    	RobotMap.intakeR = new Talon(5);
    	RobotMap.Flipper = new Talon (10);
    }
    
    public void autonomousInit() {
    	autoSelected = (String) chooser.getSelected();
//		autoSelected = SmartDashboard.getString("Auto Selector", defaultAuto);
		System.out.println("Auto selected: " + autoSelected);
    }

    public void autonomousPeriodic() {
    	switch(autoSelected) {
    	case customAuto:
        //Put custom auto code here   
            break;
    	case defaultAuto:
    	default:
    	//Put default auto code here
            break;
    	}
    }

    public void teleopPeriodic() {
        
    }
    
    public void testPeriodic() {
    
    }
    
}
