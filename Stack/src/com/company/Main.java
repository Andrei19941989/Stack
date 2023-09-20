package com.company;

public class Main {

    public static void main(String[] args) {
  MyStack<Integer>chislo=new MyStack<>(5);
  try {
      chislo.add(3);
      chislo.add(5);
      chislo.add(8);
      System.out.println(chislo);
      chislo.pop();
      System.out.println(chislo);
      System.out.println(chislo.contains(5));
  }
  catch(Exception e){
      System.out.println(e.getMessage());
  }


    }
}
