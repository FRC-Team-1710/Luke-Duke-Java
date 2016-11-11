package autoModes;

import commands.ForwardTime;
import commands.Shoot;
import commands.Suck;
import commands.Turn4Time;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class PennAuto extends CommandGroup {
    
    public  PennAuto() {
    	addSequential(new Turn4Time(0, 1, 2000));
    	addSequential(new Shoot(1, 1000));
    	addSequential(new Suck(1, 5000));
    	addSequential(new ForwardTime(1, 0, 2000));
      
    }
}
