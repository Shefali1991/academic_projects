import java.util.*;
public class perimeter 
{

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("No. of cakes to be created");
int n = sc.nextInt();
System.out.println("Area corresponding to each cake");
int[] areas = new int[n];
for (int i = 0; i < n; i++) {
areas[i] = sc.nextInt();
}

int[] peri = new int[areas.length];

for (int i = 0; i < areas.length; i++) {
int min = Integer.MAX_VALUE;
for (int m = 1; m * m <= areas[i]; m++) {
if (areas[i] % m == 0) {
min = Math.min(min, 2 * (areas[i] / m + m));
}
peri[i] = min;
}

}

for (int i = 0; i < n; i++) {
System.out.println(peri[i]);
}


}
}