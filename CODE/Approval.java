package Class_folder;
import java.lang.reflect.Array;
import java.time.LocalDate;

public class Approval {
    private String approval_id;
    private String approval_parent_id;
    private String approval_student_fullname;
    private boolean approval_pending;
    private LocalDate approval_expire_date;
    
    private String ap_title; //new

    public Approval(String approval_id,String approval_parent_id, String approval_student_fullname, boolean approval_pending, LocalDate approval_expire_date, String ap_title){
        this.approval_id = approval_id;
        this.approval_parent_id = approval_parent_id;
        this.approval_student_fullname = ap_student_fullname;
        this.ap_pending = ap_pending;
        this.ap_expire_date = ap_expire_date;
        this.ap_title = ap_title;
    }

    public boolean createApproval(){
        return true;
    }
    public boolean saveApproval(String approval_id){
        return true;
    }
    public boolean approveFile(String approval_id){
        return true;
    }
    public boolean removeApproval(String approval_id){
        return true;
    }
    public String[] getApprovals(){
        return null;
    }


    public String getApproval_id(){
        return this.approval_id;
    }

    public String getAp_student_id(){
        return this.ap_student_id;
    }

    public String getAp_parent_id(){
        return this.ap_parent_id;
    }

    public boolean isAp_pending(){
        return this.ap_pending;
    }

    public LocalDate getAp_expire_date(){
        return this.ap_expire_date;
    }

    public String getAp_title(){
        return this.ap_title;
    }
}

