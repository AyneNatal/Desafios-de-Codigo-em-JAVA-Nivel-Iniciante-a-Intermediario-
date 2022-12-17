package desafios.codewars;

/*
DESAFIO CODEWARS -> Correct the time-string | 7 Kyu
Link para o site -> https://www.codewars.com/kata/57873ab5e55533a2890000c7/train/java
*/

import java.time.LocalTime;
import java.util.Date;

public class Codewars21 {
    //TESTES:
    public static void main(String[] args) {
        System.out.println("11:70:10 = " + timeCorrect("11:70:10"));
        System.out.println("19:99:99 = " + timeCorrect("19:99:99"));
    }

    //RESOLVENDO:
    public static String timeCorrect(String timestring) {
        if (timestring == null || !timestring.matches("^\\d{2}:\\d{2}:\\d{2}$")) {
            return null;
        }
        String[] split = timestring.split(":");
        int hours = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);
        int seconds = Integer.parseInt(split[2]);
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        minutes = minutes % 60;
        hours = hours % 24;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }
}

/*
OBS:
O método matches especifica uma expressão regular e localiza o conteúdo do objeto String em que seja aplicada
essa expressão. Para saber se essa correspondência foi atendida ou não, é retornado um valor booleano (true ou false).

<<FONTE: devmedia>>
*/
