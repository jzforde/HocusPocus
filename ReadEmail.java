import java.io.*;
public class ReadEmail
{
	public static void main(String[] args)
	{
		try (BufferedReader bufin = new BufferedReader(new FileReader("RepairShopsEmail.txt")))
		{
			String line;
			while((line = bufin.readLine()) != null)
			{
				
				System.out.println(line);
			}
		}
		catch (IOException e)
		{
			System.err.println(e);
		}
	}
}
