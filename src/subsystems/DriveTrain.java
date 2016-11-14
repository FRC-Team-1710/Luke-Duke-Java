package subsystems;

import org.usfirst.frc.team1710.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    

    public void initDefaultCommand() {
    	
    }
    public static void arcadeDrive(double movepower, double turnpower) {
    	RobotMap.driveTrain.arcadeDrive(movepower, turnpower);
    	
    	
    }
    
}

