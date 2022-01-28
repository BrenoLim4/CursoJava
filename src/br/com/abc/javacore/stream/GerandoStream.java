package br.com.abc.javacore.stream;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;
import sun.dc.pr.PathStroker;

/**
 *
 * @author 99039833
 */
public class GerandoStream {
    public static void main(String[] args) {
//        ArrayList<Integer> lista = new ArrayList<>();
//        HashSet<Integer> set = new HashSet<>();
//        long begin, end;
//        
//        IntStream.rangeClosed(1, 100000).forEach(n -> lista.add(n));
//        int size = lista.size();
//        begin = System.nanoTime();        
//            for(int i = 0; i < size; i++){
//                lista.remove(Integer.valueOf(i));
//            }
//        end = System.nanoTime();
//        
//        System.out.println("teste 1; tempo nn: " + String.valueOf(end - begin));
//        
//        IntStream.rangeClosed(1, 100000).forEach(n -> set.add(n));
//        size = set.size();
//        begin = System.nanoTime();        
//            for(int i = 0; i < size; i++){
//                set.remove(i);
//            }
//        
//        end = System.nanoTime();
//        System.out.println("teste 2; tempo nn: " + String.valueOf(end - begin));
        

        try(Stream<String> lines = Files.lines(Paths.get("C:\\Users\\99039833\\Desktop\\java\\CursoJava\\src\\br\\com\\abc\\javacore\\stream\\arquivo.txt"))){
            lines.flatMap(line -> Arrays.stream(line.split("\n")))
                    .forEach(System.out::println);
           
        }        
        catch(Exception ex){
            ex.getMessage();
        }
        
        Stream.iterate(1, n -> n + 1).filter(n-> n % 2 == 0).limit(40).forEach(System.out::println);
    }
}
