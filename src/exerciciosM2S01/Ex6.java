package exerciciosM2S01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Ex6 {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a sua data de nascimento: ");
        Date dataNasc = dateFormat.parse(teclado.next());
        teclado.close();

        //System.out.println(dateFormat.format(dataNasc));
        //System.out.println(getIdade(dataNasc));
        int idade = getIdade(dataNasc);

        if (idade >=16 && idade <= 17 ) {
            System.out.println("Voto opcional");
        } else if (idade >=18 && idade <= 59){
            System.out.println("Voto é obrigatório");
        } else if (idade < 16){
        System.out.println("Voto é proibido");
        }
    }

    public static int getIdade(java.util.Date dataNasc) {
        Calendar dateOfBirth = new GregorianCalendar();
        dateOfBirth.setTime(dataNasc);

        // Cria um objeto calendar com a data atual
        Calendar today = Calendar.getInstance();

        // Obtém a idade baseado no ano
        int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        dateOfBirth.add(Calendar.YEAR, age);

        // se a data de hoje é antes da data de Nascimento, então diminui 1.
        if (today.before(dateOfBirth)) {
            age--;
        }

        return age;
    }
}
