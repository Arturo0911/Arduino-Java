package com.company;


import com.database.Database;
import com.fazecast.jSerialComm.SerialPort;






public class Main {


    public static void main(String[] args) {

        Database db = new Database();
        //db.Query();

        //db.Insert("Favio");
        db.FetchRows();




        /*SerialPort arduino = SerialPort.getCommPort("/dev/ttyACM0");

        arduino.setComPortParameters(9600, 8,1,0);
        arduino.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING,0,0);

        if (arduino.openPort()) {
            System.out.println("Port is opened");
        } else {
            System.out.println("Nothing to show");
        }*/



	// write your code here
    }
}
