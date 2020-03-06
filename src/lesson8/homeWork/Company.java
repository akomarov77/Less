package lesson8.homeWork;

public class Company {
    private Worker[] workers;

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    public void findMaxSalary() {
        Worker workerWithMaxSalary = workers[0];
        for (int i = 1; i < workers.length; i++) {
            if (workers[i].getSalary() > workerWithMaxSalary.getSalary()) {
                workerWithMaxSalary = workers[i];
            }
        }
        System.out.println("Worker " + workerWithMaxSalary.getName()
                + " has salary: " + workerWithMaxSalary.getSalary());
    }
}
