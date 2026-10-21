import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public String str;
    
    // Static variable to hold the single instance of the class
    private static Singleton instance;

    // 2. Private non-parameterized constructor prevents direct instantiation
    private Singleton() {}

    // 3. Static method that returns the single instance of the class
    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


