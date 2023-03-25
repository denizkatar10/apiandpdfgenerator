package gmibank.utilities;

import gmibank.pojos.Customer;
import gmibank.pojos.States;
import gmibank.pojos.User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class DummyText {

    public static void main(String[] args) {

        List <User> list = new ArrayList<>();
        User user = new User();
        User user2 = new User();
        user.setFirstName("Deniz");
        user.setLastName("Katar");
        user.setEmail("dnzk2atar@gmail.com");

        user2.setFirstName("aod");
        user2.setLastName("gfd");
        user2.setEmail("asd2da@gmail.com");

        list.add(user);
        list.add(user2);

        String filename = "C:\\Users\\Mr Deniz\\IdeaProjects\\APIandPDFCreation\\src\\test\\resources\\test_data\\dnzkatarPersonalInfo.txt";
        System.out.println(user.getFirstName());

       // saveAllStates(filename,list);

        List<User> list2 = returnCustomer(filename);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println("FirstName =>" + list2.get(i).getFirstName());
            System.out.println("LastNmae =>" + list2.get(i).getLastName());
            System.out.println("Email =>" + list2.get(i).getEmail());
        }



    }

    public static void saveAllStates(String fileName, List <User> list)  {
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < list.size(); i++) {

                writer.append(list.get(i).getFirstName()+",");
                writer.append(list.get(i).getLastName()+",");
                writer.append(list.get(i).getEmail()+"\n ");
            }

            writer.close();

        } catch(Exception e){

        }
    }

    public static List<User> returnCustomer(String filename){
        List<User>all = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                User user = new User();

                String [] each = line.split(",");
                user.setFirstName(each[0]);
                user.setLastName(each[1]);
                user.setEmail(each[2]);

                sb.append(System.lineSeparator());
                line = br.readLine();

                all.add(user);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }



}
