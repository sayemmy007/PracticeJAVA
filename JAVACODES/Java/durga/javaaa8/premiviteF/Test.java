package Java.durga.javaaa8.premiviteF;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class Test {
public static void main(String[] args) {

		Function<String, Integer> fs = s -> s.length();
		System.out.println(fs.apply("Imran")); // no good programming practice bcoz of autoboxing
		
        ToIntFunction<String> f = s -> s.length();
        System.out.println(f.applyAsInt("Imran"));
        
        
        
        Function<Integer,Double> f1 = i -> Math.sqrt(i);
        System.out.println(f1.apply(7));  // no good
        
        IntToDoubleFunction f2 = i -> Math.sqrt(i);
        System.out.println(f2.applyAsDouble(7)); // performance improve
        
        
        
        BiFunction<String,String,String> f123 = (s1,s2) -> s1+s2;
        System.out.println(f123.apply("Imran","Sayyed")); // no good
        
        BinaryOperator<String> b = (s1,s2) -> s1+s2;
        System.out.println(b.apply("Imran","Sayyed"));
        
        
        
        BinaryOperator<Integer> b1 = (i1,i2) -> i1+i2;
        System.out.println(b1.apply(10, 20)); // no good
        
        IntBinaryOperator b12 = (i1,i2) -> i1+i2;
        System.out.println(b1.apply(10, 20)); // performance improve
        
        
        IntUnaryOperator f0 = i -> i+1;
        System.out.println(f0.applyAsInt(4));
        IntUnaryOperator f01 = i -> i*i;
        System.out.println(f01.applyAsInt(4));
        
        System.out.println(f0.andThen(f01).applyAsInt(4));
        
        
  	}

}
