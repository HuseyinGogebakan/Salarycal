package J06ProjectSalary;

public class Employee {

 private   String name;
 private   int salary;
 private  int workHours;
 private  int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public Employee(String isim, int salary, int workHours, int year) {
        this.name = isim;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }

    public double tax(){

        return  salary<1000 ? 0 : salary*0.03;
    }


    public int bonus(){

        int paymentOfBonus = 0, addinitionalBonus = 50;
        return workHours>40 ? (workHours - 40) * addinitionalBonus : paymentOfBonus;
    }

    public double raiseSalary(){

        int timeOfYear = 2021,sumOfYear = timeOfYear - year;


        if (sumOfYear < 5){

            return  (salary+tax())*0.05;

        }else if (sumOfYear < 15){

            return  (salary+tax())*0.1;

        }else return  (salary+tax())*0.2;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", year=" + year +
                ", Company= Clarusway" +
                '}';
    }
}
