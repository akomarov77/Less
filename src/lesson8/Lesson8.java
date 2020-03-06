package lesson8;

import lesson8.homeWork.*;

public class Lesson8 {
    public static void main(String[] args) {
/*        ExternalWorker ew = new ExternalWorker();
        ew.doCoffee();
        ew.getCoder().getProgrammingLang();
        ew.getAccountant().getDepartment();*/

        Company fb = new Company();
        Accountant accountant = new Accountant(45, "Nik", 45_000l, "IT");
        Coder coder = new Coder(23, "Ivan", 130_000l, "ADA");
        Admin admin4 = new Admin(34, "Joe", 30_000l, "IT");
        Admin admin3 = new Admin(54, "JoeC", 50_000l);
        Worker[] workers = {accountant, coder, admin4, admin3};
        fb.setWorkers(workers);
        fb.findMaxSalary();

        Krug krug1 = new Krug(4);
        WithPerimetr krug2 = new Krug(6);
        WithSquare krug3 = new Krug(8);

        krug1.printFromKrug();
        krug2.calculatePerimetr();
        krug2.calculateSquare();
        krug3.calculateSquare();

        Kvadrat kvadrat1 = new Kvadrat(7);
        Kvadrat kvadrat2 = new Kvadrat(5);


    }
}
