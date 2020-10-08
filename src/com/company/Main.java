package com.company;


import com.database.Database;
import com.fazecast.jSerialComm.SerialPort;

import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {

        /*Database db = new Database();
        //db.Query();

        //db.Insert("Favio");
        db.FetchRows();*/


        SerialPort arduino = SerialPort.getCommPort("/dev/ttyACM0");

        arduino.setComPortParameters(9600, 8,1,0);
        arduino.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING,0,0);

        if (arduino.openPort()) {
            System.out.println("Port is opened");
        } else {
            System.out.println("Nothing to show");
        }

        for (Integer i = 0; i < 5; i++ ){
            arduino.getOutputStream().write(i.byteValue());
            arduino.getOutputStream().flush();

            System.out.println("i: "+i);
            Thread.sleep(1000);
        }


        if (arduino.closePort()){
            System.out.println("Port was closed");
        }else {
            System.out.println("Somethings happend");
        }


	// write your code here
    }
}
