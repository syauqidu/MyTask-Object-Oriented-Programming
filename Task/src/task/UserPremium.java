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
public class UserPremium extends User {
    private List<TaskPremium> listTaskPremium;

    public UserPremium() {
        listTaskPremium = new ArrayList<>();
    }

    public void setPrioritas(TaskPremium task, String prioritasBaru) {
        task.setPrioritas(prioritasBaru);
    }

    public void menambahkanTask(TaskPremium task) {
        listTaskPremium.add(task);
    }

    public void menghapusTask(TaskPremium task) {
        listTaskPremium.remove(task);
    }

    public List<TaskPremium> getListTaskPremium() {
        return listTaskPremium;
    }

    public void setListTaskPremium(List<TaskPremium> listTaskPremium) {
        this.listTaskPremium = listTaskPremium;
    }
}
