package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase 
{
    private DriveIO _io;
    private DriveIOInputsAutoLogged _inputs = new DriveIOInputsAutoLogged();

    public Drive(DriveIO io) 
    {
        _io = io;
    }

    public void drive(double drive, double rotate)
    {
        
    }

    @Override
    public void periodic() 
    {
        //Reads inputs every 20 miliseconds and updates them
        _io.updateInputs(_inputs);
    }
}
