package org.code.tutorials.style;
import java.util.Scanner;


public class NoStyle {

public static void main(String[] args) {
String s1 = "";
String s2 = "";
Scanner s3 = new Scanner(System.in);
System.out.print("Enter your first name: ");
s1 = s3.nextLine();
System.out.print("Enter your last name: ");
s2 = s3.nextLine();
for(int i = 0; i < 3; i++) {
print(s1 + " " + s2);
}
s3.close();
}

private static void print(String text) {
System.out.println(text);
}
}
