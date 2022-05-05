graph = {
    '0' : ['1','2','3'],
    '1' : [],
    '2' : ['4'],
    '3' : [],
    '4' : []
}

# graph = {
#   '5' : ['3','7'],
#   '3' : ['2', '4'],
#   '7' : ['8'],
#   '2' : [],
#   '4' : ['8'],
#   '8' : []
# }

visited = set()
source_node = '0'

def dfs(visited, graph, node):  #function for dfs 
    if node not in visited:
        print (node, end=" ")
        visited.add(node)
        for neighbour in graph[node]:
            dfs(visited, graph, neighbour)

# Driver Code
print("Following is the Depth-First Search")
dfs(visited, graph, source_node)