/*Создайте класс Группа, включающий в себя название группы и массив из максимум 10 сотрудников
(не все элементы массива могут быть заполнены).
Реализуйте возможность
добавлять сотрудников в этот массив,
удалять их из него по индексу,
и удалять всех разом.
В классе Группа должен быть метод, позволяющий отпечатать информацию обо всех
сотрудниках, входящих в эту группу;*/

package com.gbLessons.lesson2;

public class Group {
    private String nameGroup;
    private Employee[] members;
    private int currInd;

    public Group(String nameGroup) {
        this.nameGroup = nameGroup;
        this.members = new Employee[10];
        this.currInd = 0;
    }

    public void addEmployee(Employee obj) {
        if (currInd >= 10) {
            System.out.println("Работников не может быть больше 10-ти :(");
            return;
        }
        this.members[currInd] = obj;
        ++currInd;
    }

    /*public void addThisEmployee(int positionAddElem, Employee obj) {
        if (positionAddElem < 1 || positionAddElem >= currInd + 1) {
            System.out.println("Ошибка! Под номер " + positionAddElem
                    + " нельзя добавить работника! Текущий номер работника: " + (currInd + 1));
            return;
        }
        if (currInd + 1 >= 10) {
            System.out.println("Работников не может быть больше 10-ти :(");
            return;
        }
        for (int i = currInd; i == positionAddElem; --i) {
            //System.out.println("1");
            this.members[i] = this.members[i - 1];
        }
        this.members[positionAddElem - 1] = obj;
        ++currInd;
    }*/

    public void printAllMember() {
        for (int i = 0; i < currInd; ++i) {
            this.members[i].printInfo();
        }

    }

    public void delEmployee() {
        if (currInd <= 0) {
            System.out.println("Ошибка! Нет работников");
        }
        this.members[currInd - 1] = null;
        --currInd;
    }

    public void delThisEmployee(int positionDelElem) {
        if (positionDelElem < 1 || positionDelElem > currInd) {
            System.out.println("Ошибка! Под номером " + positionDelElem + " нет работника");
            return;
        }
        for (int i = positionDelElem - 1; i < currInd; ++i) {
            this.members[i] = this.members[i + 1];
        }
        --currInd;
    }

    public void delAllEmployees() {
        for (int i = 0; i < currInd; ++i) {
            this.members[i] = null;
        }
        currInd = 0;
    }
}

