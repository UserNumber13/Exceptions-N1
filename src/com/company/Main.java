package com.company;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputException {
        exceptoinsFind();
    }
           static void enterLoginAndPass() throws InputException {

            Scanner in=new Scanner(System.in);
            while (true) {
                System.out.println("Введите логин: "); //Должен включать больше 3 но меньше 9 символов
                String login=in.nextLine();
                char[] loginChar=login.toCharArray();
                if ((loginChar.length<3)||(loginChar.length>9)) {
                    throw new InputException("Количество введенных символов должно быть больше 3 и меньше 9");
                }
                System.out.println("Введите пароль : "); //должен состоять только из цифр
                String pass1 = in.nextLine();
                System.out.println("Введите подтверждение пароля: ");
                String pass2=in.nextLine();

                   int p1=Integer.parseInt(pass1);
                   int p2=Integer.parseInt(pass2);
                                   if (p1!=p2){
                        throw new InputException("Не верное подтверждение пароля");
                }
            }
        }
        static void exceptoinsFind() throws InputException {
        try {
            enterLoginAndPass();
        }
        catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println("Пароль должен состоять только из цифр");
        }
        }
    }
