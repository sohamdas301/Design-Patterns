package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    private static int buildSegmentTree(int i, int l, int r, int[] seg, int[] arr) {
        if(l == r) {
            seg[i] = arr[l];
            return seg[i];
        }
        int mid = (l + r) / 2;
        int left = buildSegmentTree(2*i+1, l, mid, seg, arr);
        int right = buildSegmentTree(2*i+2,mid+1, r, seg, arr);
        return seg[i] = Math.max(left, right);
    }

    private static int query(int i,int low, int high, int l, int r, int[] seg) {
        if(low >= l && high <= r) return seg[i];
        if(low > r || l > high) return Integer.MIN_VALUE;
        int mid = (low + high) / 2;
        int left = query(2*i+1, low, mid, l, r, seg);
        int right = query(2*i+2, mid+1, high, l , r, seg);
        return Math.max(left, right);
    }

    private static void rangeUpdate(int i,int low, int high, int l,int r, int val, int[] seg, int[] lazy) {
        if(lazy[i] != 0) {
            seg[i] += (high - low + 1) * lazy[i];
            if(low != high) {
                lazy[2 * i + 1] += lazy[i];
                lazy[2 * i + 2] += lazy[i];
            }
            lazy[i] = 0;
        }
        if(low > r || l > high | low > high) return;
        if(low >= l && high <= r) {
           seg[i] +=  (high - low + 1) * val;
           if(low != high) {
               lazy[2 * i + 1] += lazy[i];
               lazy[2 * i + 2] += lazy[i];
           }
        }
    }
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = 9;
////        int[] arr = {5, 2, 4, 1, 3, 7, 6, 4, 5};
////        int[] seg = new int[4 * n];
////        buildSegmentTree(0, 0, n - 1, seg, arr);
////        int l = 0;
////        int r = 4;
////        System.out.println(query(0, 0, n - 1, l, r, seg ));
//        ArrayList<String> str = new ArrayList<>();
//        str.add("");
//        str.add("abc");
//        str.add("xyz");
//        String s = str.stream().map(string -> "("+string+")").collect(Collectors.joining("-"));
//        System.out.println(s);
//    }

    static int cal(int i, int k, int[] arr) {
        if(i >= arr.length) return 0;
//        if(i !=0 && k <= 0) return 0;
        int take = arr[i] + cal(i+1, k + i + 1, arr);
        int notTake = Integer.MAX_VALUE;
        if(k > 0) {
            notTake = cal(i+1, k--, arr);
        }
        return Math.min(take, notTake);
    }

    public static int minCost(int[] prices) {
        return minCostRecursive(prices, 0);
    }

    private static int minCostRecursive(int[] prices, int currentIndex) {
        if (currentIndex >= prices.length) {
            return 0; // No more fruits to purchase
        }

        int minCost = Integer.MAX_VALUE;

        // Try buying each fruit starting from currentIndex and calculate the cost
        for (int i = currentIndex; i < prices.length; i++) {
            int cost = prices[i] + minCostRecursive(prices, i + i + 1);
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }

    static class MyRunnable implements Runnable {
        List<Integer> list;

        public MyRunnable(List<Integer> list) {
            this.list = list;
        }

        public void run() {
            list.add(300);
            System.out.println("Inside Run");
        }
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        int[] arr = {2, 20, 2, 2};
//        int n = arr.length;
//        System.out.println(cal(0, 0, arr));
//        System.out.println("Minimum cost to buy all fruits: " + minCost(arr));
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        List<Integer> as = new ArrayList<>();
        Future<List<Integer>> future = poolExecutor.submit(new MyRunnable(as), as);
//        future.get();
        Thread.sleep(5000);
        System.out.println(as.get(0));
        poolExecutor.shutdown();

    }
}
