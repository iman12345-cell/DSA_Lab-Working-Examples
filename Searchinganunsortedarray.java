/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searchinganunsortedarray;

/**
 *
 * @author 123
 */
public class Searchinganunsortedarray {

static int findelement(int arr[],int n,int key)
    {
        for(int i=0;i<n;i++)
            if(arr[i]==key)
                return i;
    
    return -1;
    }

public static void main(String[] args) 
{
int arr[]={12,34,10,6,40};
int n=arr.length;
int key=40;
int position=findelement(arr,n,key);

if (position== -1)
System.out.println("element not found");

else
System.out.println("element found at position:" +(position +1));
}
}