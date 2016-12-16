/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1_isz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Róbert
 */
public class uloha1 {
    public uloha1(){
        Integer [] array= vygenArr();
        printArray(array);
        array=removeDup(array);
        printArray(array);
    }
    
    public Integer[] vygenArr()
    {
        Integer [] array= new Integer[100];
        for(int i=0;i<array.length;i++)
             array[i] = (int)(Math.random() * 100);
        return array;
    }
    
    public Integer[] removeDup(Integer[] array){
        Set<Integer> setArray = new HashSet<Integer>(Arrays.asList(array));
        return setArray.toArray(new Integer[setArray.size()]);
    }
    
    public void printArray(Integer[] array){
        System.out.println(Arrays.toString(array));
    }
}
