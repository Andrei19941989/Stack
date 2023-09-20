package com.company;

import javax.swing.*;
import java.util.Arrays;

public class MyStack <T>{//создаем класс стек(generic class)неопредленный тип данных-T
   private  Object[]array;
    private int size;
   public MyStack(int m)
   {
       array=new Object[m];//массив для хранения элементов стека
       size=0;//текушие колличество элементов

   }
   public void add(T Item) throws Exception {
     if(size<array.length)
     {
        array[size]=Item;//добавляем элемент в стек
         size++;
     }
     else
         throw new Exception("стек заполнен");
   }
   public T pop() throws Exception {
       if(size==0)
       {
           throw new Exception("стек пустой");
       }
       else
       {
           T vopros=(T)array[size-1];
           array[size-1]=null;
           size =size -1;
           return vopros;
       }
   }
   public T peek()throws  Exception {
       if (size == 0) {
           throw new Exception("стек пустой");
       } else {
           return (T) array[size - 1];
       }

   }
   public boolean contains(T element)throws  Exception
   {
       for(int i=0;i<size;i++)
       {
           if (array[i].equals(element)) {
            return true;
           }
       }
       return false;

   }
    @Override
    public String toString() {
       String stroka="";
       for(int i =0;i<size;i++)
       {
           stroka+=array[i].toString() + " ";

       }
       return stroka;

    }
}
