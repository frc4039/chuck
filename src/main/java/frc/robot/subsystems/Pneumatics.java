/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Pneumatics extends Subsystem {
 

  DoubleSolenoid intake = new DoubleSolenoid(3, 4);
  DoubleSolenoid release = new DoubleSolenoid(5, 2);
  DoubleSolenoid driveshift = new DoubleSolenoid(6, 7);

  public void IntakeOut(){
    intake.set(DoubleSolenoid.Value.kForward);
  }
  public void IntakeIn(){
    intake.set(DoubleSolenoid.Value.kReverse);
  }

  public void release(){
    release.set(DoubleSolenoid.Value.kForward);
    
  }
  public void nonrelease(){
    release.set(DoubleSolenoid.Value.kForward);
  }

  public void driveshiftup(){
    driveshift.set(DoubleSolenoid.Value.kForward);
  }
  public void driveshiftdown(){
    driveshift.set(DoubleSolenoid.Value.kReverse);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
