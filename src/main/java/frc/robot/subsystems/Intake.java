// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants.IntakeConstants;

public class Intake extends SubsystemBase {
  
  public CANSparkMax intakeMotor;
  
  public Intake() {
    intakeMotor = new CANSparkMax(IntakeConstants.INTAKE_ID, MotorType.kBrushless);
    configureMotor(intakeMotor);
  }

  public void configureMotor(CANSparkMax motor){
    intakeMotor.setSmartCurrentLimit(IntakeConstants.CURRENT_LIMIT);
    //motor.restoreFactoryDefaults();  ???
    //motor.burnFlash();
    //motor.clearFaults();
  }

  public void cubeIn(){
    intakeMotor.set(IntakeConstants.CUBE_IN_SPEED);
  }

  public void cubeOut(){
    intakeMotor.set(IntakeConstants.CUBE_OUT_SPEED);
  }

  public void setZero(){
    intakeMotor.set(IntakeConstants.CUBE_SET_ZERO);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //SmartDashboard.putNumber("Intake Voltage", intakeMotor.get());
  }
}
