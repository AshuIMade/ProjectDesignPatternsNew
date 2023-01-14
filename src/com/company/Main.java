package com.company;

import com.company.dp.Behavioural.Vistordps.instrusiveApproch.IntrusiveVistorDpDriver;
import com.company.dp.Behavioural.Vistordps.reflectiveApproach.ReflectiveVistorDpDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World main Driver");
        ReflectiveVistorDpDriver.DriveReflectiveVistor();
        //IntrusiveVistorDpDriver.driveIntrusiveVistor();
    }
}
