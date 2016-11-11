package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.command.Subsystem;


public class Shooter extends Subsystem {

    public void initDefaultCommand() {
    	RobotMap.shooterR.set(0);
    	RobotMap.shooterL.set(0);
    	
    }
    public static void shooterRun(double speed){
    	RobotMap.shooterR.set(speed);
    	RobotMap.shooterL.set(-speed);
    
}
}