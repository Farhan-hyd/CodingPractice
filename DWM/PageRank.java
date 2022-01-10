import java.util.Scanner;

public class PageRank {
  private final int[][] path = new int[10][10];
  private final double[] pageRank = new double[10];

  public void calc(double totalNodes) {
    int externalNodeNumber;
    int internalNodeNumber;
    double initialPageRank;
    double outgoingLinks = 0;
    double dampingFactor = 0.85;
    double[] tempPageRank = new double[10];

    int i = 1;
    int iteration = 1;
    initialPageRank = 1 / totalNodes;
    System.out.println("Total number of nodes: " + totalNodes + "\tinitial page rank of all nodes: " + initialPageRank);

    for (i = 1; i <= totalNodes; i++) {
      this.pageRank[i] = initialPageRank;
    }

    System.out.println("inital page rank values, 0th Step");
    for (i = 1; i <= totalNodes; i++) {
      System.out.println("Page Rank of " + i + "is :\t" + this.pageRank[i]);
    }

    while (iteration <= 2) {
      for (i = 1; i <= totalNodes; i++) {
        tempPageRank[i] = this.pageRank[i];
        this.pageRank[i] = 0;
      }

      for (internalNodeNumber = 1; internalNodeNumber <= totalNodes ; internalNodeNumber++) {
        for (externalNodeNumber = 1; externalNodeNumber <= totalNodes; externalNodeNumber++) {
          if (this.path[externalNodeNumber][internalNodeNumber] == 1) {
            i = 1;
            outgoingLinks = 0;
            while (i <= totalNodes) {
              if (this.path[externalNodeNumber][i] == 1) {
                outgoingLinks++;
              }
              i = i + 1;
            }
            this.pageRank[internalNodeNumber] += tempPageRank[externalNodeNumber] * (1 / outgoingLinks);
          }
        }

        System.out.println("After " + iteration + "th Step");
        for (i = 1; i <= totalNodes; i++) {
          System.out.println(" Page Rank of " + i + " is :\t" + this.pageRank[i]);
        }
        iteration++;
      }
      
      for (i = 1; i <= totalNodes; i++) {
        this.pageRank[i] = (1 - dampingFactor) + dampingFactor * this.pageRank[i];
      }
      System.out.println("\n Final Page Rank : ");
      for (i = 1; i <= totalNodes; i++) {
        System.out.println(" Page Rank of " + i + " is :\t" + this.pageRank[i]);
      }
    }
  }

  public static void main(String[] args) {
    int nodes, i, j;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the Number of WebPages: ");
    nodes = in .nextInt();
    PageRank p = new PageRank();
    System.out.println("Enter the Adjacency Matrix with 1->PATH & 0->NO PATH Between two WebPages: ");
    for (i = 1; i <= nodes; i++) {
      for (j = 1; j <= nodes; j++) {
        p.path[i][j] = in .nextInt();
        if (j == i) {
          p.path[i][j] = 0;
        }
      }
    }
    p.calc(nodes);
  }  
}
