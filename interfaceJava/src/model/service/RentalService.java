package model.service;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private final TaxServive TaxService;
    private double pricePerHour;
    private double pricePerDay;
    
    private TaxServive taxServive;

    public RentalService(double pricePerHour, double pricePerDay, TaxServive texService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.TaxService = taxServive;
    }

    public void processingInvoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;
        double basicPayment;

        if (hours <= 12.0){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        carRental.setInvoice(new Invoice(50.0,10.0));
    }
}
