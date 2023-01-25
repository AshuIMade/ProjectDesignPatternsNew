package com.company;

import com.company.dp.Behavioural.Vistordps.AsyclicApproch.AsyclicVisitorDriver;
import com.company.dp.Behavioural.Vistordps.clasicApproch.ClassicVistorDriver;
import com.company.dp.Behavioural.Vistordps.classicApproachTwo.ClassicVisitorDriver;
import com.company.dp.Behavioural.Vistordps.instrusiveApproch.IntrusiveVistorDpDriver;
import com.company.dp.Behavioural.Vistordps.reflectiveApproach.ReflectiveVistorDpDriver;
import com.company.dp.Behavioural.nulldps.nullobjectdp.DriveNullObjDp;
import com.company.dp.Behavioural.observerdps.createdobserverdp.ObserverDpDriver;
import com.company.dp.Behavioural.statedps.classicstatedp.ClassicStateDpDriver;
import com.company.dp.Behavioural.statedps.handmadestatemachinedp.DriveHandMadeStateDp;
import com.company.dp.Behavioural.strategydps.StrategyDPDriver;
import com.company.dp.Behavioural.templateMethoddps.TemplateMethodDpDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World main Driver");
        //IntrusiveVistorDpDriver.driveIntrusiveVistor();
        //ReflectiveVistorDpDriver.DriveReflectiveVistor();
        //ClassicVistorDriver.driveClassicVistor();
        //AsyclicVisitorDriver.driveAsyclicVisitor();
        //ClassicVisitorDriver.driveClassicVisitor();
        //TemplateMethodDpDriver.driveTemplateMethodDp();
        //StrategyDPDriver.driveStrategyDp();
        //ClassicStateDpDriver.driveClassicStateDp();
        //DriveHandMadeStateDp.driveHmSateDp();
        //ObserverDpDriver.driveObserverDp();
        DriveNullObjDp.nullObjDriver();
    }
}
