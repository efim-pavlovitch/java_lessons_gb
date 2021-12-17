package com.gbLessons.lesson2;

public class Team {
    private String nameTeam;
    private Employee[] membersTeam = new Employee[10];

    public Team(String name) {
        this.nameTeam = name;
    }

    public void addMemberTeam(Employee obj) {
        int ind = 0;
        while (membersTeam[ind] != null) {
            ++ind;
            if (ind >= this.membersTeam.length) {
                System.out.println("Ошибка");
                return;
            }
            this.membersTeam[ind] = obj;
        }
    }

    public void printAllMember(){

        this.membersTeam[0].printInfo();
    }
}
