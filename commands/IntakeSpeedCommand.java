//basically nie robi teraz nic tylko setuje speed i można by to zrobić szybciej bez całej komendy tylko
//samym set speed znając życje, ale w przyszłość patrzę i przy robieniu zjednoczonego shootera
//to dziadostwo może się przydać


package frc.robot.commands;

import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class IntakeSpeedCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})//idk, ale ok
  private final IntakeSubsystem IntakeSubsystem;
  private final double speed;


    public IntakeSpeedCommand(IntakeSubsystem IntakeSubsystem, double speed) {
      this.IntakeSubsystem = IntakeSubsystem;
      this.speed = speed;

     addRequirements(IntakeSubsystem);
  }

  @Override
  public void initialize() {}//no na razie niepotrzebne
  //ejej, a gdyby ogarnąć to i tutaj setować speed? to byłoby inteligentne
  //w sensie pewnie w execute, ale stilll

  @Override
  public void execute() {
    /*potężne obliczenia potrzebne do setowania speeda np*/
      IntakeSubsystem.set_speed(speed);
  }

  @Override
  public void end(boolean interrupted) {
    IntakeSubsystem.set_speed(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
