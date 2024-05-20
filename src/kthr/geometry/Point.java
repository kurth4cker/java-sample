// SPDX-License-Identifier: GPL-3.0-or-later
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package kthr.geometry;

public final class Point {
    public double x, y;

    public static double distance(Point p1, Point p2)
    {
        double x_square = Math.pow(p1.x - p2.x, 2);
        double y_square = Math.pow(p1.y - p2.y, 2);

        return Math.sqrt(x_square + y_square);
    }

    public Point()
    {
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return String.format("(%.2f, %.2f)", this.x, this.y);
    }
}
