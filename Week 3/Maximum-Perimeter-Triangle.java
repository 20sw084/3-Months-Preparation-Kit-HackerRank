import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
      long currMax=Integer.MIN_VALUE;
      Collections.sort(sticks);
      List<Integer> nonDegenerate=new ArrayList<>();
      for(int i=0;i<sticks.size()-2;i++)
      {
        long tempMax=0;
        int x=sticks.get(i);
        int y=sticks.get(i+1);
        int z=sticks.get(i+2);
        if(x+y>z){
        tempMax=x+y+z;
          if(tempMax>currMax){
            tempMax=currMax;
            nonDegenerate.clear();
            nonDegenerate.add(x);
            nonDegenerate.add(y);
            nonDegenerate.add(z);
          }
        }          
      }
      if(nonDegenerate.size()==0){
        nonDegenerate.add(-1);
        return nonDegenerate;
      }
      return nonDegenerate;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> sticks = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.maximumPerimeterTriangle(sticks);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
