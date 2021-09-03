package com.todolist.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ToDoListApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ToDoListApplication.class, args);

        Scanner usuario = new Scanner(System.in);

        String nuevaTarea;
        String pregunta;
        String fPregunta;
        int eleccion = 0;
        String lista[] = new String[6];

        do {
            System.out.println("¸.·'★¸.·'★*·~-.¸-(★ To Do List ★)-,.-~*¸.·'★¸.·'★\n");

            System.out.println("1. Añadir una nueva tarea a la lista.");
            System.out.println("2. Imprimir la lista.");
            System.out.println("3. Eliminar toda la lista.");
            System.out.println("4. Salir del programa.\n");

            System.out.println("Seleecione una opción: ");
            eleccion = usuario.nextInt();

            switch (eleccion)
            {
                case 1:
                    System.out.println("Ha elegido la opción número 1, si quiere parar escriba 'parar'.");
                    System.out.println("Escriba una nueva tarea:\n");

                    for (int i = 0; i <= lista.length-1; i++)
                    {
                        nuevaTarea = usuario.nextLine();

                        if (!nuevaTarea.isEmpty())
                        {
                            if (nuevaTarea.equals("parar"))
                            {
                                break;
                            }
                            lista[i] = nuevaTarea;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Ha seleccionado la opción 2.");

                    for (int j = 0; j <= lista.length-1; j++)
                    {
                        System.out.println(lista[j]);
                    }
                    break;

                case 3:
                    System.out.println("Ha seleccionado la opción 3.");
                    System.out.println("Se borrará toda la lista. ¿Desea continuar? S/N");

                    pregunta = usuario.nextLine();
                    fPregunta = pregunta.toUpperCase(Locale.ROOT);

                    if ( (fPregunta.equals("S")) && (lista.length!=0) )
                    {
                        System.out.println("Ha seleccionado S, la lista de tareas se borrará.");

                        for (int k = 0; k <= lista.length-1; k++)
                        {
                            lista[k] = "";
                        }
                    }
                break;

                default:
                    System.out.println("Ha salido del programa.");
                    break;
            }

        }while ( (eleccion > 0) && (eleccion < 4) ) ;
    }
}
