package com.fanxing.cn;

import java.util.*;
import java.util.ArrayList;

/**
 * @author HaleLv
 * @date 2021-02-12
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        String second = (String) list.get(0);
        System.out.println(second);
        StringArrayList li = new StringArrayList();
        li.add("hale");
//        String ab = li.get(0);
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Float> floatList = new ArrayList<Float>();
//        ArrayList<Person> personList = new ArrayList<Person>();


    }
    private Object[] array;
    private int size;
    public void add(Object e){}
    public void remove(int index){}
    public void get(int index){}
}

class StringArrayList {
    private String[] array;
    private int size;
    public String add(String e){
        return e;
    }
    public void remove(int index){}
//    public String get(int index){ }
}

class Arraylist<T> {
    private T[] array;
    private int size;
    public void add(T e){}
    public void remove(int index){}
//    public T get(int index){}
}

class ArrayLists<T> implements List<T>{

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}

