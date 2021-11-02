package com.company;

public class Main {

    public static void main(String[] args) {
        Student[] IDSorting = new Student[6];
        IDSorting[0] = new Student("Jowie", 3, 41);
        IDSorting[1] = new Student("Rachel", 6, 137);
        IDSorting[2] = new Student("Chandler", 1, 224);
        IDSorting[3] = new Student("Monica", 5, 779);
        IDSorting[4] = new Student("Ross", 2, 999);
        IDSorting[5] = new Student("Fiby", 4, 52);
        //(new SortingStudentsByGPA()).QuickCompare(IDSorting, 0, 5);
        com.company.Student[] students = (new StudentsMergeSort()).MergeSort(IDSorting);
        for(int i=0;i<6;i++)
        {
            System.out.println(IDSorting[i].name + " " + IDSorting[i].id_num + " " + IDSorting[i].GPA);
        }
    }
    public static void selectionSort (Student[] list) {
        int min;
        Student temp;
        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
}
