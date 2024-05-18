// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>
// SPDX-License-Identifier: GPL-3.0-or-later

package kthr.company;

public class Manager extends Employee {
    private String department;
    private double salary;

    // override
    public double calculateInsurancePayment()
    {
        return this.salary * 1.6;
    }

    public String getDepartment()
    {
        return this.department;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}
