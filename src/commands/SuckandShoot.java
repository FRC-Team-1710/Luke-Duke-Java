package commands;

import edu.wpi.first.wpilibj.command.Command;
import subsystems.Intake;
import subsystems.Shooter;

/**
 *
 */
public class SuckandShoot extends Command {

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
    	delay(1000);
    	Intake.intakeSuck(1);
    	delay(1000);
    	Intake.intakeSuck(0);
    	Shooter.shooterRun(0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
    
    public void delay(int time) {
    	try {
    		Thread.sleep(time);
    	} catch(InterruptedException e) {
    		e.printStackTrace();
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
