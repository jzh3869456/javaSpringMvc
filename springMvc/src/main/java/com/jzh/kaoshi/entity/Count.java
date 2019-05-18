package com.jzh.kaoshi.entity;

public class Count {

    private int maleUsers;

    private int femaleUsers;

    public Count() {
    }

    public Count(int maleUsers, int femaleUsers) {
        this.maleUsers = maleUsers;
        this.femaleUsers = femaleUsers;
    }

    public int getMaleUsers() {
        return maleUsers;
    }

    public void setMaleUsers(int maleUsers) {
        this.maleUsers = maleUsers;
    }

    public int getFemaleUsers() {
        return femaleUsers;
    }

    public void setFemaleUsers(int femaleUsers) {
        this.femaleUsers = femaleUsers;
    }

    @Override
    public String toString() {
        return "Count{" +
                "maleUsers=" + maleUsers +
                ", femaleUsers=" + femaleUsers +
                '}';
    }
}
