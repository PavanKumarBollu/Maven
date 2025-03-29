package com.pavan;


public class MathApp 
{
    public int add(int x, int y)
    {
        return x+y;
    }

    public static void main( String[] args )
    {
       MathApp ma = new MathApp();
       int result = ma.add(100, 101);
       System.out.println( "The Sum Is : " + result );
    }
}
