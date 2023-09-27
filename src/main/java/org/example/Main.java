package org.example;

public class Main {
    public static void main(String[] args) {
TotalCount.incrementTotalCount();
TotalCount instanceCount1 = new TotalCount();
        instanceCount1.incrementInstanceCount();

        TotalCount.incrementTotalCount();
        TotalCount instanceCount2 = new TotalCount();
        instanceCount2.incrementInstanceCount();
    }

}
