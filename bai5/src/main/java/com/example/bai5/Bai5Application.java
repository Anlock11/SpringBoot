package com.example.bai5;

import com.example.bai5.orther.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Bai5Application {

    public static void main(String[] args) {
      ApplicationContext context =  SpringApplication.run(Bai5Application.class, args);

      try{
          Girl girl = context.getBean(Girl.class);
          System.out.println("Bean: " + girl.toString());


      }catch (Exception e){
          System.out.println("bean girl khong ton tai");
      }

        try{
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            System.out.println("Bean: " + otherGirl.toString());


        }catch (Exception e){
            System.out.println("bean othergirl khong ton tai");
        }








    }

}
