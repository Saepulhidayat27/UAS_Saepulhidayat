/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uas_saepulhidayat_linearsearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author windows-installer
 */
public class UAS_Saepulhidayat_Linearsearch {
    public static int linearSearch(String arr[], String x) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i].equalsIgnoreCase(x)) {
                return i;
            }
        }
        return -1;
}

    public static void main(String[] args) {
        String arr[] = {"VYN", "R7", "lemong", "albertt", "kiboy"};
        System.out.println(Arrays.toString(arr));
        System.out.print("pilih nama : ");
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();

        int l = 0, r = arr.length - 1;
        int result = linearSearch(arr, x);
        if (result == -1) {
            System.out.print(
                    "Nama Tidak Ditemukan!!");
        } else {
            System.out.println("Nama Berada Pada Urutan array "
                    + result + "(atau Pada Urutan ke " + (result + 1) + ")");
        }
    }
}