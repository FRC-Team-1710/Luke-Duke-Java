package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ForwardTime extends Command {
	double forwardpublic;
	double turnpublic;
	int timepublic;
	boolean done;
	
    public ForwardTime(double forward, double turn, int time) {
    	forwardpublic = forward;
    	turnpublic = turn;
    	timepublic = time;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	for (int i = 0; i < timepublic/20; i ++) {
    		RobotMap.driveTrain.arcadeDrive(forwardpublic, turnpublic);
    	}    	
    	done = true;    
 }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (done == true){
    		return true;
    	}
        else{
        	return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
