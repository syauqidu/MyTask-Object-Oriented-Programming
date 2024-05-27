/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user1
 */
public class User {
    private String username;
    private String password;
    protected List<Task> listTask;

    public User() {
        listTask = new ArrayList<>();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void menambahkanTask(Task task) {
        listTask.add(task);
    }

    public void menghapusTask(Task task) {
        listTask.remove(task);
    }

    public void updateJudul(Task task, String judulBaru) {
        task.setJudul(judulBaru);
    }

    public void updateUsername(String usernameBaru) {
        this.username = usernameBaru;
    }

    public void updateDeskripsi(Task task, String deskripsiBaru) {
        task.setDeskripsi(deskripsiBaru);
    }

    public void updateTanggalMulai(Task task, Date tanggalMulaiBaru) {
        task.setTanggalMulai(tanggalMulaiBaru);
    }

    public void updateTanggalSelesai(Task task, Date tanggalSelesaiBaru) {
        task.setTanggalSelesai(tanggalSelesaiBaru);
    }

    public void updateJenisTugas(Task task, String jenisTugasBaru) {
        task.setJenisTugas(jenisTugasBaru);
    }

    public void updateTaskState(Task task, Task.taskState taskStateBaru) {
        task.setTaskState(taskStateBaru.name());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public List<Task> getListTask() {
        return listTask;
    }
}
