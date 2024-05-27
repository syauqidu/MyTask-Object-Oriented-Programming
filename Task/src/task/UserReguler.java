/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user1
 */
public class UserReguler extends User {
    private List<TaskReguler> listTaskReguler;

    public UserReguler() {
        listTaskReguler = new ArrayList<>();
    }

    public void menambahkanTask(TaskReguler task) {
        listTaskReguler.add(task);
    }

    public void menghapusTask(TaskReguler task) {
        listTaskReguler.remove(task);
    }

    public List<TaskReguler> getListTaskReguler() {
        return listTaskReguler;
    }

    public void setListTaskReguler(List<TaskReguler> listTaskReguler) {
        this.listTaskReguler = listTaskReguler;
    }
}
