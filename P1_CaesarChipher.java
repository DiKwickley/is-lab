public class P1_CaesarChipher {

    static String encryption(String str, int key){

        key = key%26;

        str = str.toLowerCase();
        char[] strArr = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            int ascii = (strArr[i] - 97  + key)%26 ;
            strArr[i] = (char) (97 + ascii);
        }

        return new String(strArr);
    }

    static String decryption(String str, int key){

        return encryption(str, 26-key);
    }

    public static void main(String args[]){
        int cipherKey = 15;

        

        String cipherText = encryption("hello", cipherKey) ;
        System.out.println("CipherText: "+cipherText);
        String plainText = encryption(cipherText, 26- cipherKey);
        System.out.println("PlainText: "+plainText);


        
    }
}
