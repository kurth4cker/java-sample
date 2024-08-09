// SPDX-License-Identifier: GPL-3.0-or-later
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package kthr.company;

public abstract class Employee {
    private String citizenId;
    private String email;
    private String name;

    public abstract double calculateInsurancePayment();

    public String getCitizenId() {
        return this.citizenId;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public void setCitizenId(String id) {
        this.citizenId = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
