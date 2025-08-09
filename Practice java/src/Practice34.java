//84. 84Write a Java program to take the last three characters from a given string. It will add the three characters at both the front and back of the string. String length must be greater than three and more.
//        Test data: "Python" will be "honPythonhon"
//        Sample Output:
//
//        honPythonhon

public class Practice34 {
    public static void main(String[] args) {
        String str = "Python";
        int slength = 3;
        if(slength>str.length()){
            slength = str.length();
        }
        String subPart = str.substring(str.length()-3);
        System.out.println(subPart+str+subPart);
    }
}
