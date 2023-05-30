package Class_folder;

import java.time.LocalDate;

public class Parents_Group_Work {

    private String work_title;
    private String work_content;
    private LocalDate work_date;
    private String work_author;

    public Parents_Group_Work(String work_title, String work_content, LocalDate work_date, String work_author) {
        this.work_title = work_title;
        this.work_content = work_content;
        this.work_date = work_date;
        this.work_author = work_author;
    }


    public boolean newParents_Group_Entry(String work_title){
        return true;
    }

    public boolean removeParents_Group_Entry(String work_title){
        return true;
    }

    public boolean editParents_Group_Entry(String work_title){
        return true;
    }

    public void filterParents_Group_Work() { }

    public String getParents_Group_Work(String work_title) { return null; }

    public boolean saveParents_Group_Work() { return true; }

    public boolean shareParents_Group_Work() { return true; }

    public void commentParents_Group_Work() { }
    //------------------------------------------------------------------

    public String getWork_title(){
        return this.work_title;
    }

    public String getWork_content (){
        return this.work_content;
    }

    public LocalDate getWork_date() {
        return this.work_date;
    }

    public String getWork_author() {
        return this.work_author;
    }

}