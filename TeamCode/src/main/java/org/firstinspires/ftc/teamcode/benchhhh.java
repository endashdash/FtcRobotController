package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.hj.benchhh;


@TeleOp
public class benchhhh extends OpMode {
    benchhh bench = new benchhh();


    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    private static int num = 1;
    private static boolean gh = true;

    @Override
    public void loop() {
        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("left joystick y", gamepad1.left_stick_y);
        telemetry.addData("left joystick x", gamepad1.left_stick_x);
        telemetry.addData("right joystick x", gamepad1.right_stick_x);
        boolean abutton = gamepad1.a;
        double ly = gamepad1.left_stick_y;
        double lx = gamepad1.left_stick_x;
        double rx = gamepad1.right_stick_x;
        double lx2 = 0;
        double lx3 = 0;
        double ly2 = 0;
        double ly3 = 0;

        if (abutton == true) {
            if (gh == true) {
                num++;
            }
            gh = false;

        } else {
            gh = true;
        }
        if (num % 2 == 0) {
            bench.setMotorSpeed(0.5);//.\gradlew installDebug

            if (rx > 0) {
                lx3 = lx * (1 - 2 * rx);
                ly3 = ly * (1 - 2 * rx);
                lx2 = lx;
                ly2 = ly;
            } else if (rx < 0) {
                lx2 = lx * (1 + 2 * rx);
                ly2 = ly * (1 + 2 * rx);
                lx3 = lx;
                ly3 = ly;
            } else {
                bench.setMotorSpeed(0);
            }
            if (Math.abs(lx) > Math.abs(ly)) {
                if (lx < 0) {
                    bench.setTurning2Speed(lx2);
                    bench.setTurning3Speed(lx3);
                } else if (lx > 0) {
                    bench.setTurning2Speed(lx2);
                    bench.setTurning3Speed(lx3);
                } else {
                    bench.setTurning2Speed(0);
                    bench.setTurning3Speed(0);
                }
            } else if (Math.abs(ly) >= Math.abs(lx)) {
                if (ly < 0) {
                    bench.setMotor2Speed(ly2);
                    bench.setMotor3Speed(ly3);
                } else if (ly > 0) {
                    bench.setMotor2Speed(ly2);
                    bench.setMotor3Speed(ly3);
                } else {
                    bench.setMotor2Speed(0);
                    bench.setMotor3Speed(0);
                }
            } else if (Math.abs(ly) == 0 && Math.abs(lx) == 0) {
                bench.setMotor2Speed(0);
                bench.setMotor2Speed(0);
                bench.setTurning2Speed(0);
                bench.setTurning3Speed(0);
            }


        }
    }
}


