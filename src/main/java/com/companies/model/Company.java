package com.companies.model;

public class Company {
    //encapsulamento
    private String name;
    private String cnpj;
    private String address;

    public Company(String name, String cnpj, String address) {
        this.name = name;
        this.cnpj = cnpj;
        this.address = address;
    }

    // encapsulamento
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //exibir informações
    public void displayInfo() {
        System.out.println(getBasicInfo());
    }

    //  informações da empresa
    public String getBasicInfo() {
        return "Empresa: " + name + " | CNPJ: " + cnpj + " | Endereço: " + address;
    }
}
