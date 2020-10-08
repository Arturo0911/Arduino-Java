package com.company;



import com.arduino.Arduino;
import javax.swing.JFrame;
/*import com.database.Database;
import com.fazecast.jSerialComm.SerialPort;*/

import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {

        JFrame root = new JFrame();
        root.setTitle("Arduino sensor module.");
        root.setSize(600,400);

        Arduino arduino = new Arduino();
        arduino.test();
    }
}
