package Teknikker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Jens-Andreas on 07-May-17.
 */
public class main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(40);
        list.add(50);
        list.add(60);

        list = list.stream()
                .map(p-> p*5)
                .filter(p -> p >= 40)
                .collect(Collectors.toList());





        System.out.println(list);
    }
}
