package behavioral_patterns.observer;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EmailListener emailListener = new EmailListener();
        LogListener logListener = new LogListener();

        editor.events.subscribe("open", emailListener);
        editor.events.subscribe("open", logListener);
        editor.events.subscribe("save", emailListener);

        editor.open("file1.txt");
        editor.save("filee1.txtx");

        System.out.println("");

        editor.events.unsubscribe("open", emailListener);
        editor.open("file1.txt");
        editor.save("filee1.txtx");
    }
}
