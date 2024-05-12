/*
 * SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package kthr.company;

public final class Main {
    private static Manager getManager()
    {
        Manager manager = new Manager();

        manager.setCitizenId("12345678916");
        manager.setName("Çelik");
        manager.setEmail("celik@mic.com");
        manager.setSalary(30_000);
        manager.setDepartment("Pazarlama");

        return manager;
    }

    private static ProjectWorker getProjectWorker()
    {
        ProjectWorker worker = new ProjectWorker();

        worker.setCitizenId("98765432124");
        worker.setName("gökçe");
        worker.setEmail("gokce@kthr.org");
        worker.setFeePerHour(100);
        worker.setHourPerDay(7);
        worker.setFeeFactor(5);
        worker.setProjectName("cbuild");

        return worker;
    }

    private static Worker getWorker()
    {
        Worker worker = new Worker();

        worker.setCitizenId("7439827812");
        worker.setName("ali");
        worker.setEmail("ali@kthr.org");
        worker.setFeePerHour(120);
        worker.setHourPerDay(8);

        return worker;
    }

    public static void main(String[] args)
    {
        HumanResources hr = new HumanResources();
        Manager manager = getManager();
        Worker worker = getWorker();
        ProjectWorker project_worker = getProjectWorker();

        hr.payInsurance(manager);
        System.out.println();
        hr.payInsurance(worker);
        System.out.println();
        hr.payInsurance(project_worker);
    }
}
