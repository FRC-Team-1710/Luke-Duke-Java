package commands;

import HelpfulStuff.HelpfulAutoMethods;
import edu.wpi.first.wpilibj.command.Command;
import subsystems.Intake;
import subsystems.Shooter;

/**
 *
 */
public class SuckandShoot extends Command {

	boolean done;
	
    public SuckandShoot() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Shooter.shooterRun(1);
    	HelpfulAutoMethods.delay(1000);
    	Intake.intakeSuck(1);
    	HelpfulAutoMethods.delay(1000);
    	Intake.intakeSuck(0);
    	Shooter.shooterRun(0);
    	done = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(done) {
    		return true;
    	} else {
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
