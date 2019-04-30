package day27_arrays05;

import java.util.Arrays;

public class copyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double[] d1 = {2.3, 4.5, 12.4};
      double[] d2 = d1;
      
      System.out.println(Arrays.toString(d1));
      System.out.println(Arrays.toString(d2));
      
      d1[0] = 1000.3;
      System.out.println(Arrays.toString(d1));
      System.out.println(Arrays.toString(d2));
      
      d2[1] = 400.5;
      System.out.println(Arrays.toString(d1));
      System.out.println(Arrays.toString(d2));
      
      double[] d3 = Arrays.copyOf(d2, d2.length);
      
      
      System.out.println("D3:" + Arrays.toString(d3));
      d2[0] = 1;
      System.out.println("D3:" + Arrays.toString(d3));
	}

}
