package Views;

import models.Book;

public class ViewConsole {

    public void imprimirMensajes(String mensaje){
        System.out.println(mensaje);
    }

    public void imprimiArreglo(Book[] libros){
        for (Book book : libros) {
            System.out.print(book+" || ");
        }
    }
}
