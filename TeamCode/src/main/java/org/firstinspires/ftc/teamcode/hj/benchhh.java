package org.firstinspires.ftc.teamcode.hj;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class benchhh {
    private DcMotor m;
    private DcMotor m2;
    private DcMotor m3;
    public void init(HardwareMap hwMap) {
        m = hwMap.get(DcMotor.class, "motor");
        m.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        m2 = hwMap.get(DcMotor.class, "motor2");
        m2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        m3 = hwMap.get(DcMotor.class, "motor3");
        m3.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
    public void setMotorSpeed(double speed) {
        m.setPower(speed);
    }
    public void setMotor2Speed(double speed) {
        m2.setPower(speed);
    }
    public void setMotor3Speed(double speed) {
        m3.setPower(-speed);
    }
    public void setTurning2Speed(double speed) {
        m2.setPower(-speed);
    }
    public void setTurning3Speed(double speed) {
        m3.setPower(-speed);
    }



}

