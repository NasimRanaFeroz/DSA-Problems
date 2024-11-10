public class frequencyOfElement {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,5,8,7,5,4,3,1,2,3,4,5,5};
        int[] visited = new int[arr.length];
        int v = -1;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    visited[j] = v;
                }
            }
            if (visited[i] != v) {
                visited[i] = cnt;
            }
        }

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] != v) {
                System.out.println("Frequency of " + arr[i] + " : " + visited[i]);  
            }
        }
    }
}