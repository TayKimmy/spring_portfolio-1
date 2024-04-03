package com.nighthawk.hacks;

public class StackHeapTest {
    public int n = 5; // Primitive data type on the heap
    public static void changeInt(int nValue, int nRefN, StackHeapTest nRef) {
        System.out.println("PRE METHOD:");
        System.out.println("nValue: " + nValue);
        System.out.println("nRefN: " + nRefN);
        System.out.println("nRef.n: " + nRef.n);
        System.out.println("HashCode nRef: " + System.identityHashCode(nRef));

        nValue += 10;
        nRefN += 10;
        nRef.n += 10;

        System.out.println("POST METHOD:");
        System.out.println("nValue: " + nValue);
        System.out.println("nRefN: " + nRefN);
        System.out.println("nRef.n: " + nRef.n);
        System.out.println("HashCode nRef: " + System.identityHashCode(nRef));
    }

    public static void main(String[] args) {
        int n = 5; // Primitive data type on the stack
        StackHeapTest nRef = new StackHeapTest();
        System.out.println("PRE MAIN:");
        System.out.println("n: " + n);
        System.out.println("nRef: " + nRef);
        System.out.println("nRef.n: " + nRef.n);
        System.out.println("HashCode n: " + System.identityHashCode(n));
        System.out.println("HashCode nRef.n: " + System.identityHashCode(nRef.n));
        System.out.println("HashCode nRef: " + System.identityHashCode(nRef));

        changeInt(n, nRef.n, nRef); // stack by value, heap by value, heap by reference

        System.out.println("POST MAIN:");
        System.out.println("n: " + n);
        System.out.println("nRef: " + nRef);
        System.out.println("nRef.n: " + nRef.n);
        System.out.println("HashCode n: " + System.identityHashCode(n));
        System.out.println("HashCode nRef.n: " + System.identityHashCode(nRef.n));
        System.out.println("HashCode nRef: " + System.identityHashCode(nRef));
    }
}