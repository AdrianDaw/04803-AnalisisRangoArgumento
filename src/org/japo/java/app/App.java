/*
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Random;
import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public final class App {

    public static final int RANGE_IN = 0; // Dentro de Rango
    public static final int RANGE_BELOW = 1; // Debajo de Rango
    public static final int RANGE_ABOVE = 2; // Encima de Rango
    
    //Random
    private static final Random RND = new Random();

    //Random range
    public static final int MAX = 10;
    public static final int MIN = 0;
    public static final int MIN_R = -5;
    public static final int MAX_R = 15;

    //Datos
    public static final int NUM;

    static {
        NUM = RND.nextInt(MAX_R - MIN_R + 1) + MIN_R; // [MIN .. MAX]
    }

    public final void launchApp() {
        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");
        System.out.printf("Número ......: %d%n", NUM);
        System.out.println("---");
        System.out.println("Mínimo ......: " + MIN);
        System.out.println("Máximo ......: " + MAX);
        System.out.println("---");
        int informar = UtilesPrimitivos.analizarRango(NUM, MAX, MIN);
        System.out.print("Análisis ....: ");
        switch (informar) {
            case 0:
                System.out.printf("DENTRO%n");
                break;
            case 1:
                System.out.println("FUERA ( Abajo )");
                break;
            case 2:
                System.out.println("FUERA ( Arriba )");
                break;
        }
    }
}
