/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author hpram
 */
public class Knn {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<PriceClass> priceRanges = new ArrayList<PriceClass>();
    private static ArrayList<MobileData> mobiles = new ArrayList<>();

    public static void main(String[] args) {
        HashMap<Character,Integer> hm = new HashMap<>();
		int a,b;
        char finalClass;
        MobileData newMobile;
        Double dis;
        TreeMap<Double, ArrayList<Integer>> disMap;
        Set<Map.Entry<Double, ArrayList<Integer>>> entries;
        Iterator<Map.Entry<Double, ArrayList<Integer>>> entIt;
        Map.Entry<Double, ArrayList<Integer>> curEntry;
        loadData();
        System.out.println("Data loaded");
        System.out.println(priceRanges);
        System.out.println(mobiles);
        newMobile = loadNewMobile();
        disMap = new TreeMap<Double, ArrayList<Integer>>();
        for (int i=0; i < mobiles.size(); i++){
            MobileData curMobileData = mobiles.get(i);
            dis = curMobileData.getDistance(newMobile);
            ArrayList<Integer> val;
            if (disMap.containsKey(dis)){
                val = disMap.get(dis);
            }
            else {
                val = new ArrayList<>();
            }
            val.add(i);
            disMap.put(dis, val);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of k (preferably odd)");
        int k = sc.nextInt();
        entries = disMap.entrySet();
        entIt = entries.iterator();
        for (int i = 0; i <k ; i++){
            curEntry = entIt.next();
        }
        
    }

    private static MobileData loadNewMobile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Specifications of your mobile");
        System.out.println("Enter Brand name: ");
        String brand = sc.nextLine();
        System.out.println("Enter Model name: ");
        String model = sc.nextLine();
        System.out.println("Enter Os: ");
        float os = sc.nextFloat();
        System.out.println("Enter Ram: ");
        int ram = sc.nextInt();
        System.out.println("Enter PassMark Memory: ");
        int passMarkMemory = sc.nextInt();
        System.out.println("Enter Battery Size: ");
        int batterySize = sc.nextInt();
        System.out.println("Enter Max charging Speed: ");
        int maxCharging = sc.nextInt();
        System.out.println("Enter Storage Size: ");
        int storage = sc.nextInt();
        System.out.println("Enter PassMark Disk: ");
        int passMarkDisk = sc.nextInt();
        System.out.println("Enter Resolution Density: ");
        int rsolutiondensity = sc.nextInt();
        System.out.println("Enter Processor Node: ");
        int processNode = sc.nextInt();
        System.out.println("Enter PassMark 2d: ");
        int passMark2d = sc.nextInt();
        System.out.println("Enter PassMark 3d: ");
        int passMark3d = sc.nextInt();
        System.out.println("Enter Geek Bench single core:  ");
        int geeekBenchSinglecore = sc.nextInt();
        System.out.println("EnterGeek Bench multi core : ");
        int geekBenchMulticore = sc.nextInt();
        System.out.println("Enter Front camera pixel size: ");
        float frontCameraPixel = sc.nextFloat();
        System.out.println("Enter Rear camera pixel size: ");
        float rearCameraPixel = sc.nextFloat();
        System.out.println("Enter Rear Telophoto size: ");
        float rearTelephoto = sc.nextFloat();
        System.out.println("Enter Rear Ultra angle: ");
        float rearUltraAngle = sc.nextFloat();
        System.out.println("Enter Front Ultra angle ");
        float frontUltraAngle = sc.nextFloat();
        System.out.println(frontUltraAngle);
        return new MobileData(brand, model, os, ram, passMarkMemory, batterySize, maxCharging, storage, passMarkDisk, rsolutiondensity, processNode, passMark2d, passMark3d, geeekBenchSinglecore, geekBenchMulticore, 0, null, frontCameraPixel, rearCameraPixel, rearTelephoto, rearUltraAngle, frontUltraAngle);
    }

    private static void loadData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledata", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `price class` order by Class");
            System.out.println("Loading price Ranges");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getInt(2) + "  " + rs.getInt(3));
                priceRanges.add(new PriceClass(rs.getString(1).charAt(0), rs.getInt(2), rs.getInt(3)));
            }

            rs = stmt.executeQuery("SELECT * FROM mobile");
            System.out.println("Loading mobile data");
            char minPriceClass = priceRanges.get(0).getClassName();
            while (rs.next()) {
                mobiles.add(new MobileData(rs.getString(1), rs.getString(2),
                        rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getInt(6),
                        rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
                        rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getInt(15),
                        rs.getInt(16), priceRanges.get(rs.getString(17).charAt(0) - minPriceClass),
                        rs.getFloat(18), rs.getFloat(19), rs.getFloat(20), rs.getFloat(21), rs.getFloat(22)));
            }

            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

}
