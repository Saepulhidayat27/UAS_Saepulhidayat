/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uas_saepulhidayat_stack;

/**
 *
 * @author windows-installer
 */
public class UAS_Saepulhidayat_Stack {
    public static void main(String[] args) {
       ArrayStack stack = new ArrayStack(5);

                System.out.println("Is Stack empty => " + stack.isEmpty() + "\n");

                System.out.println("Adding Data to Stack");
                System.out.println("=============================================================================================================================================");
                stack.push(new Employee("Saepul", "Hidayat", 1));
                stack.push(new Employee("Syahrul", "Hidayat", 2));
                stack.push(new Employee("Siti", "Sadiah", 3));
                stack.push(new Employee("Dian", "Hidayat", 4));
                stack.push(new Employee("Siti", "Shopia", 5));
                stack.printStack();
                System.out.println("Size of Stack => " + stack.size());
                System.out.println("=============================================================================================================================================");
                System.out.println("See First Data From Stack => " + stack.peek());
                System.out.println("Remove Data From Stack => " + stack.pop());

                System.out.println("=============================================================================================================================================");
                System.out.println("Last After All Remove");
                stack.printStack();
                System.out.println("=============================================================================================================================================");
    }
}

