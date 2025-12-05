/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_rpl2_praktikum.controller;

import com.mycompany.ujian_rpl2_praktikum.model.ModelHewan;
import com.mycompany.ujian_rpl2_praktikum.service.HewanService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HewanController {

    @Autowired
    private HewanService hewanService;

    // CREATE
    public String addHewan(ModelHewan hewan) {
        hewanService.saveHewan(hewan);
        return "Data hewan berhasil ditambahkan!";
    }

    // READ by ID
    public ModelHewan getHewan(int id) {
        return hewanService.getHewanById(id);
    }

    // UPDATE
    public String updateHewan(ModelHewan hewan) {
        hewanService.saveHewan(hewan);
        return "Data hewan berhasil diupdate!";
    }

    // DELETE
    public String deleteHewan(int id) {
        hewanService.deleteHewan(id);
        return "Data hewan berhasil dihapus!";
    }

    // READ ALL
    public List<ModelHewan> getAllHewan() {
        return hewanService.getAllHewan();
    }
}