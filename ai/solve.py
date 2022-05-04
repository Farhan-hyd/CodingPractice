from graph import Graph, HeuristicGraph

def create_graph():
    graph = Graph()

    n = int(input("no of nodes: "))
    for i in range(n):
        graph.add_node(i)

    adj_matrix = []
    print("enter adjacency matrix: ")
    for i in range(n):
        adj_matrix.append(list(map(int, input().split())))

    for i in range(n):
        for j in range(n):
          if adj_matrix[i][j] != 0:
            graph.add_edge(i, j, adj_matrix[i][j])
          
    print(graph.edges)
    return graph

def create_heuristic_graph():
    adjacency_list = {
    'A': [('B', 1), ('C', 3), ('D', 7)],
    'B': [('D', 5)],
    'C': [('D', 12)]
    }
    heuristic_graph = HeuristicGraph(adjacency_list)
    return heuristic_graph    

def main():
    graph = create_graph()
    source = int(input("source: "))
    destination = int(input("destination: "))
    print("bfs weight : "+str(graph.bfs(source, destination)))
    print("dfs weight : "+str(graph.dfs(source, destination)))
    print("dls weight : "+str(graph.depth_limited_search(source, destination, 2)))
    
    heuristic_graph = create_heuristic_graph()
    heuristic_graph.a_star_algorithm('A','D')

main()