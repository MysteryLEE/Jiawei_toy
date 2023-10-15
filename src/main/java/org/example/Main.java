package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static double Entropy( int[] values ){
        int     n = values.length;
        int     total = 0;
        double  entropy = 0;
        double  p;

        // calculate total amount of hits
        for ( int i = 0; i < n; i++ )
        {
            total += values[i];
        }

        if ( total != 0 )
        {
            // for all values
            for ( int i = 0; i < n; i++ )
            {
                // get item's probability
                p = (double) values[i] / total;
                // calculate entropy
                if ( p != 0 )
                    entropy += ( -p * (Math.log10(p)/Math.log10(2)) );
            }
        }
        return entropy;
    }

}