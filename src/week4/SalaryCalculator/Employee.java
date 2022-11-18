package week4.SalaryCalculator;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    private double tax() {
        final int salaryLimit = 1000;               // Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        final double taxe = 0.03;

        if (this.salary > salaryLimit) {
            return this.salary * taxe;              // Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
        }
        return 0.0;
    }

    private double bonus() {
        double bonus = 0;
        final int weeklyWorkingHours = 40;          // Eğer çalışan haftada 40 saatten fazla çalışmış ise
        final int extraMoney = 30;                  // Fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
        final int monthly = 4;                      // Bonus ücretlerin aylık hesabı için

        if (this.workHours > weeklyWorkingHours) {
            bonus = ((this.workHours - weeklyWorkingHours) * extraMoney) * monthly;
        }
        return bonus;
    }

    private double raiseSalary() {
        int thisYear = 2021;
        double raiseSalary = 0;
        final double raiseAmount1 = 0.05;       // Çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        final double raiseAmount2 = 0.10;       // Çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        final double raiseAmount3 = 0.15;       // Çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.

        // Maaş artışı (raiseSalary) hesaplanırken "zam + aylık alınan bonus - vergiler" şeklinde hesaplanır.
        if (thisYear - this.hireYear < 10) {
            raiseSalary = bonus() + this.salary * raiseAmount1 - tax();
        } else if (thisYear - this.hireYear > 9 && thisYear - this.hireYear < 20) {
            raiseSalary = bonus() + this.salary * raiseAmount2 - tax();
        } else if (thisYear - this.hireYear > 19) {
            raiseSalary = bonus() + this.salary * raiseAmount3 - tax();
        }
        return raiseSalary;         // Aylık bonus ücreti + alınan zam miktarı - vergi
    }

    private double totalSalary() {
        double totalSalary = 0;
        totalSalary = this.salary + bonus();        // Maaş bilgisi sadece aylık bonus ücreti ile
        return totalSalary;
    }

    private double netProfit() {
        double netProfit = 0;
        netProfit = this.salary + bonus() - tax();  // Maaş bilgisi aylık bonus ücreti ve vergiler ile
        return netProfit;
    }

    private double total_Salary() {
        double total_Salary = 0;
        total_Salary = this.salary + raiseSalary(); // Net maaş bilgisi. (Bankaya yatan para :) )
        return total_Salary;
    }

    public String toString() {
        return this.name + "'s salary information: "
                + "\nSalary: " + this.salary
                + "\nWork Hours: " + this.workHours
                + "\nHire Year: " + this.hireYear
                + "\nTax: " + tax()
                + "\nBonus: " + bonus()
                + "\nRaise Salary: " + raiseSalary()
                + "\nTotal Salary: " + totalSalary()
                + "\nSalary with tax and bonus: " + netProfit()
                + "\nTotal Salary with rise, bonus and tax: " + total_Salary()
                + "\n";
    }
}
