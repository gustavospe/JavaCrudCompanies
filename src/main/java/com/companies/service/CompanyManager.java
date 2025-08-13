package com.companies.service;

import com.companies.model.Company;
import java.util.ArrayList;
import java.util.List;

public class CompanyManager {
    private List<Company> companies;
    
    public CompanyManager() {
        this.companies = new ArrayList<>();
    }
    
    public void create(Company company) {
        if (company != null && !cnpjExists(company.getCnpj())) {
            companies.add(company);
            System.out.println("Empresa criada com sucesso!");
        } else {
            System.out.println("empresa inválida");
        }
    }
    
    public Company read(String cnpj) {
        for (Company company : companies) {
            if (company.getCnpj().equals(cnpj)) {
                return company;
            }
        }
        return null;
    }
    
    public List<Company> readAll() {
        return new ArrayList<>(companies);
    }
    
    public boolean update(String cnpj, Company updatedCompany) {
        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getCnpj().equals(cnpj)) {
                companies.set(i, updatedCompany);
                System.out.println("Empresa atualizad com sucesso!");
                return true;
            }
        }
        System.out.println("Empresa não encontrada!");
        return false;
    }
    
    public boolean delete(String cnpj) {
        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getCnpj().equals(cnpj)) {
                companies.remove(i);
                System.out.println("Empresa removida com sucesso!");
                return true;
            }
        }
        System.out.println("Empresa não encontrada!");
        return false;
    }




    // teste de polimorfismo
    public void displayAllCompanies() {
        if (companies.isEmpty()) {
            System.out.println("Nenhuma empresa cadastrada.");
            return;
        }
        
        System.out.println("\n=== TODAS AS EMPRESAS ===");
        System.out.println("");
        for (Company company : companies) {
            company.displayInfo();
            System.out.println();
        }
    }

    private boolean cnpjExists(String cnpj) {
        for (Company company : companies) {
            if (company.getCnpj().equals(cnpj)) {
                return true;
            }
        }
        return false;
    }

    public int count() {
        return companies.size();
    }
}
