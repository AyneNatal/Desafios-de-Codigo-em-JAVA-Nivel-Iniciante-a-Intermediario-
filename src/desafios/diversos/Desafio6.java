package desafios.diversos;

/*

DESAFIO 6) Treinando o uso da Interface Map:
Dada a população de algumas cidades do interior do Estado do Espírito Santo:
    - Santa Tereza (23.590 habitantes);
    - Mimoso do Sul (26.153 habitantes);
    - Ibatiba (26.082 habitantes);
    - Pancas (23.184 habitantes);
    - Vargem Alta (21.402 habitantes).

Faça:
    1. Mapeie a lista acima e suas populações;
    2. Confira se a cidade Boa Esperança está no seu mapeamento e se não estiver adicione-a com a população de 15.037 habitantes;
    3. Exiba a cidade com a maior população e sua quantidade;
    4. Exiba a soma de todos os habitantes;
    5. Remova as cidades com a população menor que 25.000 habitantes.

*/

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Desafio6 {
    public static void main(String[] args) {
        //1.
        Map<String, Integer> habitantesPorCidadesDoES = new HashMap<>(){
            {
                put("Santa Tereza", 23590);
                put("Mimoso do Sul", 26153);
                put("Ibatiba", 26082);
                put("Pancas", 23184);
                put("Vargem Alta", 21402);
            }
        };
        System.out.println("1." + habitantesPorCidadesDoES);

        //2.
        System.out.println("2. Existe Boa Esperança no map? " + habitantesPorCidadesDoES.containsKey("Boa Esperança"));
        habitantesPorCidadesDoES.put("Boa Esperança", 15037);
        System.out.println("Acrescentado Boa Esperança:\n" + habitantesPorCidadesDoES);

        //3 e 4.
        int popMax = Collections.max(habitantesPorCidadesDoES.values());
        int somaDosHabitantes = 0;
        for (Map.Entry<String, Integer> cidade : habitantesPorCidadesDoES.entrySet()) {
            if (cidade.getValue().equals(popMax)) {
                System.out.printf("3. Cidade com maior população: %s com %d habitantes%n", cidade.getKey(), popMax);
            }

            somaDosHabitantes += cidade.getValue();
        }
        System.out.println("4. Soma dos habitantes: " + somaDosHabitantes);

        //5.
        habitantesPorCidadesDoES.values().removeIf(pop -> pop < 25000);
        System.out.println("5. Cidades com pop acima dos 25k: " + habitantesPorCidadesDoES);

    }
}
