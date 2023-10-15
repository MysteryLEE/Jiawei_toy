package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    protected void modify(Transaction t) {
        try {
            this.lock.writeLock().lock();
            t.perform();
        } finally {
            this.lock.writeLock().unlock();
        }

    }
}