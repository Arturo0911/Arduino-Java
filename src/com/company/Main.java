package com.company;



import com.arduino.Arduino;
import com.gui.Root;

import javax.swing.*;
/*import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;*/
/*import com.database.Database;
import com.fazecast.jSerialComm.SerialPort;*/

import java.io.IOException;


public class Main {

    /*JFrame root ;
    JPanel panel ;

    public Main (){
        root = new JFrame();
        root.setTitle("Arduino sensor module.");
        root.setSize(600,400);
        root.setVisible(true);
        this.CreatePanel();
    }

    public void CreatePanel(){
        panel = new JPanel();
        root.add(panel);

        //XYSeries series = new
    }*/


    public static void main(String[] args) throws IOException, InterruptedException {

        //Root root = new Root();


        //Main root = new Main();
        //root.CreatePanel();

        Arduino arduino = new Arduino();
        arduino.test();
        arduino.CheckObstacule();
        System.out.println("Hola mundo");
    }
}
