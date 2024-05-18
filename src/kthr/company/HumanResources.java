/*
 * SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package kthr.company;

public class HumanResources {
    public void payInsurance(Employee employee)
    {
        System.out.printf("Citizen ID: %s%n", employee.getCitizenId());
        System.out.printf("Name: %s%n", employee.getName());
        System.out.printf("Email: %s%n", employee.getEmail());
        System.out.printf("Incurance Payment: %.2f%n",
                employee.calculateInsurancePayment());
    }
}
