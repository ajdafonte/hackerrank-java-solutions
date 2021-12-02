package pt.caires.hackerrank.bignumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class PrimalityTest {

    static String getPrimeNumberResult(BigInteger n) {
        return n.isProbablePrime(1) ? "prime" : "not prime";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        System.out.println(getPrimeNumberResult(new BigInteger(n)));
        bufferedReader.close();
    }

}
