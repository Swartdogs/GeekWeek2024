package frc.robot.subsystems;

import org.littletonrobotics.junction.AutoLog;

public interface DriveIO 
{
    @AutoLog
    public static class DriveIOInputs
    {
        //Creates variables for speeds of all wheels
        public double flWheelSpeed = 0;
        public double frWheelSpeed = 0;
        public double blWheelSpeed = 0;
        public double brWheelSpeed = 0;

        //Creates variable for angle of robot (using gyro)
        public double robotAngle = 0;
    }

    //Updates the inputs so that we can log them in AdvantageKit
    public default void updateInputs(DriveIOInputs inputs)
    {
    }

    //Creates methods for powering left and right sides of the robot (left + right motors)
    public default void powerLeft(double volts)
    {
    }

    public default void powerRight(double volts)
    {
    }

    //Creates method for reseting gyro
    public default void resetGyro()
    {
    }
}
