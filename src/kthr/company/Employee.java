/*
 * SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package kthr.company;

public class Employee {
    private String citizenId;
    private String email;
    private String name;

    public double calculateInsurancePayment()
    {
        return 0.0;
    }

    public String getCitizenId()
    {
        return this.citizenId;
    }

    public String getEmail()
    {
        return this.email;
    }

    public String getName()
    {
        return this.name;
    }

    public void setCitizenId(String id)
    {
        this.citizenId = id;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
