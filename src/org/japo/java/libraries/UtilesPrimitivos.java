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
package org.japo.java.libraries;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public class UtilesPrimitivos {

    public static final int analizarRango(int num, int max, int min) {
        int result = 0;

        if (num >= min && num <= max) {
            result = 0;
        } else if (num <= min && num != min) {
            result = 1;
        } else if (num >= max && num != max) {
            result = 2;
        }
        return result;
    }
}

