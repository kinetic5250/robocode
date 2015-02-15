package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team5250.robot.commands.pawl.PawlClose;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlOpen;
import org.usfirst.frc.team5250.robot.commands.test.PawlTest;
import org.usfirst.frc.team5250.robot.commands.test.PezTest;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
@SuppressWarnings("unused")
public class OI {
    
	/* CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand()); */

	public static Joystick joystick0;
	public static CameraServer cameraServer;
	public static Button button3;
	public static Button button5;
	public static Button button6;
	
	public static void init() {
		joystick0 = new Joystick(0);
		cameraServer = CameraServer.getInstance();
    	cameraServer.startAutomaticCapture("cam0");
    	button3 = new JoystickButton(joystick0, 3);
    	button5 = new JoystickButton(joystick0, 5);
    	button6 = new JoystickButton(joystick0, 6);
    	button3.whenPressed(new PezTest());
    	button5.whenPressed(new PawlOpen());
    	button6.whenPressed(new PawlClose());
	}
}