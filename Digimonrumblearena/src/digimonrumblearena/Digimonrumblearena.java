/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digimonrumblearena;

import java.util.Scanner;

/**
 *
 * @author Asep Solahudin
 */
public class Digimonrumblearena {
public static String nama,nd,EL,TD,Time,WU;
public static int E,HP=100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("==========Selamat datang di dunia digital monster============");
        System.out.print("Perkenalkan nama anda trainer = ");
        nama=a.nextLine();
        do{
        System.out.println("Halo trainer "+nama+" kami memiliki banyak daster yang lucu");
        System.out.println("1.Api");
        System.out.println("2.Air");
        System.out.println("3.Tumbuhan");
        System.out.println("Daftarkan Daster Favoritmu");
        System.out.print("Nama      = ");
        nd=a.nextLine();
        System.out.print("Elemen    = ");
        EL=a.nextLine();
        switch(EL){
            case "Api":
                System.out.println("Hai!! Aku "+nd+" Aku suka Api. Ayo bermain denganku");
                break;
            case "Air":
                System.out.println("Hai!! Aku "+nd+" Aku suka Air. Ayo bermain denganku");
                break;
            case "Tumbuhan":
                System.out.println("Hai!! Aku "+nd+" Aku suka Tumbuhan. Ayo bermain denganku");
                break;
            default:
                    break;
        }
        }while(!"Api".equals(EL)&& !"Air".equals(EL)&&!"Tumbuhan".equals(EL));
        System.out.println("=========================================");
        System.out.println("Ini adalah hal yang bisa kulakukan");
        System.out.println("1.Play(bermainlah bersama ku)");
        System.out.println("2.Eat(Aku sangat menyukainya)");
        System.out.println("3.Afraid(iih ini menakutkan kuharap kau tidak memilihnya)");
        System.out.println("4.Status(Kau bisa melihat poinku )");
        System.out.println("5.Exit(Kau Berpisah denganku tuan)");
        do{
        TD=a.nextLine();
        switch(TD){
            case "Play":
                HP=HP-50;
                if("Api".equals(EL)){
                    System.out.println(" ");
                    System.out.println("ibu " + nd +" : Hati hati main api.Nanti Daster lain terluka" );
                }
                else if("Air".equals(EL)){
                    System.out.println(" ");
                    System.out.println("ibu " + nd +" : Hati hati main air.Nanti rumah tetangga banjir");
                }
                else if("Tumbuhan".equals(EL)){
                    System.out.println(" ");
                    System.out.println("ibu " + nd +" : Hati hati main dengan tumbuhan.jangan sampai melukai mereka");
                }
                break;
            case "Eat":
                HP=HP+70;
                do{
                    System.out.println(" ");
                    System.out.print("Waktu Saat ini : ");
                    Time=a.nextLine();
                    if("Pagi".equals(Time)){
                        System.out.println("Ibu aku ingin pakai Telur dadar pakai macaroni");
                    }
                    else if("Siang".equals(Time)){
                        System.out.println("Ibu aku ingin soup ayam pakai telur dadar lagi");
                    }
                    else if("Malam".equals(Time)){
                        System.out.println("Ibu aku bosan makan telur dadar.Nasi goreng ya");
                    }                
                }while(!"Pagi".equals(Time)&&!"Siang".equals(Time)&&!"Malam".equals(Time));
                break;
            case "Afraid":
                HP=HP-25;
                System.out.println(" ");
                        System.out.println("Ibu aku takut..... huweee huweeeek");
                break;
            case "Status" :
                System.out.println(" ");
                System.out.println("Health poin saat ini : " +HP);
                break;
            case "Exit":
                System.out.println(" ");
                System.out.println("Wah...sudah bosan bermainya...");
                System.out.println("Terimakasih");
                System.out.println("Kembali lagi yaaa!!!!");
                break;
            default:
                break;
        }
        if(HP<=10){
            System.out.println(" ");
        HP=HP+20;
            System.out.println("Hoaaaam Aku sangat lelah.Aku harus Tertidur");
            System.out.println("ZZZZZZZZZZZ");
            do{
            System.out.println("Apakah kamu mau WAKE UP dester");
            WU=a.nextLine();
            }while(!"WAKE UP".equals(WU));
        }
        else if(HP>100){
            System.out.println(" ");
            System.out.println(nd+"Sing");
            System.out.println("aku adalah anak bu daster selalu main "+EL+ " Karenaku suka");
        }
        else if(HP>10&&HP<20){
            System.out.println(" ");
            HP=HP+40;
            System.out.println("Heal");
            System.out.println("ibu... aku sakit.Tapi aku benci obat.Huhu");
        }
        }while(!"EXIT".equals(TD));// TODO code application logic here
    }
    
}
