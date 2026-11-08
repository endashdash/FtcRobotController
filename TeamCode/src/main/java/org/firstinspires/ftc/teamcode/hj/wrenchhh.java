package org.firstinspires.ftc.teamcode.hj;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class wrenchhh {

    private Servo servoPos;
    private CRServo servoRot;

    public void init(HardwareMap hwmap) {
        servoPos= hwmap.get(Servo.class, "spos");
        servoRot= hwmap.get(CRServo.class, "srot");
    }

    public void setServoPos(double angel) {
        servoPos.setPosition(angel);
    }
    public void setServoRot(double howie){
        servoRot.setPower(howie);
    }
}
