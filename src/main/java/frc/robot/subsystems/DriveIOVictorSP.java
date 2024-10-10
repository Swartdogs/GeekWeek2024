package frc.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class DriveIOVictorSP implements DriveIO
{
    //Created and assigned four motors to different ports
    private final VictorSP _flMotor = new VictorSP(0);
    private final VictorSP _frMotor = new VictorSP(1);
    private final VictorSP _blMotor = new VictorSP(2);
    private final VictorSP _brMotor = new VictorSP(3);

    //Created gyro
    private final ADXRS450_Gyro _gyro = new ADXRS450_Gyro();

    //Constructor of class
    public DriveIOVictorSP()
    {
        //Inverts the right side of the robot
        _frMotor.setInverted(true);
        _brMotor.setInverted(true);
    }

    @Override
    public void updateInputs(DriveIOInputs inputs)
    {
        inputs.flWheelSpeed = _flMotor.get();
        inputs.blWheelSpeed = _blMotor.get();
        inputs.frWheelSpeed = _frMotor.get();
        inputs.brWheelSpeed = _brMotor.get();

        inputs.robotAngle = _gyro.getAngle();
    }

    //Methods for powering left and right sides of the robot (left + right motors)
    @Override
    public void powerLeft(double volts)
    {
        //Sets voltage of left motors
        _flMotor.setVoltage(volts);
        _blMotor.setVoltage(volts);
    }
 
    @Override
    public void powerRight(double volts)
    {
        //Sets voltage of right motors
        _frMotor.setVoltage(volts);
        _brMotor.setVoltage(volts);
    } 
    
    //Method for reseting gyro
    @Override
    public void resetGyro()
    {
        //Resets gyro
        _gyro.reset();
    }
}
