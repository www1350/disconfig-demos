import org.junit.Test;

public class JXTTest {
    @Test
    public void cutStrTest(){
        String aa="w想換a是b是a";

        int length = aa.length();
        char last  = aa.charAt(length-1);
        //...判断是否字母
            System.out.println("" + last);
            int i = length - 1;
            for (; i >= 0; i--) {
                if (!(aa.charAt(i) <='z'&&aa.charAt(i) >='a'||aa.charAt(i) <='Z'&&aa.charAt(i) >='A'))
                    break;
            }
            if (i==-1) i=length-1;
            i++;

            System.out.printf("" + aa.substring(0, i));

    }
}
