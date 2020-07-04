package src.CombinatorialOptimization;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
int [] array = new int[]{30,35,15,5,10,20,25};
int matrixNumber = 6; 
  int multiplicationCost =  matrixCalculation(array,1,matrixNumber);
        System.out.println("Total cost for matrix multiplication is : "+multiplicationCost);

    }
    public static int matrixCalculation(int[] array, int i, int j){
      if(i==j){
          return  0;
      }
      int k;
        int min=555555555;
      for(k=i;k<j;k++){

          int count = matrixCalculation(array,i,k)+matrixCalculation(array,k+1,j)+(array[i-1]*array[k]*array[j]);
          min = Math.min(count,min);
      }

        return  min;
    }
}
