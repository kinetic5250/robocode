package org.usfirst.frc.team5250.robot.commands.test;

//import org.usfirst.frc.team5250.robot.OI;

import org.usfirst.frc.team5250.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class PezTest extends CommandBase {	
	
	private Timer timer = new Timer();
	boolean pass = false;
	double goalPosition;
	
	public PezTest() {
		requires(pez);
	}
	
	protected void initialize() {
		timer.start();
		pez.zeroPezPosition();
		goalPosition = 0;
	}
	
	protected void execute() {
		/*pass = timer.hasPeriodPassed(200);
		if(pass==true&&OI.joystick0.getRawButton(4)) {
			goalPosition -= 90;
			pez.setPezPosition(goalPosition);
			SmartDashboard.putNumber("PezGoalPosition", goalPosition);
		} else if(pass==true&&OI.joystick0.getRawButton(5)) {
			goalPosition -= 90;
			pez.setPezPosition(goalPosition);
			SmartDashboard.putNumber("PezGoalPosition", goalPosition);
		}
		pez.getPezPosition();*/
		
	}
	
	protected boolean isFinished() {
		return false;
	}
}
