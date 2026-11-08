package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.hj.wrenchhh;

@TeleOp
public class wrenchhhh extends OpMode {

    wrenchhh wrench = new wrenchhh();
    @Override
    public void init() {
        wrench.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1. a) {
            wrench.setServoPos(1.0);
        } else {
            wrench.setServoPos(-1.0);
        }
        if (gamepad1.x) {
            wrench.setServoRot(1.0);
        } else {
            wrench.setServoRot(0);
        }
    }
}
