package commands;

import subsystems.Shooter;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Shoot extends Command {
	double speedPublic;
	int timePublic;
	boolean done;
    public Shoot(double speed, int time) {
    speedPublic = speed;
    timePublic = time;
    }
    

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	for(int i = 0; i < timePublic/20; i ++){
    		Shooter.shooterRun(speedPublic);
    	}
    done = true;
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(done == true){
    		return true;
    	}else{
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
