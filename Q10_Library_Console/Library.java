import java.util.*;

class Library {
public static void main(String[] args) {
ArrayList<String> b = new ArrayList<>();
Scanner s = new Scanner(System.in);
int ch;

do {
System.out.println("1.Add 2.View 3.Update 4.Delete 0.Exit");
ch=s.nextInt();

if(ch==1) b.add(s.next());
else if(ch==2) System.out.println(b);
else if(ch==3) b.set(s.nextInt(),s.next());
else if(ch==4) b.remove(s.nextInt());

} while(ch!=0);
s.close();
}
}