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
public class intake extends Subsystem {
   // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private Victor intake1 = new Victor(RobotMap.intake1);
  private Victor intake2 = new Victor(RobotMap.intake2);

  public void Intake(){
    intake1.set(0.1);
    intake2.set(0.1);
  }

  public void Outtake(){
    intake1.set(-0.1);
    intake2.set(-0.1);
  }

  public void Stop(){
    intake1.set(0);
    intake2.set(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
