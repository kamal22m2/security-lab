
import java.util.*;

public class NewClasss {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

char[][] key = {

{'M','O','N','A','R'},

{'C','H','Y','B','D'},

{'E','F','G','I','K'},

{'L','P','Q','S','T'},

{'U','V','W','X','Z'}

};

System.out.print("Enter Plain Text: ");

String text = sc.nextLine().toUpperCase();

text = text.replace(" ", "");

for (int k = 0; k < text.length() - 1; k += 2) {

char a = text.charAt(k);

char b = text.charAt(k + 1);

int r1 = 0, c1 = 0, r2 = 0, c2 = 0;

for (int i = 0; i < 5; i++) {

for (int j = 0; j < 5; j++) {

if (key[i][j] == a) {

r1 = i;

c1 = j;

}

if (key[i][j] == b) {

r2 = i;

c2 = j;

}

}

}

if (r1 != r2 && c1 != c2) {

System.out.print(key[r1][c2]);

System.out.print(key[r2][c1]);

} else {

System.out.print(a);

System.out.print(b);

}

}

}

} 
