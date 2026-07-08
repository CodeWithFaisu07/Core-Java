package data_hiding_oops;
class Employee{
    //Data Security- Data Hiding
    private String eid;
    private String ename;
    private String eage;
    private String eaddress;

    //Setter Method to Set Employee Details
    public void setEname(String ename){
        this.ename=ename;
    }
    public void setEid(String eid){
        this.eid=eid;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    public void setEage(String eage) {
        this.eage = eage;
    }
    //Getter Method

    public String getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public String getEage() {
        return eage;
    }

    public String getEaddress() {
        return eaddress;
    }
}

public class EmployeeDetails {
    static void main() {
        Employee e1 = new Employee();
        e1.setEname("Faisal Khan");
        e1.setEid("TCA2409102");
        e1.setEage("21");
        e1.setEaddress("Patna");

        System.out.println("Employee Name ::"+e1.getEname());
        System.out.println("Emplyee ID ::"+e1.getEid());
        System.out.println("Employee AGE ::"+e1.getEage());
        System.out.println("Emplyee Address ::"+e1.getEaddress());


    }
}
