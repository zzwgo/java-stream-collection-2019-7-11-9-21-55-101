package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if(left<right){
            IntStream.rangeClosed(left,right).forEach(item->result.add(item));
        }else {
            for (int i = left; i >= right; i--) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if(left<right){
            IntStream.rangeClosed(left,right).filter(item->item%2==0).forEach(item->result.add(item));
        }else {
            for (int i = left; i >= right; i--) {
                if(i%2==0){
                    result.add(i);
                }
            }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result=new ArrayList<>();
        Arrays.stream(array).filter(item->item%2==0).forEach(item->result.add(item));
        return result;
    }

    public int popLastElment(int[] array) {
        return IntStream.of(array).skip(array.length-1).boxed().collect(Collectors.toList()).get(0);
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
