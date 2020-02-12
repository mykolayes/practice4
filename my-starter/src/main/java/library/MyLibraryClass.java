package library;

public class MyLibraryClass {
    private String customInfo;

    public MyLibraryClass(){
    }
    public MyLibraryClass(final String customInfo){
        this.customInfo = customInfo;
    }
    public void printInfo() {
        if (customInfo != null){
            System.out.println(customInfo);
        }
        else {
            System.out.println("My class from library");
        }
    }

}
