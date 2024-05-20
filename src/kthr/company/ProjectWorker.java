// SPDX-License-Identifier: GPL-3.0-or-later
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package kthr.company;

public class ProjectWorker extends Worker {
    private double feeFactor;
    private String projectName;

    // override
    public double calculateInsurancePayment()
    {
        return super.calculateInsurancePayment() * this.feeFactor;
    }

    public double getFeeFactor()
    {
        return this.feeFactor;
    }

    public String getProjectName()
    {
        return this.projectName;
    }

    public void setFeeFactor(double factor)
    {
        this.feeFactor = factor;
    }

    public void setProjectName(String name)
    {
        this.projectName = name;
    }
}
