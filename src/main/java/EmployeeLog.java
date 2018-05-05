import java.time.LocalTime;

public class EmployeeLog {

    private int number_of_days;
    private LocalTime in_time;
    private LocalTime out_time;
    private int no_of_hours ;

    private String str_in_time = new String();
    private String str_out_time = new String();

    public int getNo_of_hours() {
        return no_of_hours;
    }

    public int getNumber_of_days() {
        return number_of_days;
    }

    public String getStr_in_time() {
        return str_in_time;
    }

    public String getStr_out_time() {
        return str_out_time;
    }

    public void setNo_of_hours(int no_of_hours) {
        this.no_of_hours = no_of_hours;
    }

    public void setNumber_of_days(int number_of_days) {
        this.number_of_days = number_of_days;
    }

    public void setStr_in_time(String str_in_time) {
        this.str_in_time = str_in_time;
    }

    public void setStr_out_time(String str_out_time) {
        this.str_out_time = str_out_time;
    }
}
