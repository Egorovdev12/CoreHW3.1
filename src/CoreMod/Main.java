package CoreMod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    private static String launchPath = "C:\\Users\\Admin\\Desktop\\Games";
    private static StringBuilder tempStr = new StringBuilder();

    public static void main(String[] args) throws IOException{
    launch();
    }

    public static void createDirectory(String newPackageName) {
        File dir = new File(launchPath + "\\" + newPackageName);
        if (dir.mkdir())
            tempStr.append("Каталог " + newPackageName + " успешно загружен \n");
        else
            tempStr.append("Не удалось загрузить каталог " + newPackageName + "\n");
    }

    public static void createFile(String fileName) throws IOException {
        File file = new File(launchPath + "\\" + fileName);
        if (file.createNewFile())
            tempStr = tempStr.append("Файл " + fileName + " успешно загружен \n");
        else
            tempStr = tempStr.append("Не удалось загрузить файл " + fileName + "\n");
    }


    public static void launch() throws IOException {
        createDirectory("src");
        createDirectory("res");
        createDirectory("savegames");
        createDirectory("temp");
        createDirectory("src\\main");
        createDirectory("src\\test");
        createFile("src\\main\\Main.java");
        createFile("src\\main\\Utils.java");
        createDirectory("res\\drawables");
        createDirectory("res\\vectors");
        createDirectory("res\\icons");
        createFile("temp\\temp.txt");

        FileWriter launchLogs = new FileWriter(launchPath + "\\temp\\temp.txt");
        launchLogs.write(tempStr.toString());
        launchLogs.close();
    }
}
