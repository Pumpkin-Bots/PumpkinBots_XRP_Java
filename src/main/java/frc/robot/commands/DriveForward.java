package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.XRPDrivetrain;

public class DriveForward extends Command{
    private final XRPDrivetrain m_drive;

    public DriveForward(XRPDrivetrain drive) {
        m_drive = drive;
        addRequirements(drive);
    }

    @Override
    public void initialize() {
        System.out.println("Driving forward");
        m_drive.arcadeDrive(0, 0);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        m_drive.arcadeDrive(0.5, 0);
    }

}
