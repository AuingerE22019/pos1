package net.htlgkr.pos3.auingere;

import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private int upperLimit;
    private List<Integer> primes;

    EratosthenesPrimeSieve (int upperLimit) {
        if (upperLimit < 2) {
            throw new IllegalArgumentException("Obergrenze muss mindestens 2 sein.");
        }
        this.upperLimit = upperLimit;
        this.primes = new ArrayList<>();
        sievesPrimes();
    }

    @Override
    public boolean isPrime(int p) {
        return false;
    }

    @Override
    public void printPrimes() {

    }
}
