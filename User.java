public class User {

    private String username;
    private String password;

    public User() {
        
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void menambahkanTask(Task task) {

    }

    public void menghapusTask(Task task) {

    }

    public void updateJudul(String judulBaru) {

    }

    public void updateUsername(String usernameBaru) {

    }

    public void updateDeskripsi(String deskripsiBaru) {

    }

    public void updateTanggalMulai(Date tanggalMulaiBaru) {

    }

    public void updateTanggalSelesai(Date tanggalSelesaiBaru) {

    }

    public void updateJenisTugas(String jenisTugasBaru) {

    }

    public void updateTaskState(String taskStateBaru) {

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

    public void setPassword(String password) {
        this.password = password;
    }
}

public class UserReguler extends User {

    private TaskReguler[] listTask;

    public UserReguler() {

    }

    public void menambahkanTask(TaskReguler task) {

    }

    public void menghapusTask(TaskReguler task) {

    }

    public TaskReguler[] getListTask() {
        return listTask;
    }

    public void setListTask(TaskReguler[] listTask) {
        this.listTask = listTask;
    }
}

public class UserPremium extends User {

    private TaskPremium[] listTask;

    public UserPremium() {

    }

    public void setPrioritas(){

    }

    public void menambahkanTask(TaskPremium task) {

    }

    public void menghapusTask(TaskPremium task) {

    }

    public TaskPremium[] getListTask() {
        return listTask;
    }

    public void setListTask(TaskPremium[] listTask) {
        this.listTask = listTask;
    }
}
