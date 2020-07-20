import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class Assignment2 {
	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
		ScriptEngineManager s = new ScriptEngineManager();
		ScriptEngine e = s.getEngineByName("nashorn");
		e.eval(new FileReader("Demo.js"));
		Invocable i=(Invocable) e;
		int j=5;
		Object r=i.invokeFunction("fun1",j);
		if(r.equals(true)) {
			System.out.println(j+" is prime"); 
		}
		else {
			System.out.println(j+" is not prime");
		}
		}
	}
