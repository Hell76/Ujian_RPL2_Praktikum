/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_rpl2_praktikum.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hewan")
public class ModelHewan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nama", nullable = false, length = 50)
    private String nama;

    @Column(name = "jenis", nullable = false, length = 50)
    private String jenis;

    @Column(name = "umur")
    private int umur;

    @Column(name = "warna", length = 30)
    private String warna;

    @Column(name = "berat")
    private double berat;
    
    // Constructors
    public ModelHewan() {}

    public ModelHewan(String nama, String jenis, int umur, String warna, double berat) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        this.warna = warna;
        this.berat = berat;
    }
    
    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    
    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }
    
    public int getUmur() { return umur; }
    public void setUmur(int umur) { this.umur = umur; }
    
    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }
    
    public double getBerat() { return berat; }
    public void setBerat(double berat) { this.berat = berat; }
}
