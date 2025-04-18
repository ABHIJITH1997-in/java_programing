import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
public static void main(String []args){
int count = 0;
String temp;
Scanner S = new Scanner(System.in);
System.out.println("Enter the number of strings to be sorted:");
count = S.nextInt();
S.nextLine();
String[] str_list = new String [count];
System.out.println("Enter your string");
for(int i=0;i<count;i++){
    str_list[i] = S.nextLine();
}
System.out.println("Choose 1 or 2 from the menu below:");
System.out.println("1.Inbuilt sort()");
System.out.println("2.user_defined sorting logic");
int choice = S.nextInt();
switch (choice){
case 1:
       Arrays.sort(str_list);
       System.out.println("sorted strings (inbuilt sort)" + Arrays.toString(str_list));
       break;
case 2:
      for(int i=0; i<count; i++){
        for(int j=i+1; j<count;j++){
            if(str_list[i].compareTo(str_list[j])>0){
                temp = str_list[i];
                str_list[i] = str_list[j];
                str_list[j] = temp;
                
            }
        }
        
      }
    System.out.println("sorted string (user.defined logic)"+ Arrays.toString (str_list));
    break;
    default:
     System.out.println("Invalid choice");
     }
     S.close();

    }
}

