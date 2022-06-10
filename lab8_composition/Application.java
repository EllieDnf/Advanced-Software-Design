package Advanced_Software_Design.lab8_composition;

public class Application {

    public static void main(String[] args) {
        FileComponent rootDir = new Directory("root");
        FileComponent appdir = new Directory("applications");
        FileComponent datadir = new Directory("my data");
        FileComponent coursedir = new Directory("cs525");
        FileComponent excelfile = new File("msexcel.exe", 2353256);
        FileComponent wordfile = new File("msword.exe", 3363858);
        FileComponent studentsfile = new File("students.doc", 34252);

        FileComponent excelLink = new Link(excelfile);

        rootDir.addComponent(appdir);
        rootDir.addComponent(datadir);
        datadir.addComponent(coursedir);
        appdir.addComponent(excelfile);
        appdir.addComponent(wordfile);
        coursedir.addComponent(studentsfile);
        coursedir.addComponent(excelLink);


        Drive drive = new Drive("MyDrive", rootDir);
        drive.print();
    }
}
