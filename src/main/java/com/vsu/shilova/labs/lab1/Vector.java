package com.vsu.shilova.labs.lab1;

import java.util.concurrent.ThreadLocalRandom;

public class Vector {

    private Integer x, y, z;

    public Vector(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Integer scalarProduct(Vector vector) {
        return x * vector.getX() + y * vector.getY() + z * vector.getZ();
    }

    public Vector vectorProduct(Vector vector) {
        Integer nexX = this.y * vector.getZ() + this.z * vector.getY();
        Integer newY = this.z * vector.getX() + this.x * vector.getZ();
        Integer newZ = this.x * vector.getY() + this.y * vector.getX();
        return new Vector(nexX, newY, newZ);
    }

    public double angleBetweenVectors(Vector vector) {
        Integer scalarProduct = this.scalarProduct(vector);
        try {
            return scalarProduct / (this.length() * vector.length());
        } catch (Exception e) {
            System.out.println("Unable to find angle " + e.getCause());
            return Double.NaN;
        }
    }

    public Vector addition(Vector vector) {
        return new Vector(this.x + vector.getX(), this.y + vector.getY(), this.z + vector.getZ());
    }

    public Vector subtraction(Vector vector) {
        return new Vector(this.x - vector.getX(), this.y - vector.getY(), this.z - vector.getZ());
    }

    public static Vector[] getArrayWithNVectors(int numberOfVectors) {
        Vector[] arrayOfVectors = new Vector[numberOfVectors];
        for (int i = 0; i < numberOfVectors; i++) {
            int randX = ThreadLocalRandom.current().nextInt(0,1000);
            int randY = ThreadLocalRandom.current().nextInt(0,1000);
            int randZ = ThreadLocalRandom.current().nextInt(0,1000);
            arrayOfVectors[i] = new Vector(randX, randY, randZ);
        }
        return arrayOfVectors;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }
}
