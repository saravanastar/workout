//package com.ask.sample;
//
//import javax.swing.JFrame;
//import java.awt.*;
//import javax.media.*;
//import javax.media.format.YUVFormat;
//import java.awt.event.*;
//import java.io.IOException;
//import java.util.Vector;
//
//public class Camfeed {
//
//    String Video_Device = "vfw:Microsoft WDM Image Capture:0";
//    JFrame frame = new JFrame(" Hello JMF Player");
//    static Player player = null;
//
//    public Camfeed() throws NoPlayerException, CannotRealizeException, IOException
//    {
//        // Get the device list and store it in a vector
//
//        Vector		CaptureDeviceInfo device = (CaptureDeviceInfo) deviceList.firstElement();
//
//        MediaLocator ml = device.getLocator();
//        // Create the player
//        player = Manager.createRealizedPlayer(ml);
//        //Get the visual component
//        Component videoScreen = player.getVisualComponent();
//        // Put the visual component inside a frame
//        frame.getContentPane().add( videoScreen, BorderLayout.CENTER);
//        frame.addWindowListener( new WindowAdapter() {
//            public void windowClosing(WindowEvent we) {
//                Camfeed.stop();    System.exit(0);
//            }
//        });
//
//        frame.pack();
//        frame.setSize( new Dimension(400,400) );
//        frame.setVisible(true);
//        player.start();
//
//    }
//    public static void stop(){
//        player.stop();
//        player.close();
//
//    }
//
//    public static void main(String as[]) throws NoPlayerException, CannotRealizeException, IOException
//    {
//        Camfeed c= new Camfeed();
//    }
//
//}
