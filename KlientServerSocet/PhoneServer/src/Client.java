import java.io.IOException;

public class Client {

        public static void main(String[] args) {

                    Phone phone = new  Phone("109.94.76.53", 8000);


                System.out.println("Connected to server");

                String request = "Visaginas";
                System.out.println("Request:" + request);
                phone.writeLine(request);

                String response = phone.readLine();
                System.out.println("Responce:" + response);


        }
    }


/*
    try (
            Phone phone = new  Phone("109.94.76.53", 8000);

            ) {
            System.out.println("Connected to server");

            String request = "Visaginas";
            System.out.println("Request:" + request);
            phone.writeLine(request);

            String response = phone.readLine();
            System.out.println("Responce:" + response);
            } catch (IOException e) {
            e.printStackTrace();
            }
            }
            }

Если оставлять try catch он ругается

 */