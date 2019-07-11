package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if(leftBorder>rightBorder){
            int tmp=leftBorder;
            leftBorder=rightBorder;
            rightBorder=tmp;
        }
        int sum=0;
        for(int i=leftBorder;i<=rightBorder;i++){
            sum+=i%2==0?i:0;
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        //        int sum=0;
//        for(Integer i:arrayList){
//            sum+=i*3+2;
//        }
//        return sum;
//        return arrayList.stream().mapToInt(item->item*3+2).sum();
        return arrayList.stream().map(item->item*3+2).reduce(0,(a,b)->a+b);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        //        List<Integer> list=new ArrayList<>();
//        for(Integer i:arrayList){
//            list.add(i%2==0?i:i*3+2);
//        }
//        return list;
        return arrayList.stream().map(item-> item%2==0?item:item*3+2).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item%2 !=0).map(item -> item*3+5).reduce(0,(a,b)->a+b);
//        return  arrayList.stream().reduce(0,(a,b) -> a+=b%2!=0?b*3+5:b);
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        //        return arrayList.stream().filter(item->item%2==0).reduce(0,(a,b)->a+b)/arrayList.stream().filter(item->item%2==0).count();

        return  arrayList.stream().filter(item->item%2==0).mapToDouble(item->item).average().orElse(0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(item->item%2==0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
