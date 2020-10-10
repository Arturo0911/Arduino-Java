package com.arduino;

import com.fazecast.jSerialComm.SerialPort;


import java.io.IOException;
import java.util.*;

public class Arduino {

    //private static final
    private ArrayList<Integer> vector;
    SerialPort arduino ;

    public Arduino() throws IOException, InterruptedException {

        try {
            arduino = SerialPort.getCommPort("/dev/ttyACM0"); // get from port of computer that already connected by the arduino
            arduino.setComPortParameters(9600, 8,1,0);
            arduino.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER,0,0);


            if (arduino.openPort()){
                System.out.println("Port open.");
            } else{
                System.out.println("Something was happen in port. ");
            }

        }catch (Exception e){
            System.out.println("Error by: "+e);

        }


        this.FetchData();
    }

    public ArrayList FetchData() throws  IOException, InterruptedException{
        vector = new ArrayList<Integer>();
        Scanner scanner = new Scanner(arduino.getInputStream());
        int x = 0;

        while (scanner.hasNextLine()){

            String line = scanner.nextLine();
            int number = Integer.parseInt(line);
            vector.add(number);
            if (x == 9){
                break;
            }else {
                x ++ ;
            }
        }

        arduino.closePort();
        //System.out.println("process is already broken");
        return  vector;
    }


    public void CheckObstacule() throws IOException, InterruptedException {

        System.out.println("Printing the CheckObstacule method");
        System.out.println(vector);




        while (true){


            int suma = 0 ;

            for (int x =0; x < 10; x ++){

                System.out.println(vector.get(x));

                suma = suma + vector.get(x);
            }

            System.out.println(suma);

            if ((suma/10) < 60){
                System.out.println("-----------WARNING----------");
                System.out.println("WARNING!!!! It's to close from your face.");
                System.out.println("-----------WARNING----------");
                break;

            }else {
                System.out.println("No problem. Remain in your place.");
            }

        }

    }




    public void test(){
        System.out.println("error");
        //System.out.println("Receiving data...");
        //System.out.println(vector);
    }
}
