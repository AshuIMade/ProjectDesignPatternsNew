package com.company.dp.Behavioural.statedps.handmadestatemachinedp;

//import com.sun.tools.javac.util.List;
//import com.sun.tools.javac.util.Pair;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriveHandMadeStateDp {
    //private  static Map<State, List<Utils.Pair<Trigger,State>>> rules=
       //     new HashMap();

    /**static {
        rules.put(State.Off_Hook,List.of(
                new Pair<Trigger, State>(Trigger.Call_Dialed,State.Connecting),
                new Pair<Trigger, State>(Trigger.Stop_Using_Phone,State.On_Hook)
        ));
        rules.put(State.Connecting,List.of(
                new Pair<Trigger, State>(Trigger.Hang_Up,State.Off_Hook),
                new Pair<Trigger, State>(Trigger.Call_Connected,State.Connected)
        ));
        rules.put(State.Connected,List.of(
                new Pair<Trigger, State>(Trigger.Left_Message,State.Off_Hook),
                new Pair<Trigger, State>(Trigger.Hang_Up,State.Off_Hook),
                new Pair<Trigger, State>(Trigger.Placed_On_Hold,State.On_Hold)
        ));
        rules.put(State.On_Hold,List.of(
                new Pair<Trigger, State>(Trigger.TakenO_Off_Hold,State.Connected),
                new Pair<Trigger, State>(Trigger.Hang_Up,State.Off_Hook)
        ));
    }*/
    private  static State currentState=State.Off_Hook;
    private static State exitState=State.On_Hook;

    public static  void driveHmSateDp(){
        BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("the phone is currently " + currentState);
            System.out.println("Select a Trigger: ");
            /*for (int i=0;i<rules.get(currentState).size();i++){
                Pair trigger=rules.get(currentState).get(i);
                System.out.println("" + i + "." + trigger.fst);
            }*/
            boolean parseOk;
            int choice=0;
            do{
                try {
                    System.out.println("Please Enter your chice: ");
                    choice=Integer.parseInt(console.readLine());
                    parseOk=true;
                    //parseOk=choice>=0&&choice<rules.get(currentState).size();
                }catch (Exception e){
                    parseOk=false;
                }

            }while (!parseOk);
            //currentState=rules.get(currentState).get(choice).snd;
            if(currentState==exitState) break;
        }
        System.out.println("We are done!");
    }
}
