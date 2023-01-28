/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uas_saepulhidayat_binarytree;

/**
 *
 * @author windows-installer
 */
public class UAS_Saepulhidayat_Binarytree {

    public static void main(String[] args) {
        Tree intTree = new Tree();

        intTree.insert(30);
        intTree.insert(27);
        intTree.insert(24);
        intTree.insert(25);
        intTree.insert(47);
        intTree.insert(87);
        intTree.insert(55);
        intTree.insert(49);
        intTree.insert(52);
        intTree.insert(19);
        intTree.insert(17);
        intTree.insert(12);

        intTree.traverseInOrder();
        System.out.println("\nSize of Binary Tree => " + intTree.size());

        System.out.println(intTree.get(24));
        System.out.println(intTree.get(52));

        System.out.println("Max Data Of Binary Tree => " + intTree.max());
        System.out.println("Min Data Of Binary Tree => " + intTree.min());
    }

}

