
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
/**
 *
 * @author abhis
 */
public class date 
{
    public static void main(String[] args)
    {
        LocalTime obj1 = LocalTime.now();
        LocalDate obj2 = LocalDate.now();
        LocalDateTime obj3 = LocalDateTime.now();
        DateTimeFormatter obj4 = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm;ss");
        String fd = obj3.format(obj4);
    
        System.out.println("TODAY TIME : " + obj1);
        System.out.println("TODAY DATE : " + obj2);
        System.out.println("TODAY TIME AND DATE : " + obj3);
        System.out.println("FORMATTED DATE : " + fd);
    }
    
}
