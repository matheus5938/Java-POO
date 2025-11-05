
import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.BrazilTaxService;
import model.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        //Formato da data e hora
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");

        System.out.print("Modelo do carro: ");
        String carModel = ent.nextLine();

        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(ent.nextLine(), fmt);

        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(ent.nextLine(), fmt);

        CarRental car = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = ent.nextDouble();

        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = ent.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processingInvoice(car);

        System.out.println("FATURA");
        System.out.println("Pagamento basico: " + car.getInvoice().getBasicPayment());
        System.out.println("Impostos: " + car.getInvoice().getTax());
        System.out.println("Pagamento Total: " + car.getInvoice().getTotalPayment());

        ent.close();
    }
}