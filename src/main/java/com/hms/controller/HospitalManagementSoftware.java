/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hms.controller;

import com.hms.view.Home;

/**
 *
 * @author Nowsad
 */
public class HospitalManagementSoftware {

    public static void main(String[] args) {
      new Home().setVisible(true);
         PathologicalTest pTest = new PathologicalTest("CBC",400,true);
        System.out.println(pTest.show());
        pTest.setCost(400);
        System.out.println("The Updated cost of CBC is" +pTest.getCost());
        System.out.println(pTest.show());
        
        
    }
}
