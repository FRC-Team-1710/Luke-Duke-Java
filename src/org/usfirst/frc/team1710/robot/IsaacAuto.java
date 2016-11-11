package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class IsaacAuto extends CommandGroup {
	
    
    public  IsaacAuto() {
    	addSequential(new ForwardTime(1, 0, 2000));
    	addSequential(new Suck(1, 2000));
    	addSequential(new Shoot(1, 1000));
    	addSequential(new ForwardTime(-1, 0, 3000));
    }
}
