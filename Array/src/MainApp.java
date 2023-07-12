import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MainApp {

  public static int duyetMang(int[] arr) {
    for (int a: arr) {

    }
    return 0;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int b[] = new int[4];
    b[0] = 20;
    
// Duyet mang    
    System.out.println("nhap phan tu vao mang :");
    for (int i = 0; i < b.length; i++) {

      b[i] = sc.nextInt();

    }
	int arr[] = {1, 2, 3, 4, 5}; 
    System.out.println("Mang a");
    for (int a: arr) {

      System.out.println("a = " + a);

    }
    System.out.println("Mang b");
    for (int i = 0; i < b.length; i++) {

      System.out.println("b = " + b[i]);
    }
// them phantu
    int[] newb = new int[b.length + 1];
    System.out.println("Mang da them phatu");
    System.arraycopy(b, 0, newb, 0, b.length);
    
    newb[b.length] = 20;
    b = newb;
    
    for (int number : b) {
        System.out.println("b = "+number);
    }
// xoa phan tu
    
    int positionToRemove = 2;
    int[] updatedNumbers1 = removeElement(arr, positionToRemove);
    System.out.println(Arrays.toString(updatedNumbers1));
  }

private static int[] removeElement(int[] arr, int positionToRemove) {
	if (positionToRemove < 0 || positionToRemove >= arr.length) {
        return arr;
    }

    int[] newArray = new int[arr.length - 1];
    int newArrayIndex = 0;

    for (int i = 0; i < arr.length; i++) {
        if (i != positionToRemove) {
            newArray[newArrayIndex] = arr[i];
            newArrayIndex++;
        }
    }	return null;
}

}