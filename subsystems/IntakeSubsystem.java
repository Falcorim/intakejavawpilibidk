// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants.IntakeConstants;


public class IntakeSubsystem extends SubsystemBase {

  private final WPI_TalonSRX intake_motor1 = new WPI_TalonSRX (IntakeConstants.intake_motor_id);//nasz motor
  private final WPI_TalonSRX intake_motor2 = new WPI_TalonSRX (IntakeConstants.intake_motor_id2);
  
  public IntakeSubsystem() {
    intake_motor2.setInverted(true);//przy założeniu, że są odwrócone lustrzanie ofc
  }

  public Command exampleMethodCommand() {//a to jest niepotrzebne, ale ładna templatka, więc może zostać na przyszłość
    return runOnce(
        () -> {
          
        });
  }

  @Override
  public void periodic() {//nah
  }

  public void set_speed(double speed){
    intake_motor1.set(speed);
    intake_motor2.set(speed);
  }
}
