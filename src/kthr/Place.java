// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>
// SPDX-License-Identifier: GPL-3.0-or-later

package kthr;

public final class Place {
    private double latitude;
    private double longitude;
    private String name;

    public Place(String name, double latitude, double longitude)
    {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude()
    {
        return this.latitude;
    }

    public double getLongitude()
    {
        return this.longitude;
    }

    public String getName()
    {
        return this.name;
    }

    public void setLatitude(double latitude)
    {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return String.format("Name: %s, Latitude: %.2f, Longitude: %.2f",
                this.name, this.latitude, this.longitude);
    }
}
