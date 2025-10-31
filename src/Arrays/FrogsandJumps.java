package src.Arrays;
public class FrogsandJumps {
     public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
          boolean[] vis = new boolean[leaves + 1];

        for (int f : frogs)
            if (f > 0 && f <= leaves && !vis[f])
                for (int j = f; j <= leaves; j += f)
                    vis[j] = true;

        int count = 0;
        for (int i = 1; i <= leaves; i++)
            if (!vis[i]) count++;

        return count;
    }

    
}
