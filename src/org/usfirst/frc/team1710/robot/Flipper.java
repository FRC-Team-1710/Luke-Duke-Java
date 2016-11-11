package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.command.Subsystem;


public class Flipper extends Subsystem {


    public void initDefaultCommand() {
    	RobotMap.Flipper.set(0);    	
    }
    
public static void FlipperRun (double setVal){
	RobotMap.Flipper.set(setVal);
}
}

