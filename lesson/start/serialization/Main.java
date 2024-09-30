package start.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserChild user = new UserChild();
        user.lifeLevel = 55;
        user.childLevel = 66;
        Sord sord = new Sord();
        sord.level = 5;
        user.sord = sord;
        
        FileOutputStream fileOutputStream = new FileOutputStream("start/serialization/tempFile");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(user);
        }

        FileInputStream fileInputStream = new FileInputStream("start/serialization/tempFile");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            UserChild newUser = (UserChild) objectInputStream.readObject();
            System.out.println(newUser.lifeLevel);
            System.out.println(newUser.childLevel);
            if (newUser.sord == null) {
                System.out.println("Null");
            } else {
                System.out.println(newUser.sord.level);
            }
        }
    }
}
