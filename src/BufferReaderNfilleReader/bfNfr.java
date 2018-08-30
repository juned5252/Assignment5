package BufferReaderNfilleReader;

import java.io.*;

import static java.lang.System.out;

public class bfNfr {

    public static void main(String[] args) {

        File file = new File("Grocerylist");
        BufferedReader br = null;


        try (FileReader fr = new FileReader(file)) {

            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            out.println("file is not found : " + file.toString());
        } catch (IOException e) {
            out.println("an unknown error has occured.Please try again later");
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("unable to close file: " + file.toString());
            }
            catch (NullPointerException ex){
                // file wwas probably never opened
            }

        }

    }

}
