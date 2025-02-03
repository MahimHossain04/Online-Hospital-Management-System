import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Account {
    private String username;
    private String email;
    private String age;
    private String gender;
    private String password;

    public Account(String username, String email, String age, String gender, String password) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.password = password;
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean checkAccount() {
        File file = new File("Data" + File.separator + "user_data.txt");
        
        if (!file.exists()) {
            return false; // File does not exist, no accounts found
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] details = line.split("\t");

                // Prevent array out-of-bounds error
                if (details.length < 5) {
                    continue;
                }

                if (details[0].equals(username) && details[4].equals(password)) {
                    return true; // Username and password match
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // No match found
    }

    public boolean isUsernameTaken() {
        File file = new File("Data" + File.separator + "user_data.txt");

        if (!file.exists()) {
            return false; // File does not exist, username is not taken
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] details = line.split("\t");

                // Ensure valid data before accessing array elements
                if (details.length < 1) {
                    continue;
                }

                if (details[0].equals(username)) {
                    return true; // Username is already taken
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Username is not taken
    }

    public void addAccount() {
        File file = new File("Data" + File.separator + "user_data.txt");
        File directory = new File("Data");

        // Ensure the directory exists before writing
        if (!directory.exists()) {
            directory.mkdirs();
        }

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(username + "\t" + email + "\t" + age + "\t" + gender + "\t" + password + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
