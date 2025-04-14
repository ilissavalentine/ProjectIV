import java.io.*;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PayCalc {
    public static void main(String[] args){
        String inputFile = "/Users/ilivalentine/Desktop/Current Class Folders/CPSCll/PayCalc/pay.csv";
        String outputFile = "output.csv";
        String line;
        String cvsSplitBy = ",";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            // Write header row
            bw.write("EmpID,Rate,Hours Worked,Weekly Pay");
            bw.newLine();

            // Skip header in input
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy, -1);

                String empID = data[0];
                double Rate = Double.parseDouble(data[1]);
                double hoursWorked = Double.parseDouble(data[2]);

                double weeklyPay;
                if (hoursWorked > 40) {
                    double overtimeHours = hoursWorked - 40;
                    weeklyPay = (40 * Rate) + (overtimeHours * Rate * 1.5);
                } else {
                    weeklyPay = hoursWorked * Rate;
                }

                //Round weeklyPay
                BigDecimal roundedPay = new BigDecimal(weeklyPay).setScale(2, RoundingMode.UP);

                // Format weekly pay
                DecimalFormat currencyFormat = new DecimalFormat("$#,##0.00");
                String formattedPay = currencyFormat.format(roundedPay);

                //Debugging
                System.out.println("Writing row: " + empID + "," + Rate + "," + hoursWorked + "," + formattedPay);


                // Write to output
                bw.write(empID + "," + Rate + "," + hoursWorked + ",\"" + formattedPay + "\"");
                bw.newLine();
            }

            System.out.println("Output written to " + outputFile);

        } catch (IOException e) {
            System.err.println(" Error reading/writing file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println(" Error parsing numbers: " + e.getMessage());
        }




    }
}
