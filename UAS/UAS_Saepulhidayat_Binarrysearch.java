/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uas_saepulhidayat_binarrysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author windows-installer
 */
public class UAS_Saepulhidayat_Binarrysearch {
    public static int binarySearch(String arr[], String x) {

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = x.compareTo(arr[m]);
            if (res == 0) {
                return m;
            }
            if (res > 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
      return -1;
}
    public static void main(String[] args) {
        String arr[] = {"saepul", "sadiah", "tayo", "sasuke", "sakura"};
        System.out.println(Arrays.toString(arr));
        System.out.print("pilih nama : ");
        Scanner bs = new Scanner(System.in);
        String bx = bs.nextLine();

        Arrays.sort(arr);
        
        int bresult = binarySearch(arr, bx);
        if (bresult == -1) {
            System.out.print(
                    "Nama Tidak Ditemukan!!");
        } else {
            System.out.println("Nama Berada Pada Urutan array "
                    + bresult + "(atau Pada Urutan ke " + (bresult + 1) + ")");
        }
    }
}
