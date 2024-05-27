/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
/**
 *
 * @author Asus
 */
public class Task implements ShowData {
    private String judul;
    private String username;
    private String deskripsi;
    private Date TanggalMulai;
    private Date tanggalSelesai;
    private String jenisTugas;
    public String taskState;

    @Override
    public void showInfo() {
        System.out.println("Judul: " + this.judul);
        System.out.println("Username: " + this.username);
        System.out.println("Deskripsi: " + this.deskripsi);
        System.out.println("Tanggal Mulai: " + this.TanggalMulai);
        System.out.println("Tanggal Selesai: " + this.tanggalSelesai);
        System.out.println("Jenis Tugas: " + this.jenisTugas);
        System.out.println("Task State: " + this.taskState);
    }

    @Override
    public void sorting() {
        List<Task> tasks = new ArrayList<>(); 
        Collections.sort(tasks, (t1, t2) -> t1.judul.compareTo(t2.judul));
        for (Task task : tasks) {
            task.showInfo();
        }
    }
    public enum taskState{
        NOT_STARTED,
        IN_PROGRESS,
        COMPLETED,
        ON_HOLD
    }

    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }
    
    public Task(String judul, String username, String deskripsi, Date TanggalMulai, Date tanggalSelesai, String jenisTugas, taskState taskState){
        this.judul = judul;
        this.username = username;
        this.deskripsi = deskripsi;
        this.TanggalMulai = TanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.jenisTugas = jenisTugas;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Date getTanggalMulai() {
        return TanggalMulai;
    }

    public void setTanggalMulai(Date TanggalMulai) {
        this.TanggalMulai = TanggalMulai;
    }

    public Date getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(Date tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }

    public String getJenisTugas() {
        return jenisTugas;
    }

    public void setJenisTugas(String jenisTugas) {
        this.jenisTugas = jenisTugas;
    }
    
}
