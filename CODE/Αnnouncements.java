package Class_folder;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Announcement {

    private String an_title;
    private String an_description;
    private LocalDate an_date;
    private String an_sender;
    private String an_receiver;
    private String an_id;

    public Announcement( String an_title, String an_description, LocalDate an_date, String an_sender, String an_receiver){
        this.an_title = an_title;
        this.an_description = an_description;
        this.an_date = an_date;
        this.an_sender = an_sender;
        this.an_receiver = an_receiver;
    }

    public boolean newAnnounc(){
        return true;
    }

    public boolean publish_Announc(String an_id){
        return true;
    }

    public boolean saveAnnounc(String an_id){
        return true;
    }

    public String[] getAnnouncement(String an_id){
        return null;
    }

    public String get_an_title(){
        return this.an_title;
    }

}