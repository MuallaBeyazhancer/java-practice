package day59_polymorphism;

public class Triangle extends Shape{
@Override
public void draw() {
	int i, j, k;
    for (i = 0; i < 5 + 1; i++) { for (j = 5; j > i; j--) {
            System.out.print(" ");
        }
        for (k = 0; k < (2 * i - 1); k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
