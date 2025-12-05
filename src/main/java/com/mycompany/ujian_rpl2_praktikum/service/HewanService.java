/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_rpl2_praktikum.service;

import com.mycompany.ujian_rpl2_praktikum.model.ModelHewan;
import com.mycompany.ujian_rpl2_praktikum.repository.HewanRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HewanService {

    @Autowired
    private HewanRepository repository;

    // CREATE / UPDATE
    public void saveHewan(ModelHewan hewan) {
        repository.save(hewan);
    }

    // READ by ID
    public ModelHewan getHewanById(int id) {
        return repository.findById(id).orElse(null);
    }

    // READ ALL
    public List<ModelHewan> getAllHewan() {
        return repository.findAll();
    }

    // DELETE
    public void deleteHewan(int id) {
        repository.deleteById(id);
    }
}
