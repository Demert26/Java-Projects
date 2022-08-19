package com.Revature.Entities;

public class Ticket {

    private int ticketNumber;
    private int amount;

    private String description;


    public Ticket(int ticketNumber, int amount, String description) {
        this.ticketNumber =ticketNumber;
        this.amount = amount;
        this.description = description;


    }

    public Ticket(int amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
