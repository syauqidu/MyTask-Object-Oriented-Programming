/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class TaskReguler extends Task {
    private String prioritas;
    private int limitTask;

    public TaskReguler(String prioritas, int limitTask, String judul, String username, String deskripsi, Date TanggalMulai, Date tanggalSelesai, String jenisTugas, taskState taskState) {
        super(judul, username, deskripsi, TanggalMulai, tanggalSelesai, jenisTugas, taskState);
        this.prioritas = prioritas;
        this.limitTask = limitTask;
    }

    public String getPrioritas() {
        return prioritas;
    }

    public void setPrioritas(String prioritas) {
        this.prioritas = prioritas;
    }

    public int getLimitTask() {
        return limitTask;
    }

    public void setLimitTask(int limitTask) {
        this.limitTask = limitTask;
    }
    
}
