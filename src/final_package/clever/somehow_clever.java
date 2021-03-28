package final_package.clever;
import final_package.stupid;
import final_package.c;
import java.io.UnsupportedEncodingException;


public final class somehow_clever implements c {

    // nemo: we can guess from content that thing is base64 to hex
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }

    private static byte[] a(byte[] paramArrayOfbyte, String paramString) {
        int k = paramArrayOfbyte.length;
        int m = paramString.length();
        int j = 0;
        int n;
        System.out.printf("k = %d\n", k);
        for (int i = 0; j < k; i = n + 1) {
            n = i;
            if (i >= m)
                n = 0;
            paramArrayOfbyte[j] = (byte)(paramArrayOfbyte[j] ^ paramString.charAt(n));
            j++;
        }
        System.out.println("hey from somehow_clever.a private");
        return paramArrayOfbyte;
    }

    public String a(String paramString1, String paramString2) {
        try {
            System.out.printf("hey from somehow_clever.a public: %s %s\n", paramString1, paramString2);
            byte[] arrayOfByte = stupid.a(paramString1, 2);
            byte[] decodedBase64 = hexStringToByteArray("5717383b300a7a7805636153265220137042707173657c6a53025218777b616067584356204f0434");
            System.out.printf("somehow_clever.a: stupid.a's result is %s\n", decodedBase64);
            System.out.printf("somehow_clever.a: stupid.a's result's length is %d\n", decodedBase64.length);
            byte[] temp = a(decodedBase64, paramString2);
            return new String(temp, "UTF-8");
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            byte[] arrayOfByte = stupid.a(paramString1, 2);
            a(arrayOfByte, paramString2);
            return new String(arrayOfByte);
        }
    }
}

