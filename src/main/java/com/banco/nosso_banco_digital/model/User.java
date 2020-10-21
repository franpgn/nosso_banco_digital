package com.banco.nosso_banco_digital.model;

import java.util.InputMismatchException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String surname;

    @Email
    private String email;

    private String date;

    private String cpf;

    //Getters e Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public boolean validateCpf(String isCpf) {

        if (isCpf.equals("00000000000") ||
            isCpf.equals("11111111111") ||
            isCpf.equals("22222222222") || isCpf.equals("33333333333") ||
            isCpf.equals("44444444444") || isCpf.equals("55555555555") ||
            isCpf.equals("66666666666") || isCpf.equals("77777777777") ||
            isCpf.equals("88888888888") || isCpf.equals("99999999999") ||
            (isCpf.length() != 11)){
            return (false);
        }

        char divider10, divider11;
        int plus, i, rest, number, multiply;

        try {
            plus = 0;
            multiply = 10;
            for (i=0; i<9; i++) {
                number = (int)(isCpf.charAt(i) - 48);
                plus = plus + (number * multiply);
                multiply = multiply - 1;
            }

            rest = 11 - (plus % 11);
            if ((rest == 10) || (rest == 11))
                divider10 = '0';
            else divider10 = (char)(rest + 48);

            plus = 0;
            multiply = 11;
            for(i=0; i<10; i++) {
                number = (int)(isCpf.charAt(i) - 48);
                plus = plus + (number * multiply);
                multiply = multiply - 1;
            }
            rest = 11 - (plus % 11);

            if ((rest == 10) || (rest == 11))
                divider11 = '0';
            else divider11 = (char)(rest + 48);

            if ((divider10 == isCpf.charAt(9)) && (divider11 == isCpf.charAt(10)))
                return(true);
            else return(false);

        }catch (InputMismatchException erro) {
            return(false);
        }
    }
    
    public boolean validateEmail(String isEmail) {

        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return isEmail.matches(regex);
    }

    

    @Override
    public String toString() {
        return "User [cpf=" + cpf + ", date=" + date + ", email=" 
        + email + ", name=" + name + ", surname=" + surname+ "]";
    }

}
