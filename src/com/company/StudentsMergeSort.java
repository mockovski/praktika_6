package com.company;

import java.util.Comparator;

public class StudentsMergeSort implements Comparator<Student>
{
    public Student[] MergeSort(Student[] list)
    {
        if(list.length==1)
        {
            return list;
        }
        else
        {
            Student[] list1 = new Student[list.length / 2 + (list.length % 2)];
            for (int i = 0; i < (list.length / 2) + (list.length % 2); i++) {
                list1[i] = list[i];
            }
            Student[] list2 = new Student[list.length / 2];
            for (int i = 0; i < (list.length / 2); i++) {
                list2[i] = list[(list.length / 2) + (list.length % 2) + i];
            }
            list1 = MergeSort(list1);
            list2 = MergeSort(list2);
            int count1 = 0;
            int count2 = 0;
            int i=0;
            while (i<list.length)
            {
                if(count1<list1.length && count2< list2.length)
                {
                    if(compare(list1[count1], list2[count2])<0)
                    {
                        list[i]=list1[count1];
                        count1++; i++;
                    }
                    else
                    {
                        list[i]=list2[count2];
                        count2++; i++;
                    }
                }
                else if(count1==list1.length)
                {
                    while(count2<list2.length)
                    {
                        list[i]=list2[count2];
                        count2++; i++;
                    }
                }
                else if(count2==list2.length)
                {
                    while(count1<list1.length)
                    {
                        list[i]=list1[count1];
                        count1++; i++;
                    }
                }
            }
            return list;
        }
    }
    public int compare(Student o1, Student o2) {
        if(o1.GPA> o2.GPA) return 1;
        else if (o1.GPA < o2.GPA) return -1;
        else return 0;
    }
}
