package subsystems;

import org.usfirst.frc.team1710.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
    

    public void initDefaultCommand() {
    	RobotMap.intakeL.set(0);
    	RobotMap.intakeR.set(0);
    	RobotMap.sucker.set(0);
    }
    public static void intakeSuck(double speed){
    	RobotMap.sucker.set(speed);
    
    }
    public void intakeLift(double speed){
    	RobotMap.intakeL.set(speed);
    	RobotMap.intakeR.set(-speed);
    }
}