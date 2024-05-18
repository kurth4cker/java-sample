// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>
// SPDX-License-Identifier: GPL-3.0-or-later

package kthr.company;

public class Worker extends Employee {
    private int feePerHour;
    private int hourPerDay;

    // override
    public double calculateInsurancePayment()
    {
        return this.feePerHour * this.hourPerDay * 30;
    }

    public int getFeePerHour()
    {
        return this.feePerHour;
    }

    public int getHourPerDay()
    {
        return this.hourPerDay;
    }

    public void setFeePerHour(int fee)
    {
        this.feePerHour = fee;
    }

    public void setHourPerDay(int hour)
    {
        this.hourPerDay = hour;
    }
}
