
package frc.robot;

import frc.robot.commands.IntakeSpeedCommand;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Constants.IntakeConstants;
import frc.robot.Constants.OtherConstants;

public class RobotContainer {
  private final IntakeSubsystem Intake_Subsystem = new IntakeSubsystem();
  private Joystick pad = new Joystick(OtherConstants.pad_id);
  Trigger padintakebutton = new JoystickButton(pad, IntakeConstants.intake_button_id);

  DigitalInput note_in = new DigitalInput(OtherConstants.czujnik_id);//yahay czujnik
  Trigger noteintrigger = new Trigger(note_in::get);

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    padintakebutton.or(noteintrigger).whileTrue(new IntakeSpeedCommand(Intake_Subsystem, IntakeConstants.intake_speed));//chociaż wsm speed pewnie będzie setowany wewnątrz komendy, aale na razie może to wisieć tutaj
  }

  public Command getAutonomousCommand() {
    // A perfect example of command will be run in autonomous
    return null;
  }
}
