package Model;

import java.io.*;

/**
 * @author Oniichan
 * @data 18/10/2021
 * @project ristorante_informatica
 */
public class Save{
    public static String filePath;
    static {
        filePath = "ordine.dar";
    }
    public static void saveOrdine(Ordine ordine) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ordine);
            oos.flush();
            fos.close();
        } catch (Exception e) {}
    }

    public static Ordine loadOrdine(){
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            fis.close();
            return (Ordine)ois.readObject();
        } catch (Exception e) {}
        return null;
    }
}
