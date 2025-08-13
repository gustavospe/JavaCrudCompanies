package com.companies;

import com.companies.model.Company;
import com.companies.service.CompanyManager;
import java.util.Scanner;

public class Main {
    private static CompanyManager manager = new CompanyManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Crud Companies Java ===");

        addSampleData();

        int option;
        do {
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    createCompany();
                    break;
                case 2:
                    readCompany();
                    break;
                case 3:
                    manager.displayAllCompanies();
                    break;
                case 4:
                    updateCompany();
                    break;
                case 5:
                    deleteCompany();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 0);

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1. Criar Empresa");
        System.out.println("2. Buscar Empresa");
        System.out.println("3. Listar Todas");
        System.out.println("4. Atualizar Empresa");
        System.out.println("5. Deletar Empresa");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void createCompany() {
        System.out.println("\n=== CRIAR EMPRESA ===");

        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Endereço: ");
        String address = scanner.nextLine();

        Company company = new Company(name, cnpj, address);
        manager.create(company);
    }

    private static void readCompany() {
        System.out.print("\nDigite o CNPJ: ");
        String cnpj = scanner.nextLine();

        Company company = manager.read(cnpj);
        if (company != null) {
            company.displayInfo();
        } else {
            System.out.println("Empresa não encontrada!");
        }
    }

    private static void updateCompany() {
        System.out.print("\nDigite o CNPJ da empresa a ser atualizada: ");
        String cnpj = scanner.nextLine();

        Company existing = manager.read(cnpj);
        if (existing == null) {
            System.out.println("Empresa não encontrada!");
            return;
        }

        System.out.println("Empresa encontrada:");
        existing.displayInfo();

        // atualização das informações básicas do bgl
        System.out.print("Novo nome (atual: " + existing.getName() + "): ");
        String newName = scanner.nextLine();
        System.out.print("Novo endereço (atual: " + existing.getAddress() + "): ");
        String newAddress = scanner.nextLine();

        existing.setName(newName.isEmpty() ? existing.getName() : newName);
        existing.setAddress(newAddress.isEmpty() ? existing.getAddress() : newAddress);

        manager.update(cnpj, existing);
    }

    private static void deleteCompany() {
        System.out.print("\nDigite o CNPJ da empresa a ser deletada: ");
        String cnpj = scanner.nextLine();
        manager.delete(cnpj);
    }

    // inserir dados de exemplo
    private static void addSampleData() {
        // Adiciona empresas de exemplo para demonstrar o sistema
        manager.create(new Company("Proway Ltda", "12.345.678/0001-90",
                "Rua aki mano, 123"));
        manager.create(new Company("BluSoft Ltda", "11.222.333/0001-44",
                "Av. ali do outro lado, 456"));
        manager.create(new Company("Boobie Goods LTDA", "10.222.333/0001-55",
                "Rua lá oh, 888"));
    }
}
