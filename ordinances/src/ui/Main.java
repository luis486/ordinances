import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static double [] numbers;
	private  static int setAmount;

    public static String FILE_SEPARATOR = "\\ ";
/*
    public static void initialize() throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        double[] cases = new double[nums];
        for(int i = 0; i < cases.length; i++){
            String[] parts = br.readLine().split(FILE_SEPARATOR);
            double[] age = new double[parts.length];
            for(int j = 0; j < age.length; j++){ 
            age[i] = Double.parseDouble(parts[i]);
            }
        }
        br.close();
    }*/

    public static String importFile() throws IOException{
        BufferedReader brf = new BufferedReader(new FileReader("C:/Users/USUARIO/Desktop/Tercer Semestre/Algortimos y programación II/S4_MURCIA_LUIS/ordinances/data"));
        String line = brf.readLine();
        while(line != null){
            String[] parts = line.split(FILE_SEPARATOR);
            double[] age = new double[parts.length];
            for(int i = 0; i < age.length; i++){
                age[i] = Double.parseDouble(parts[i]);
            }
            line = brf.readLine();
        }
        brf.close();
        return "Data imported succesfully";
    }

    public static String exportFile() throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/USUARIO/Desktop/Tercer Semestre/Algortimos y programación II/S4_MURCIA_LUIS/ordinances/data"));
        for(int i = 0; i < 100; i++){
            
        }
        bw.close();
        return "Data was exported succesfully";
    }

    public static void bubbleSort(){
        String parts = "";
        int count = 0;
        int[] array = new int[100];
        boolean changed = true;
        for(int i = 0; i < array.length && changed; i++){
            changed = false;
            for(int j = 0; j < array.length-1; j++){
                if(array[j] > array[j+1]){
                    count++;
                    int aux = array [j];
                    array[j] = array [j+ 1];
                    array [j +1] = aux;
                    changed = true;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            parts += array[i]+" ";
        }
        double average;
        if(array.length == 1){
            average = count;
        }
        else{
            average = count/(array.length-1);
        }
    }

    public static void start() throws NumberFormatException, IOException {	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escriba la cantidad de conjuntos");
		setAmount=Integer.parseInt(br.readLine());
		
		fullSets();
	} 

    public static void fullSets() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		while (i<setAmount) {
			System.out.println("Escriba las edades de los estudiantes");
			String ages=br.readLine();
			String[] arrayAges=ages.split(" ");
			numbers = new double[arrayAges.length];
			for(int j=0; j<arrayAges.length; j++) {
                numbers[j]=Double.parseDouble(arrayAges[j]);
				
			}
			i++;
			bubbleSort();
			System.out.println(Arrays.toString(numbers));
			
		}
	}

    public static void main(String[] args) throws Exception {
        //initialize();
        start();
    }
}
