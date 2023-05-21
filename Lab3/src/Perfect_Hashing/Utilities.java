package Perfect_Hashing;

public class Utilities {

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

    public <T> int[] convertToBinArr(T obj){
        int strHashCode = obj.hashCode();
        int[] binaryArray = new int[32];
        String tempBinaryStr = "0".repeat(32 - Integer.toBinaryString(strHashCode).length()) + Integer.toBinaryString(strHashCode);
        for(int i = 0 ; i < 32 ; i++)
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

}
