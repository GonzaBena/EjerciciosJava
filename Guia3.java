package guia3;

import java.util.Arrays;

public class Guia3 {
  public static void main(String[] args) 
    {
        //prueba ej2
        System.out.println("Prueba EJ2");
        Vector3D a = new Vector3D(3,5,6);
        Vector3D b = new Vector3D(2,4,8);
        Vector3D c = new Vector3D();
        Vector3D resultado = a.add(b);
        
        System.out.println(resultado.getX());
        System.out.println(resultado.getY());
        System.out.println(resultado.getZ());
        System.out.println(resultado.dotProduct(b));
        System.out.println("a " + a.getX());
        System.out.println("a " + a.getY());
        System.out.println("a " + a.getZ());
        System.out.println("b " + b.getX());
        System.out.println("b " + b.getY());
        System.out.println("b " + b.getZ());
        System.out.println("c " + c.getX());
        System.out.println("c " + c.getY());
        System.out.println("c " + c.getZ());     
        
        
        //prueba ej3
        System.out.println("\n\n\n\nPrueba EJ3");
        double[] r = {0.0,1.0,2.0,3.0,4.0};
        Vector d = new Vector(r);
        Vector e = new Vector(r);
        Vector j = d.add(e);
        
        System.out.println("dc "+ d.getCoordinate(2));
        System.out.println("ec "+ e.getCoordinate(2));
        for (int i = 0; i < d.add(e).vector().length;i++) {
            System.out.println(d.add(e).getCoordinate(i));
        }
        for (int i = 0; i < e.add(e).vector().length;i++) {
            System.out.print(e.add(e).getCoordinate(i));
        }
        System.out.println("dd "+ d.dotProduct(e));
        System.out.println("ed "+ e.dotProduct(d));
        for (int i = 0; i < j.vector().length;i++) {
            System.out.println(j.getCoordinate(i));
        }
        
        
        //prueba ej4
        System.out.println("\n\n\n\nPrueba EJ4");
        Circle nuevo1 = new Circle();
        Circle nuevo2 = new Circle(2.0, 6.0, 5);
        
        System.out.println("nuevo 1 " + nuevo1.getX());
        System.out.println("nuevo 1 " + nuevo1.getY());
        System.out.println("nuevo 1 " + nuevo1.getArea());
        System.out.println("nuevo 1 " + nuevo1.getCenter().getX());
        System.out.println("nuevo 1 " + nuevo1.getCenter().getY());
        System.out.println("nuevo 1 " + nuevo1.getPerimeter());
        System.out.println("nuevo 1 " + nuevo1.getRadius());
        System.out.println("\nnuevo 2 " + nuevo2.getX());
        System.out.println("nuevo 2 " + nuevo2.getY());
        System.out.println("nuevo 2 " + nuevo2.getCenter().getX());
        System.out.println("nuevo 2 " + nuevo2.getCenter().getY());
        System.out.println("nuevo 2 " + nuevo2.getRadius());
        System.out.println("nuevo 2 " + nuevo2.getArea());
        System.out.println("nuevo 2 " + nuevo2.getPerimeter());

        System.out.println("\n\n\n\nPrueba EJ5");
        Rectangle nuevo3 = new Rectangle();
        Rectangle nuevo4 = new Rectangle(2,5,6,9);
        
        System.out.println("nuevo3 " + nuevo3.getCorner().getX());
        System.out.println("nuevo3 " + nuevo3.getCorner().getY());
        System.out.println("nuevo3 " + nuevo3.getOrigin().getX());
        System.out.println("nuevo3 " + nuevo3.getOrigin().getY());
        System.out.println("nuevo3 " + nuevo3.getArea());
        System.out.println("nuevo3 " + nuevo3.getPerimeter());

        System.out.println("\nnuevo4 " + nuevo4.getCorner().getX());
        System.out.println("nuevo4 " + nuevo4.getCorner().getY());
        System.out.println("nuevo4 " + nuevo4.getOrigin().getX());
        System.out.println("nuevo4 " + nuevo4.getOrigin().getY());
        System.out.println("nuevo4 " + nuevo4.getArea());
        System.out.println("nuevo4 " + nuevo4.getPerimeter());
        
        
        System.out.println("\n\n\n\nPrueba EJ6");
        
        Point arriba = new Point(3,5);
        Point izquierda = new Point(8,9);
        Point derecha = new Point(7,5);
        Triangle triangulo = new Triangle(arriba,izquierda,derecha);
        
        System.out.println("triangulo " + triangulo.getVertices()[0].getX());
        System.out.println("triangulo " + triangulo.getVertices()[0].getY());
        System.out.println("triangulo " + triangulo.getVertices()[1].getX());
        System.out.println("triangulo " + triangulo.getVertices()[1].getY());
        System.out.println("triangulo " + triangulo.getVertices()[2].getX());
        System.out.println("triangulo " + triangulo.getVertices()[2].getY());
        System.out.println("triangulo " + triangulo.getArea());
        System.out.println("triangulo " + triangulo.getVertex(1).getX());
        System.out.println("triangulo " + triangulo.getVertex(1).getY());
        System.out.println("triangulo " + triangulo.getPerimeter());

        System.out.println("\n\n\n\nPrueba EJ7");

        System.out.println("\n\n\n\nPrueba EJ8");

        System.out.println("\n\n\n\nPrueba EJ9");
        
        System.out.println("\n\n\n\nPrueba EJ10");
        
        System.out.println("\n\n\n\nPrueba EJ11");
        
        
        System.out.println("\n\n\n\nPrueba EJ12");
        
        double[][] doble = {{0.0,1.0,2.0},{3.0,4.0,5.0},{6.0,7.0,8.0}};
        Matrix matriz = new Matrix(3,3);
        Matrix matriz1 = new Matrix(doble);
        
        System.out.println("row " + matriz.rows());
        System.out.println("column " + matriz.columns());
        
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                matriz.set(i, k, 5);
            }
        }
        
        System.out.println("get " + matriz.get(1, 2));

        System.out.println("row " + matriz1.rows());
        System.out.println("column " + matriz1.columns());
        
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                matriz1.set(i, k, 5);
            }
        }
        
        System.out.println("get " + matriz1.get(1, 2));

        Matrix matriz2 = new Matrix(matriz);
        System.out.println("row " + matriz2.rows());
        System.out.println("column " + matriz2.columns());
        
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                matriz2.set(i, k, 10);
            }
        }
        matriz2.set(0, 2, 5);
        System.out.println("get " + matriz2.get(1, 2));
        System.out.println("get " + matriz2.get(0, 2));
        
        
        System.out.println("\n\n\n\nPrueba EJ13");

        Matrix matrizDiagonal = new Matrix(3,3); 
        
        for (int i = 0; i < matrizDiagonal.rows(); i++) {
            matrizDiagonal.set(i, i, 1);
        } 
        if(matrizDiagonal.diagonal(matrizDiagonal)) {
            System.out.println("Es diagonable");  
        }
        
        Matrix matrizNoDiagonal = new Matrix(4,3);      
        for (int i = 0; i < matrizNoDiagonal.rows(); i++) {
            for (int k = 0; k < matrizNoDiagonal.columns(); k++) {
                matrizNoDiagonal.set(i, k, 2);
            }
        }
        if(matrizNoDiagonal.diagonal(matrizNoDiagonal)) {
            System.out.println("Es diagonable");  
        }else
        {
            System.out.println("No es diagonable");
        }
        
        System.out.println("\n\n\n\nPrueba EJ14"); 
        
        Matrix matrizIdentidad = new Matrix(3,3); 
        
        for (int i = 0; i < matrizDiagonal.rows(); i++) {
            matrizDiagonal.set(i, i, 1);
        } 
        if(matrizDiagonal.diagonal(matrizDiagonal)) {
            System.out.println("Es Identidad");  
        }
        
        Matrix matrizNoIdentidad = new Matrix(4,3);      
        for (int i = 0; i < matrizNoDiagonal.rows(); i++) {
            for (int k = 0; k < matrizNoDiagonal.columns(); k++) {
                matrizNoDiagonal.set(i, k, 2);
            }
        }
        if(matrizNoDiagonal.diagonal(matrizNoDiagonal)) {
            System.out.println("Es Identidad");  
        }else
        {
            System.out.println("Es no Identidad");
        }        
        
        System.out.println("\n\n\n\nPrueba EJ15"); 
        
        Matrix matrizMultiply = new Matrix(3,3); 
        
        for (int i = 0; i < matrizMultiply.rows(); i++) {
            for (int k = 0; k < matrizMultiply.columns(); k++) {
                matrizMultiply.set(i, k, 5);
            }
        }
        matrizMultiply.multiply(2);
        System.out.println("matrizMultiply " + matrizMultiply.get(2, 1));
        System.out.println("matrizMultiply " + matrizMultiply.get(1, 0));
        
        
        System.out.println("\n\n\n\nPrueba EJ16");
        
        Matrix matrizAdd = new Matrix(3,3); 
        for (int i = 0; i < matrizAdd.rows(); i++) {
            for (int k = 0; k < matrizAdd.columns(); k++) {
                matrizAdd.set(i, k, 5);
            }
        }
        
        Matrix matrizAdd2 = new Matrix(3,3); 
        for (int i = 0; i < matrizAdd2.rows(); i++) {
            for (int k = 0; k < matrizAdd2.columns(); k++) {
                matrizAdd2.set(i, k, 2);
            }
        }
        Matrix resultado1 = matrizAdd.add(matrizAdd2);
        System.out.println("add " + resultado1.get(0, 0));
        System.out.println("add " + resultado1.get(2, 0));
        
        
        System.out.println("\n\n\n\nPrueba EJ17");
        
        Matrix matrizResta = new Matrix(3,3); 
        for (int i = 0; i < matrizResta.rows(); i++) {
            for (int k = 0; k < matrizResta.columns(); k++) {
                matrizResta.set(i, k, 5);
            }
        }
        
        Matrix matrizResta2 = new Matrix(3,3); 
        for (int i = 0; i < matrizResta2.rows(); i++) {
            for (int k = 0; k < matrizResta2.columns(); k++) {
                matrizResta2.set(i, k, 2);
            }
        }
        Matrix resultado2 = matrizResta.resta(matrizResta2);
        System.out.println("resta " + resultado2.get(0, 0));
        System.out.println("resta " + resultado2.get(1, 0));        


        System.out.println("\n\n\n\nPrueba EJ18");
        
        Matrix matrizMultiply1 = new Matrix(3,3); 
        for (int i = 0; i < matrizMultiply1.rows(); i++) {
            for (int k = 0; k < matrizMultiply1.columns(); k++) {
                matrizMultiply1.set(i, k, 5);
            }
        }
        
        Matrix matrizMultiply2 = new Matrix(3,3); 
        for (int i = 0; i < matrizMultiply2.rows(); i++) {
            for (int k = 0; k < matrizMultiply2.columns(); k++) {
                matrizMultiply2.set(i, k, 2);
            }
        }
        Matrix resultado3 = matrizMultiply1.product(matrizMultiply2);
        System.out.println("Multiplo " + resultado3.get(0, 0));
        System.out.println("Multiplo " + resultado3.get(1, 0));        
        
        
        System.out.println("\n\n\nPrueba EJ19");
        Matrix matrizT = new Matrix(3,3);
        for (int i = 0; i < matrizT.rows(); i++) 
        {
            for (int k = 0; k < matrizT.columns(); k++) 
            {
                matrizT.set(i, k, 2);
            }
        }
        matrizT.set(0, 1, 5);
        matrizT.set(1, 0, 4);
        
        System.out.println("\nMatriz No Traspuesta");	
	for(int x = 0; x < matrizT.rows(); x++)
        {
            for(int y = 0; y < matrizT.columns(); y++)
            {
		System.out.print(matrizT.get(x, y) + " ");
            }
            System.out.println();
	}
        
        matrizT = matrizT.tranpuesta();
        System.out.println("\nMatriz Traspuesta");	
	for(int x = 0; x < matrizT.columns(); x++)
        {
            for(int y = 0; y < matriz.rows(); y++)
            {
		System.out.print(matrizT.get(x, y) + " ");
            }
            System.out.println();
	}
        
        System.out.println("\n\n\nPrueba EJ20");
        if (matrizT.simetrica()) {
            System.out.println("Es simetrica");
        }else
        {
             System.out.println("No es simetrica");           
        }

        System.out.println("\n\n\nPrueba EJ21/22 original");
        
        Matrix original = new Matrix(3,3);
        original.set(0, 1, 2);
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print((int)original.get(i, k) + " ");
            }
            System.out.println("");
        }
        
        
        System.out.println("\n\n\nPrueba EJ21 izquierda");
        
        Matrix left = new Matrix(3,3);
        left.set(0, 1, 2);
        left.leftRotate(left);
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print((int)left.get(i, k) + " ");
            }
            System.out.println("");
        }
        
        
        System.out.println("\n\n\nPrueba EJ22 derecha");
        
        Matrix rigth = new Matrix(3,3);
        rigth.set(0, 1, 2);
        rigth.rigthRotate(rigth);
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print((int)rigth.get(i, k) + " ");
            }
            System.out.println("");
        }
        
        
    }
}
