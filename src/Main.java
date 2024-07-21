/*
 * PRESENTACIÓN DEL TRABAJO Unidad 1: Tarea (12%) - POO
 * Trabajo realizado por: Edwin Leonardo Alzate Avendaño
 * Asignatura: Lenguaje de Programación Avanzado 1 - 2407B04G1G2
 * Docente: Nixon Duarte Acosta.
 * Fecha entrega: 21/07/2024
 */

import java.util.Scanner;

public class Main {

    //Funcion menu principal App.
    public static int menuApp() {
        Scanner entradaDatos = new Scanner(System.in);
        int respuestaMenu;
        System.out.println("- Seleccione el tipo de vehículo:");
        System.out.println("1. Coches");
        System.out.println("2. Microbuses");
        System.out.println("3. Furgonetas de carga");
        System.out.println("4. Camiones");
        System.out.println("5. Salir");
        System.out.print("-> ");
        respuestaMenu = entradaDatos.nextInt();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        return respuestaMenu;
    }

    //Funcion salida App (Despedida).
    public static void salidaApp() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                                 ¡MUCHAS GRACIAS POR PREFERIRNOS!                                 +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }

    //Funcion para validar salida desde el menu.
    public static boolean validadorSalida() {
        Scanner entradaDatos = new Scanner(System.in);
        boolean respuestaValidador = true;
        System.out.println("");
        System.out.println("¿Desea volver al menú principal?");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.print("-> ");
        int respuestaUsuario = entradaDatos.nextInt();

        if (respuestaUsuario == 1) {
            respuestaValidador = true;

        } else {
            respuestaValidador = false;
            salidaApp();
        }
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        return respuestaValidador;
    }

    public static void main(String[] args) {

        //Declaracion de variables del programa.
        int tipoVehiculo;
        int diasAlquiler;
        double precioBase = 50;
        double precioAlquiler;
        double valorExtra;
        double pmaFurgoneta;
        String matriculaVehiculo;
        boolean banderaMenu = true;

        //Declaracion e inicializacion de arreglos.
        String[] cochesDisponibles = new String[3];
        cochesDisponibles[0] = "1. Renault Onix - Matricula: ABC123";
        cochesDisponibles[1] = "2. Renault Logan - Matricula: ABC456";
        cochesDisponibles[2] = "3. Renault Sandero - Matricula: ABC789";

        String[] microbusesDisponibles = new String[3];
        microbusesDisponibles[0] = "1. Nissan Civilian - Matricula: DEF123";
        microbusesDisponibles[1] = "2. Nissan Urvan - Matricula: DEF456";
        microbusesDisponibles[2] = "3. Nissan TK - Matricula: DEF789";

        String[] furgonetasDisponibles = new String[3];
        furgonetasDisponibles[0] = "1. Volkswagen Caddy - Matricula: GHI123";
        furgonetasDisponibles[1] = "2. Volkswagen Crafter - Matricula: GHI456";
        furgonetasDisponibles[2] = "3. Volkswagen Camper - Matricula: GHI789";

        String[] camionesDisponibles = new String[3];
        camionesDisponibles[0] = "1. Kenworth T380 - Matricula: JKL123";
        camionesDisponibles[1] = "2. Kenworth T680 - Matricula: JKL456";
        camionesDisponibles[2] = "3. Kenworth T880 - Matricula: JKL789";

        //Instanciacion de la clase Scanner para capturar datos por teclado.
        Scanner entradaDatos = new Scanner(System.in);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                                           ¡BIENVENIDO!                                           +");
        System.out.println("+                                 ¡SISTEMA DE ALQUILER DE VEHICULOS!                               +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Ciclo encargado de mostrar el menu.
        while (banderaMenu == true) {

            tipoVehiculo = menuApp();

            //Switch que controla el menu de la App.
            switch (tipoVehiculo) {
                case 1:
                    System.out.println("- Estos son los coches disponibles:");
                    for (int i = 0; i < cochesDisponibles.length; i++) {
                        System.out.println(cochesDisponibles[i]);
                    }
                    System.out.print("- Digite la matricula: ");
                    matriculaVehiculo = entradaDatos.next();
                    System.out.print("- Digite la cantidad de días: ");
                    diasAlquiler = entradaDatos.nextInt();
                    valorExtra = (diasAlquiler * 1.5);
                    precioAlquiler = (precioBase * diasAlquiler + valorExtra);
                    System.out.println("- Precio total de alquiler por " + diasAlquiler + " dias es " + precioAlquiler + " COP - Matricula " + matriculaVehiculo);
                    banderaMenu = validadorSalida();
                    break;
                case 2:
                    System.out.println("- Estos son los microbuses disponibles:");
                    for (int i = 0; i < microbusesDisponibles.length; i++) {
                        System.out.println(microbusesDisponibles[i]);
                    }
                    System.out.print("- Digite la matricula: ");
                    matriculaVehiculo = entradaDatos.next();
                    System.out.print("- Digite la cantidad de días: ");
                    diasAlquiler = entradaDatos.nextInt();
                    precioBase = (precioBase * 2);
                    valorExtra = (1.5 * 2);
                    precioAlquiler = (precioBase + valorExtra + 2);
                    System.out.println("- Precio total de alquiler por " + diasAlquiler + " dias es " + precioAlquiler + " COP - Matricula " + matriculaVehiculo);
                    banderaMenu = validadorSalida();
                    break;
                case 3:
                    System.out.println("- Estas son las furgonetas de carga disponibles:");
                    for (int i = 0; i < furgonetasDisponibles.length; i++) {
                        System.out.println(furgonetasDisponibles[i]);
                    }
                    System.out.print("- Digite la matricula: ");
                    matriculaVehiculo = entradaDatos.next();
                    System.out.print("- Digite el PMA (Peso maximo autorizado en toneladas): ");
                    pmaFurgoneta = entradaDatos.nextDouble();
                    System.out.print("- Digite la cantidad de días: ");
                    diasAlquiler = entradaDatos.nextInt();
                    precioBase = (precioBase * diasAlquiler);
                    valorExtra = (20 * pmaFurgoneta);
                    precioAlquiler = (precioBase + valorExtra);
                    System.out.println("- Precio total de alquiler por " + diasAlquiler + " dias con un PMA de " + pmaFurgoneta + " toneladas es " + precioAlquiler + " COP - Matricula " + matriculaVehiculo);
                    banderaMenu = validadorSalida();
                    break;
                case 4:
                    System.out.println("- Estos son los camiones disponibles:");
                    for (int i = 0; i < camionesDisponibles.length; i++) {
                        System.out.println(camionesDisponibles[i]);
                    }
                    System.out.print("- Digite la matricula: ");
                    matriculaVehiculo = entradaDatos.next();
                    System.out.print("- Digite la cantidad de días: ");
                    diasAlquiler = entradaDatos.nextInt();
                    valorExtra = 40;
                    precioAlquiler = ((precioBase * diasAlquiler) + valorExtra);
                    System.out.println("- Precio total de alquiler por " + diasAlquiler + " dias es " + precioAlquiler + " COP - Matricula " + matriculaVehiculo);
                    banderaMenu = validadorSalida();
                    break;
                case 5:
                    salidaApp();
                default:
                    System.out.println("Opción incorrecta, ingrese de nuevo.");
                    banderaMenu = false;
            }

        }

    }

}