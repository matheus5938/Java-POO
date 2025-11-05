package model.service;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

    private double pricePerHour;
    private double pricePerDay;
    private BrazilTaxService brazilTaxService;

    public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
    }

    public void processingInvoice(CarRental carRental) {
        carRental.setInvoice(new Invoice());
    }
}
