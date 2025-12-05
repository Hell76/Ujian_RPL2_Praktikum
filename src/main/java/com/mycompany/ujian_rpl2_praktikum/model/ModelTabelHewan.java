/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_rpl2_praktikum.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTabelHewan extends AbstractTableModel {
    
    private List<ModelHewan> hewanList;
    private final String[] columnNames = {"ID", "Nama", "Jenis", "Umur", "Warna", "Berat (Kg)"};

    public ModelTabelHewan(List<ModelHewan> hewanList) {
        this.hewanList = hewanList;
    }

    @Override
    public int getRowCount() {
        return hewanList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelHewan hewan = hewanList.get(rowIndex);
        switch (columnIndex) {
            case 0: return hewan.getId();
            case 1: return hewan.getNama();
            case 2: return hewan.getJenis();
            case 3: return hewan.getUmur();
            case 4: return hewan.getWarna();
            case 5: return hewan.getBerat();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public void updateData(List<ModelHewan> newList) {
        this.hewanList = newList;
        fireTableDataChanged();
    }
}
