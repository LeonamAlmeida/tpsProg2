package exercicio_01;
import java.io.*;
import java.util.Scanner;

public class Container {

    private final Form[] forms;

    public Container(Form[] forms) {
        this.forms = forms;
    }

    public void print(Out out) {
        for (Form form : forms) {
            out.flush(form);
        }
    }

    public static void main(String[] args) {
        Form[] forms = new Form[] { new Form("form1"), new Form("form2"), new Form("form3") };
        Container container = new Container(forms);
        
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Deseja receber formulario por console(1) ou por .txt(2)");
        x = input.nextInt();
        input.close();
        
        if(x == 1)
	        // Imprime o conteúdo de cada objeto Form no console
	        container.print(new ConsoleOutput());
        else
	        // Armazena o conteúdo de cada objeto Form em um arquivo texto
	        container.print(new FileOutput("forms.txt"));
    }
}

interface Out {
    void flush(Form form);
}

class ConsoleOutput implements Out {
    @Override
    public void flush(Form form) {
        System.out.println(form.content());
    }
}

class FileOutput implements Out {
    private final String filename;

    public FileOutput(String filename) {
        this.filename = filename;
    }

    @Override
    public void flush(Form form) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(form.content());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

record Form(String content) {
}