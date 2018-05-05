import java.time.LocalDate;
import java.util.Date;

public class Employee {

    private LocalDate doj;
    private LocalDate dob;

    private String str_doj = new String();
    private String str_dob = new String();  //will convert string to date

    private String emp_first_name = new String();
    private String emp_last_name = new String();
    private String emp_contact = new String();
    private int emp_id ;


    public String getStr_dob() {
        return str_dob;
    }


    public int getEmp_id() {
        return emp_id;
    }

    public String getEmp_contact() {
        return emp_contact;
    }

    public String getEmp_first_name() {
        return emp_first_name;
    }

    public String getEmp_last_name() {
        return emp_last_name;
    }

    public String getStr_doj() {
        return str_doj;
    }

    public void setEmp_contact(String emp_contact) {
        this.emp_contact = emp_contact;
    }

    public void setEmp_first_name(String emp_first_name) {
        this.emp_first_name = emp_first_name;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setEmp_last_name(String emp_last_name) {
        this.emp_last_name = emp_last_name;
    }

    public void setStr_dob(String str_dob) {
        this.str_dob = str_dob;
    }

    public void setStr_doj(String str_doj) {
        this.str_doj = str_doj;
    }


}