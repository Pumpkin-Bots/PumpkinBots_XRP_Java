package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

public class Wave extends Command {
    private final Arm m_arm;
    private final double m_target_angle;
    private long m_startTime;

    public Wave(double targetAngle, Arm arm) {
        m_arm = arm;
        m_target_angle = targetAngle;
        addRequirements(arm);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        m_startTime = System.currentTimeMillis();
        m_arm.setAngle(m_target_angle);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return m_arm.getAngle() == m_target_angle && (System.currentTimeMillis() - m_startTime) >= 2000;
    }
}
