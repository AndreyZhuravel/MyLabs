package com.andreyhome;

/*
Create a Matrix class that contains the methods of addition and multiplication of matrices (work with two-dimensional arrays);
 */


class Matrix{
    private int _x;
    private int _y;
    private int[][] _array;

    public Matrix(int x, int y)

    {
        _array = new int[x][y];
    }

    public Matrix(int x, int y, int[][] array)
    {
        _array = new int[x][y];

        for(int i=0; i < x; i++)
        {
            for(int j=0; j < y; j++)
            {
                _array[i][j] = array[i][j];
            }
        }
    }

    public int[][] GetArray()
    {
        return _array;
    }

    public void SetArray(int[][] array)
    {
        _array = array;
    }
}

class Creator
{

    public Matrix GetNewMatrix(int x, int y)
    {
        return new Matrix(x, y);
    }

    public Matrix GetNewMatrix(int x, int y, int[][] array)
    {
        return new Matrix(x, y, array);
    }

    public void PrintMatrix(Matrix matrix)
    {
        int[][] mas  = matrix.GetArray();
        for(int i=0; i < mas[0].length; i++)
        {
            for(int j=0; j < mas[1].length; j++)
            {
                System.out.print(mas[i][j]+" ");
            }
        }
        System.out.println("\n--------------------");
    }

    public Matrix SumOfMatrix(Matrix matrixA, Matrix matrixB)
    {
        int[][] masA  = matrixA.GetArray();
        int[][] masB  = matrixB.GetArray();

        int xmasA = masA[0].length;
        int ymasA = masA[1].length;

        int xmasB = masB[0].length;
        int ymasB = masB[1].length;

        if (xmasA != xmasB || ymasA != ymasB)
        {
            System.out.print("Soft can't plus diferent dimension");
            return null;
        }


        int[][] newArray = new int[xmasA][ymasA];

        for(int i=0; i < masA[0].length; i++)
        {
            for(int j=0; j < masA[1].length; j++)
            {
                newArray[i][j] = masA[i][j] + masB[i][j];
            }
        }

        Matrix result = this.GetNewMatrix(xmasA, ymasA);
        result.SetArray(newArray);

        return result;
    }

    public Matrix MultiOfMatrix(Matrix matrixA, Matrix matrixB)
    {
        int[][] masA  = matrixA.GetArray();
        int[][] masB  = matrixB.GetArray();

        int xmasA = masA[0].length;
        int ymasA = masA[1].length;

        int xmasB = masB[0].length;
        int ymasB = masB[1].length;

        if (xmasA != xmasB || ymasA != ymasB)
        {
            System.out.print("Soft can't plus diferent dimension");
            return null;
        }


        int[][] newArray = new int[xmasA][ymasA];

        for(int i=0; i < masA[0].length; i++)
        {
            for(int j=0; j < masA[1].length; j++)
            {
                newArray[i][j] = masA[i][j] * masB[i][j];
            }
        }

        Matrix result = this.GetNewMatrix(xmasA, ymasA);
        result.SetArray(newArray);

        return result;
    }
}

public class Main {

    public static void main(String[] args) {

        Creator _ctor = new Creator();

        Matrix myFirstMatrix = _ctor.GetNewMatrix(2,2,new int[][]{{1,2},{3,4}});
        Matrix mySecondMatrix = _ctor.GetNewMatrix(2,2,new int[][]{{1,2},{3,4}});

        _ctor.PrintMatrix(myFirstMatrix);
        _ctor.PrintMatrix(mySecondMatrix);

        System.out.println("Sum matrix:");
        Matrix myThirdMatrix = _ctor.SumOfMatrix(myFirstMatrix, mySecondMatrix);
        _ctor.PrintMatrix(myThirdMatrix);

        System.out.println("Multiply matrix:");
        Matrix myFourthMatrix = _ctor.MultiOfMatrix(myFirstMatrix, mySecondMatrix);
        _ctor.PrintMatrix(myFourthMatrix);

    }
}
