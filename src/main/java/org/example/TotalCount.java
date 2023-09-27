package org.example;

public class TotalCount {
    static int totalCount = 0;
    int bla;
    int instanceCount = 0;
    public static void incrementTotalCount() {
        totalCount++;
        System.out.println("totalCount: " + totalCount);
    }
    public void incrementInstanceCount() {
        instanceCount++;
        System.out.println("instanceCount: " + instanceCount);
    }
}

