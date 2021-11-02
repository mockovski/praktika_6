package com.company;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>
{
    public void QuickCompare(Student[] list, int begin, int end)
    {
        if(end==begin) {return;}
        Student pivot = list[end];
        boolean mark_left = false;
        boolean mark_right = false;
        Student changeover;
        int left = begin;
        int right = end-1;
        while (left < right) {
            if (compare(list[left], pivot) <= 0 && !mark_left)
            {
                left+=1;
            }
            else
            {
                mark_left = true;
            }
            if (compare(list[right], pivot) > 0 && !mark_right)
            {
                right--;
            }
            else {
                mark_right = true;
            }
            if (mark_left && mark_right) {
                changeover = list[left];
                list[left] = list[right];
                list[right] = changeover;
                mark_left = false;
                mark_right = false;
            }
        }
        Student change = list[end];
        if (compare(list[left], pivot) <= 0)
        {
            list[end]=list[left+1];
            list[left+1]=change;
        }
        else
        {
            list[end]=list[left];
            list[left]=change;
        }
        if (left>begin+1)
        {
            QuickCompare(list, begin, left);
        }
        if (left+1<end)
        {
            QuickCompare(list, left+1, end);
        }

    }
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.GPA, o2.GPA);
    }
}
