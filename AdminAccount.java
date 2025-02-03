import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AdminAccount {
    private final String defaultUsername = "admin";
    private final String defaultPassword = "admin";

    public boolean validateAdmin(String username, String password) {
        File folder = new File(".\\Data");
        if (!folder.exists()) {
            folder.mkdir(); // Create the 'Data' folder if it doesn't exist
        }

        File file = new File(folder, "admin_data.txt");
        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("admin\tadmin\n"); // Write default admin credentials
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Now read the file for validation
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] details = line.split("\t");
                if (details[0].equals(username) && details[1].equals(password)) {
                    return true; // Admin credentials are valid
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Invalid credentials
		
		
    }
	public boolean updateAdminCredentials(String newUsername, String newPassword) {
    File file = new File(".\\Data\\admin_data.txt");
    try (FileWriter writer = new FileWriter(file)) {
        writer.write(newUsername + "\t" + newPassword + "\n");
        return true;
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false;
}

}
