graph = {
    '0':['1','2','3'],
    '1':['4'],
    '2':[],
    '3':['5','6'],
    '4':[],
    '5':[],
    '6':[]
}

visited = [] # List for visited nodes.
queue = []     # Initialize a queue
source_node = '0' # Source node

def bfs(visited, graph, node): #function for BFS
  visited.append(node)
  queue.append(node)

  while queue:     # Creating loop to visit each node till queue is empty
    m = queue.pop(0) 
    print (m, end = " ") 

    for neighbour in graph[m]:
      if neighbour not in visited:
        visited.append(neighbour)
        queue.append(neighbour)

# Driver Code
print("Following is the Breadth-First Search")
bfs(visited, graph, source_node)    # Call the function