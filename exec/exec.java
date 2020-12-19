import java.util.*;


public class exec
{
	public static void main(String[] args) {
	try
	{

		Process lb = Runtime.getRuntime().exec("python3 chessboard.py");
	}
	catch(Exception e)
	{
		System.out.println("Job not done\n"+e);
	}
	}
}
