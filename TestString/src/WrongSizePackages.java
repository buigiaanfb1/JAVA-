import java.util.Base64;
import java.util.Scanner;

public class WrongSizePackages {
	public static void main(String[] args) {
        Base64.Encoder enc = Base64.getEncoder();
        Base64.Decoder dec = Base64.getDecoder();
        String str = "An29122001!";

        // encode data using BASE64
        String encoded = enc.encodeToString(str.getBytes());
        System.out.println("encoded value is \t" + encoded);

        // Decode data
        String decoded = new String(dec.decode(encoded));
        System.out.println("decoded value is \t" + decoded);
        System.out.println("original value is \t" + str);
	}

}
