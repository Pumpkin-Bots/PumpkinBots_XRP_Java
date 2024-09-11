package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Arm;

public class AutonomousWave extends SequentialCommandGroup {
    public AutonomousWave(Arm arm) {
        addCommands(        
            new Wave(0, arm),
            new Wave(90, arm),
            new Wave(45, arm)
        );
    }
}
