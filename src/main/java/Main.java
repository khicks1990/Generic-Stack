import java.util.*;

public class Main
{

 public static void main(String [ ] arg)
 {
   GenStack <String> st = new GenStack <String> (10);

  st.push("George");
  st.push("Washington");

   System.out.println(st.pop());
   System.out.println(st.pop());
 }
}

