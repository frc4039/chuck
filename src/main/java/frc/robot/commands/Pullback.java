//*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.Winch;
import frc.robot.subsystems.driveTrain;
import edu.wpi.first.wpilibj.DigitalInput;

public class Pullback extends Command {

  public static OI oi = new OI();
  public static Winch Winch = new Winch();
  private static DigitalInput Limitswitch = new DigitalInput(0);

  public Pullback() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Winch);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Winch.Winch();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    if (!Limitswitch.get()){
      return true;      
    } else{
      return false;
    }
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Winch.Stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Winch.Stop();
  }
}
