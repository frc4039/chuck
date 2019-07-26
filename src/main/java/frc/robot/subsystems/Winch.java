/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
/**
 * Add your docs here.
 */
public class Winch extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private Victor Winch1 = new Victor(RobotMap.WinchDrive1);
  private Victor Winch2 = new Victor(RobotMap.WinchDrive2);


  public void Winch(){
    Winch1.set(0.1);
    Winch2.set(0.1);

  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
