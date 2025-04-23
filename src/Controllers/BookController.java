package Controllers;

import models.Book;

public class BookController {


    // Método para ordenar libros por nombre en orden descendente
    public void sortByName(Book[] libros) {
        int n = libros.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if ((libros[j].getNombre().compareTo(libros[j + 1].getNombre()))>0 ) {
                    String aux = libros[j].getNombre() ;
                    libros[j].setNombre(libros[j + 1].getNombre());
                    libros[j + 1].setNombre(aux);
                }
                
            }
        }

    }

    // Método para buscar un libro por nombre, ignorando mayúsculas y minúsculas
    public Book searchByName(Book[] libros, String nombre) {
        int bajo=0;
        int alto=libros.length -1;

        while (bajo<= alto) {
            int central= bajo+(alto-bajo)/2;
            
            if(libros[central].getNombre().equals(nombre)){
                return libros[central];
            }
            if ((libros[central].getNombre().compareTo(nombre)<0)){
                bajo=central+1;
            }else{
                alto=central-1;
            }
        }
        return null;
    }

}
