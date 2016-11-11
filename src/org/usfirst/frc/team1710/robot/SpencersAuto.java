package org.usfirst.frc.team1710.robot;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class SpencersAuto extends CommandGroup {
    
    public  SpencersAuto() {
    	addSequential(new Shoot(1,5000));
    	addSequential(new Suck(1,5000));
    	addSequential(new ForwardTime(1,0,4000));
    	addSequential(new Turn4Time(0,1,4000));
    }
}
