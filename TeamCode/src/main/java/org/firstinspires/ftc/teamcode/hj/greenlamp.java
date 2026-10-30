package org.firstinspires.ftc.teamcode.hj;

import com.qualcomm.hardware.limelightvision.LLFieldMap;
import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous
public class greenlamp extends OpMode{

    private Limelight3A limelight3A;
    @Override
    public void init() {
        limelight3A=hardwareMap.get(Limelight3A.class, "greenlamp");
        limelight3A.pipelineSwitch(0);
    }

    @Override
    public void start() {
        limelight3A.start();
    }

    @Override
    public void loop() {
        LLResult llResult = limelight3A.getLatestResult();
        if (llResult != null && llResult.isValid()){
            telemetry.addData("lime x offset", llResult.getTx());
            telemetry.addData("lime y offset", llResult.getTy());
            telemetry.addData("lime area offset", llResult.getTa());
        }
    }
}