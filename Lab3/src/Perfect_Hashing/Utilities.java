package Perfect_Hashing;

import java.security.*;
import java.math.BigInteger;

public class Utilities {

    private final int MAX_BITS;

    public Utilities(){
        this.MAX_BITS = 128;
    }

    public int[] matrixMultiplication(int[][] h, int[] x){
        int[] hx = new int[h.length];
        for(int i = 0 ; i < x.length ; i++){
            if(x[i] == 0)
                continue;
            for(int j = 0 ; j < h.length ; j++)
                hx[j] = (hx[j] + h[j][i]) % 2;
        }
        return hx;
    }

    public int[][] generateMatrix(int rows, int cols){
        int[][] randomMatrix = new int[rows][cols];
        for(int i = 0 ; i < rows ; i++)
            for(int j = 0 ; j < cols ; j++)
                randomMatrix[i][j] = (int)(Math.random() * 2);
        return randomMatrix;
    }

    public int[] generateMatrix(int rows){
        int[] randomMatrix = new int[rows];
        for(int i = 0 ; i < rows ; i++)
            randomMatrix[i] = (int)(Math.random() * 2);
        return randomMatrix;
    }

    public <T> int[] convertToBinArr(T obj) {
        if(! (obj instanceof String))
            return null;
//        int strHashCode = obj.hashCode();
        int[] binaryArray = new int[MAX_BITS];
//        String tempBinaryStr = "0".repeat(MAX_BITS - Integer.toBinaryString(strHashCode).length()) + Integer.toBinaryString(strHashCode);
        String tempBinaryStr = proHash((String)obj);
        for(int i = 0 ; i < MAX_BITS ; i++)
            binaryArray[i] = (tempBinaryStr.charAt(i) == '1') ? 1 : 0;
        return binaryArray;
    }

    public void displayMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int anInt : ints) System.out.print(anInt + ", ");
            System.out.println();
        }
    }

    public void displayMatrix(int[] matrix){
        for (int anInt : matrix) System.out.print(anInt + ", ");
        System.out.println();
    }

    public int binaryToDecimal(int[] binary){
        int decimal = 0;
        int currentPower = 0;
        for(int i = binary.length - 1 ; i >= 0 ; i--){
            decimal += binary[i] * Math.pow(2, currentPower);
            currentPower++;
        }
        return decimal;
    }

    public <T> int hash(T obj, int[][] h, int tableSize) {
        return binaryToDecimal(matrixMultiplication(h, convertToBinArr(obj))) % tableSize;
    }

    // returns bits string of length 128
    public String proHash(String s) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Here");
            return null;
        }
        byte[] messageDigest = md.digest(s.getBytes());
        BigInteger bigInteger = new BigInteger(1, messageDigest);
        String hashCode = bigInteger.toString(2);
//        String hashCode = "";
//        String tempCharCode;
//        for(int i = 0 ; i < s.length() ; i++) {
//            tempCharCode = Integer.toBinaryString(s.charAt(i));
//            tempCharCode = ("0".repeat(8 - tempCharCode.length())).concat(tempCharCode);
//            hashCode = hashCode.concat(tempCharCode);
//        }
        if(hashCode.length() > MAX_BITS)
            hashCode = hashCode.substring(0, MAX_BITS);
        else if(hashCode.length() < MAX_BITS)
            hashCode = ("0".repeat(MAX_BITS - hashCode.length())).concat(hashCode);
        return hashCode;
    }

}
