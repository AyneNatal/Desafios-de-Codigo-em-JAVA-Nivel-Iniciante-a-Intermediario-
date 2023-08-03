package desafios.diversos;


/*
    DESAFIO 19) Datas e Horários:

    1. Você deve criar uma programa que faça o agendamento de um Evento, recebendo um data e um horário válidos.
    2. Você deve tratar os possíveis erros de entrada de data e hora que não existem.
    3. A entrada e saída do programa deve ser parecido com:
        Data do Evento: 03/08/2023 (data recebida pelo usuario - input)
        Hora do Evento: 13:00 (hora recebida pelo usuário - input)

        output (saída):
        Evento Agendado para quinta-feira, 3 de agosto de 2023 13:00
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class Desafio19 {

    // variaveis para receber e formatar as entradas de data e hora:
    private static final Scanner scan = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATADOR_HORA = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATADOR_COMPLETO_PT_BR = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
            .withLocale(new Locale("pt", "BR"));

    //MAIN:
    public static void main(String[] args) {
        LocalDate dataEvento = agendarData("Data do Evento (xx/xx/xxxx): ");
        LocalTime horaEvento = agendarHora("Hora do Evento (xx:xx): ");

        LocalDateTime dataHoraEvento = dataEvento.atTime(horaEvento); //combina a data e hora recebidas acima.

        System.out.printf("%nEvento agendado para %s%n", dataHoraEvento.format(FORMATADOR_COMPLETO_PT_BR)); //imprime no formato data/hora Brasil
    }

    //método para agendar a data e trata-la para não receber entradas inválidas:
    private static LocalDate agendarData(String solicitacao) {
        while (true) {
            try {
                System.out.print(solicitacao);
                String data = scan.nextLine();
                return LocalDate.parse(data, FORMATADOR_DATA);

            } catch (DateTimeParseException e) {
                System.out.println("Data Inválida, por favor, tente novamente!");
            }
        }
    }

    //método para agendar a hora e trata-la para não receber entradas inválidas:
    private static LocalTime agendarHora(String solicitacao) {
        while (true) {
            try {
                System.out.print(solicitacao);
                String hora = scan.nextLine();
                return LocalTime.parse(hora, FORMATADOR_HORA);

            } catch (DateTimeParseException e) {
                System.out.println("Hora Inválida, por favor, tente novamente!");
            }
        }
    }
}

/*
teste de saída (output):

 Data do Evento (xx/xx/xxxx): 16/08/2023
 Hora do Evento (xx:xx): 14:00

 Evento agendado para quarta-feira, 16 de agosto de 2023 14:00
*/

