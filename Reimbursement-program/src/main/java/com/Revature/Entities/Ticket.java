package com.Revature.Entities;

public class Ticket {

    private int ticketNumber;
    private int amount;

    private String description;

    private String status;


    public Ticket(int ticketNumber, int amount, String description, String status) {
        this.ticketNumber =ticketNumber;
        this.amount = amount;
        this.description = description;
        this.status = status;
    }

    public Ticket(int amount, String description, String status) {
        this.amount = amount;
        this.description = description;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
