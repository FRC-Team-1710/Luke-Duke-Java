package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    

    public void initDefaultCommand() {
    	
    }
    public void arcadeDrive(double movepower, double turnpower) {
    	RobotMap.driveTrain.arcadeDrive(movepower, turnpower);
    	
    	
    }
    
}

