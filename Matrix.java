package guia3;

import java.util.Arrays;

public class Matrix {
    
    private int row;
    private int column;
    private double[][] matriz;
    
    public Matrix(int rows, int columns)//Crea una matriz de rows filas y columns columas con todos los elementos inicializados a 0.
    {
        this.row = rows;
        this.column = columns;
        matriz = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matriz[i][j] = 0;
            }
        }
    }
    
    public Matrix(double[][] elements)//Crea una matriz que contiene los mismos elementos que el arreglo de arreglo de doubles. Se asume que los arreglos que componen el arreglo de arreglos elements tienen todos la misma longitud.
    {
        this.row = elements.length;
        this.column = elements[0].length;
        matriz = new double[row][column];
        for (int i = 0; i < row; i++) {
            System.arraycopy(elements[i], 0, matriz[i], 0, elements[i].length);
        }
    }
    
    public Matrix(Matrix matrix)//Crea una matriz que es una copia de la matriz que se le pasa como parámetro.
    {
        this.row = matrix.rows();
        this.column = matrix.columns();
        matriz = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matriz[i][j] = matrix.get(i, j);
            }
        }
    }    
    
    public int rows()//Devuelve la cantidad de filas de la matriz.
    {
        return row;
    }
    
    public int columns()//Devuelve la cantidad de columnas de la matriz.
    {
        return column;
    }
    
    public double get(int row, int column)//Devuelve el valor que se encuentra en la fila row y columna column de la matriz.
    {
        return matriz[row][column];
    }
    
    public void set(int row, int column, double value)//Establece el valor que se encuentra en la fila row y columna column de la matriz al valor de value.
    {
        matriz[row][column] = value;
    }
    
    //Ejercicio 13
    public boolean diagonal(Matrix a)
    {
        if (a.rows() == a.columns()) 
        {    
            for (int i = 0; i < a.rows(); i++) 
            {
                for (int j = 0; j < a.columns(); j++) 
                {
                    if (a.get(i, j) == 0) 
                    {
                        return false;
                    } 
                    else if(a.get(i, i) != 0)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //Ejercicio 14    
    public boolean identidad(Matrix a)
    {
        if (a.rows() == a.columns()) 
        {    
            for (int i = 0; i < a.rows(); i++) 
            {
                for (int j = 0; j < a.columns(); j++) 
                {
                    if (a.get(i, j) == 0) 
                    {
                        return false;
                    } 
                    else if(a.get(i, i) == 1)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    //Ejercicio 15
    public Matrix multiply(double a)
    {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                this.matriz[i][j] *= a;
            }
        }
        return this;
    }
    
    //Ejercicio 16
    public Matrix add(Matrix a)
    {
        Matrix nuevo = new Matrix(a.rows(),a.columns());
        
        if (this.row == a.rows() && this.column == a.columns()) 
        {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) 
                {
                    nuevo.matriz[i][j] = this.matriz[i][j] + a.matriz[i][j];
                }
            }
        }
        return nuevo;
    }
    
    //Ejercicio 17
    public Matrix resta(Matrix a)
    {
        Matrix nuevo = new Matrix(a.rows(),a.columns());
        
        if (this.row == a.rows() && this.column == a.columns()) 
        {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) 
                {
                    nuevo.matriz[i][j] = this.matriz[i][j] - a.matriz[i][j];
                }
            }
        }
        return nuevo;
    }    

    //Ejercicio 18
    public Matrix product(Matrix a)
    {
        Matrix nuevo = new Matrix(this.rows(),a.columns());
        
            for (int i = 0; i < a.columns(); i++) {
                for (int j = 0; j < this.row; j++) 
                {
                    nuevo.matriz[i][j] = this.matriz[i][j] * a.matriz[j][i];
                }
            }
        return nuevo;
    }    
    
    //Ejercicio 19
    public Matrix tranpuesta()
    {
        Matrix matrizT = new Matrix(this.column,this.row);
		
	for (int x = 0; x < matriz.length; x++)
	{
            for (int y = 0; y < matriz[x].length; y++)
            {
                matrizT.matriz[y][x] = matriz[x][y];
            }
	}
        return matrizT;
    }
    
    //Ejercicio 20
    public boolean simetrica()
    {
      Matrix transpuesta = this.tranpuesta();
        return Arrays.deepEquals(this.matriz, transpuesta.matriz);
    }
    
    //Ejercicio 21
    public Matrix leftRotate(Matrix a)
    {
        double valorPrevio = a.matriz[0][0];
        double valorActual;
        for (int i = a.row - 1; i >= 0; i--) {
            for (int j = a.column - 1; j >= 0; j--) {
                valorActual = a.matriz[i][j];
                a.matriz[i][j] = valorPrevio;
                valorPrevio = valorActual;
            }
        }
        Matrix nuevo = new Matrix(a.matriz);
        return nuevo;
    }
    
    //Ejercicio 22
    public Matrix rigthRotate(Matrix a)
    {
        double valorPrevio = a.matriz[a.rows() - 1][a.columns() - 1];
        double valorActual;
        for (int i = 0; i < a.rows(); i++) {
            for (int j = 0; j < a.columns(); j++) {
                valorActual = a.get(i, j);
                a.set(i, j, valorPrevio);
                valorPrevio = valorActual;
            }
        }
        Matrix nuevo = new Matrix(a.matriz);
        return nuevo;
    }
    
}
