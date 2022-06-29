package org.example;

import java.util.List;

public class Staff {
    private String name;
    private int IdNo;
    private List<Staff> staff;

    public Staff(String name, int idNo) {
        this.name = name;
        IdNo = idNo;
    }

    public String getName() {
        return name;
    }

    public int getIdNo() {
        return IdNo;
    }

    public List<Staff> getStaff() {
        return staff;
    }
}
