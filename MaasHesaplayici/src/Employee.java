public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear= hireYear;
    }
    public double tax() {
        if (salary <= 1000) {
            return 0.0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30.0;
        } else {
            return 0.0;
        }
    }
    //Maaş artışı hesaplanır
    double raiseSalary() {
        if(2021 - this.hireYear < 10) {
            double raise = this.salary * 0.05;
            return raise;
        }
        if(2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            double raise = this.salary * 0.1;
            return raise;
        }
        else {
            double raise = this.salary * 0.15;
            return raise;
        }
    }
    //Çalışana ait bilgiler ekrana bastırılır.
    public String toString() {
        return "Adı: " + this.name+
                "\nMaasi: " + this.salary+
                "\nÇalisma Saati: " + this.workHours+
                "\nBaşlangic Yili: " + this.hireYear+
                "\nVergi:  " + tax() +
                "\nBonus: " +  bonus() +
                "\nMaas Artisi: " + raiseSalary()+
                "\nVergi ve Bonuslarla birlikte maas: " + (this.salary + bonus() - tax()) +
                "\nToplam Maas: " + (this.salary + raiseSalary());
    }
}