/* 
 * Copyright 2019 Alejandro Alberca - alejandro.alberca.alum@iescamp.es.
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
package distanciahoraconsola;
import java.util.*;
/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */
public class Main {
public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");
    public static void main(String[] args) {
    System.out.print("Hora inicio ......: ");
            int hora = SCN.nextInt();
    System.out.print("Minuto inicio ....: ");
            int minuto = SCN.nextInt();
    System.out.print("Segundo inicio ...: ");
            int segundo = SCN.nextInt();
        Calendar cal = Calendar.getInstance();
            int h = cal.get(Calendar.HOUR_OF_DAY);
            int m = cal.get(Calendar.MINUTE);
            int s = cal.get(Calendar.SECOND);
    System.out.printf("Hora actual ......: %02d:%02d:%d",h ,m ,s );
    System.out.printf("%nHora de inicio ......: %02d:%02d:%d%n",hora ,minuto ,segundo);
            int hora_total = h-hora;
            int minuto_total = m-minuto;
            int segundo_total = s-segundo;
    System.out.printf("Tiempo de Clase ..: %02d:%02d:%d%n",hora_total,minuto_total,segundo_total);
    }
}
