package Module3_AdvancedJavaConcepts.Part4.Task1_ReadFile;
import java.io.*;
import java.net.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class ReadFile {
    public static void main(String[] args) {
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

            String line;
            double sumTemperature = 0;
            int count = 0;

            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");

                if (parts.length < 2 || parts[1].equals("*")) {
                    continue;
                }

                LocalDateTime timestamp = LocalDateTime.parse(parts[0], formatter);
                double temperature = Double.parseDouble(parts[1].replace(",", "."));

                if (timestamp.toLocalDate().isEqual(LocalDate.of(2023, 1, 1))) {
                    sumTemperature += temperature;
                    count++;
                }
            }

            double averageTemperature = sumTemperature / count;
            System.out.println("Average temperature on January 1st, 2023: " + String.format("%.2f", averageTemperature) + " °C");

            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}