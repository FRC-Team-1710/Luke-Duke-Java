package commands;

import org.usfirst.frc.team1710.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Turn4Time extends Command {
double movepowerPublic;
double turnpowerPublic;
int timePublic;
boolean done;
    public Turn4Time(double movepower, double turnpower, int time) {
        movepowerPublic = movepower;
        turnpowerPublic= turnpower;
        timePublic = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	for (int I = 0; I < timePublic/20; I++){
    		RobotMap.driveTrain.arcadeDrive(movepowerPublic, turnpowerPublic);
    		
    	}
    	done = true;
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    
    	if(done == true){
   
    	return true;
    	}
    	else {
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
