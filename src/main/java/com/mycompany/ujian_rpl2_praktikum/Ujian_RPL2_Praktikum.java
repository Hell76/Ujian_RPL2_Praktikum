/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ujian_rpl2_praktikum;

import com.mycompany.ujian_rpl2_praktikum.controller.HewanController;
import com.mycompany.ujian_rpl2_praktikum.view.HewanView;
import javax.swing.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ujian_RPL2_Praktikum {

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        
        System.out.println("=== APLIKASI CRUD DATA HEWAN ===");
        
        try {
            ApplicationContext context = SpringApplication.run(Ujian_RPL2_Praktikum.class, args);
            
            SwingUtilities.invokeLater(() -> {
                try {
                    HewanController controller = context.getBean(HewanController.class);
                    HewanView view = new HewanView(controller);
                    view.setVisible(true);
                    System.out.println("GUI berhasil ditampilkan!");
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, 
                        "Error: " + e.getMessage(), 
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            });
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, 
                "Error Spring Boot: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}