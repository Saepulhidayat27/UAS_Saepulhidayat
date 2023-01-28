/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uas_saepulhidayat_queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author windows-installer
 */
public class UAS_Saepulhidayat_Queue {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Saepul", "Hidayat", 135);
        Employee johnDoe = new Employee("Syahrul", "Hidayat", 476);
        Employee marySmith = new Employee("Bus", "Tayo", 24);
        Employee mikeWilson = new Employee("Cimun", "kimun", 3254);
        Employee billEnd = new Employee("Aceng", "Hidayat", 765);

        Queue<Employee> queue = new PriorityQueue<Employee>();
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);
        System.out.println("First init Queue");
        for (Employee employee : queue) {
            System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
        }
        System.out.println("\n");
        System.out.println("Head Of Queue");
        System.out.println(queue.element() + "--->> Using Element Method");
        System.out.println(queue.peek() + "--->> Using Peek Method");

        System.out.println("\n");
        System.out.println("Remove Head Of Queue");
        System.out.println(queue.remove(queue.element()));
        for (Employee employee : queue) {
            System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
        }

        System.out.println("\n");
        System.out.println("Head Of Queue After Remove");
        System.out.println(queue.element() + "--->> Using Element Method");
        System.out.println(queue.peek() + "--->> Using Peek Method");

        System.out.println("\n");
        System.out.println("Add data to Queue via offer");
        System.out.println(queue.offer(marySmith));
        for (Employee employee : queue) {
            System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
        }

        System.out.println("\n");
        System.out.println("Get all data Queue");
        Iterator<Employee> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
