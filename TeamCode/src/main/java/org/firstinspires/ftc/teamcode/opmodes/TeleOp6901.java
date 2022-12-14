package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Arm;
import org.firstinspires.ftc.teamcode.subsystems.Claw;
import org.firstinspires.ftc.teamcode.subsystems.Slide;
import org.firstinspires.ftc.teamcode.util.PoseStorage;

@TeleOp (name = "TeleOp6901")
public class TeleOp6901 extends OpMode {

    //declare subsystems
    Arm arm;
    Claw claw;
    SampleMecanumDrive drive;
    Slide slide;

    @Override
    public void init() {
        // create hardwares subsystems using their constructors and initalize motors and servos
        claw = new Claw(this);
        drive = new SampleMecanumDrive(this);
        slide = new Slide(this);

        drive.setPoseEstimate(PoseStorage.currentPose);
    }

    @Override
    public void loop() {
        //run subsystem loop comamnd
        claw.teleOpCommand();
        drive.mechDrive();
        slide.teleOpCommand();
    }
}
