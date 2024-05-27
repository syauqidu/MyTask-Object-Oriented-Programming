/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
 *
 * @author Asus
 */
public class TaskPremium extends Task {
    private String prioritas;

    public TaskPremium(String judul, String username, String deskripsi, Date TanggalMulai, Date tanggalSelesai, String jenisTugas, taskState taskState) {
        super(judul, username, deskripsi, TanggalMulai, tanggalSelesai, jenisTugas, taskState);
    }

    public String getPrioritas() {
        return prioritas;
    }

    public void setPrioritas(String prioritas) {
        this.prioritas = prioritas;
    }
}
