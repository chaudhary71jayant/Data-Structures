
import java.util.Arrays;

class Items{
    int value,weight;
    public Items(int val,int weight){
        value = val;
        this.weight = weight;
    }
}

public class FactionalKnapsack {
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};

        System.out.println("The total value is : " + knapsackVal(values, weights, 50));
    }

    static double knapsackVal(int[] values,int[] weights, int w){
        int n = weights.length;
        Items[] items = new Items[n];

        for(int i=0;i<n;i++){
            items[i] = new Items(values[i], weights[i]);
        }

        Arrays.sort(items, (a,b) -> {
            double ratioA = (double) a.value / a.weight;
            double ratioB = (double) b.value/b.weight;
            return Double.compare(ratioB, ratioA);
        });

        int currWeight=0;
        double finalval =0;

        for (int i = 0; i < n; i++) {
            if(currWeight + items[i].weight <= w){
                currWeight += items[i].weight;
                finalval += items[i].value;
            } else {
                int remaining = w- currWeight;
                finalval += (items[i].value / (double) items[i].weight) * (double) remaining;
                break;
            }        
        }
        return finalval;
    }
}
