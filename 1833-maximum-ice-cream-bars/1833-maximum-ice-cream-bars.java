class Solution {
    public int maxIceCream(int[] costs, int coins) {
       ArrayList<Integer> list = new ArrayList<>();
        for (int cost : costs) {
            list.add(cost);
        }
        Collections.sort(list);
        int count = 0;
        for (int price : list) {
            if (coins >= price) {
                coins -= price;
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}