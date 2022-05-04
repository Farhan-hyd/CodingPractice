class Graph():
    def __init__(self):
        self.nodes = set()
        self.edges = {}
        self.distances = {}

    def add_node(self, value):
        self.nodes.add(value)

    def add_edge(self, from_node, to_node, distance):
        self.edges.setdefault(from_node, [])
        self.edges[from_node].append(to_node)
        self.distances[(from_node, to_node)] = distance

    def bfs(self, from_node, to_node):
        print("bfs: ")
        visited = {from_node: 0}
        queue = [from_node]
        while queue:
          current_node = queue.pop(0)
          print (current_node, end = " ") 
          for neighbor in self.edges[current_node]:
            if neighbor not in visited:
                visited[neighbor] = visited[current_node] + \
                    self.distances[(current_node, neighbor)]
                queue.append(neighbor)
        print()
        return visited[to_node]

    def dfs(self, from_node, to_node):
        print("dfs: ")
        visited = {from_node: 0}
        stack = [from_node]
        while stack:
          current_node = stack.pop()
          print (current_node, end = " ") 
          for neighbor in self.edges[current_node]:
            if neighbor not in visited:
                visited[neighbor] = visited[current_node] + \
                    self.distances[(current_node, neighbor)]
                stack.append(neighbor)
        print()
        return visited[to_node]

    def depth_limited_search(self, from_node, to_node, limit):
        print("depth limited search: ")
        visited = {from_node: 0}
        stack = [from_node]
        while stack:
          current_node = stack.pop()
          print (current_node, end = " ") 
          for neighbor in self.edges[current_node]:
            if neighbor not in visited:
                visited[neighbor] = visited[current_node] + \
                    self.distances[(current_node, neighbor)]
                stack.append(neighbor)
                if visited[neighbor] > limit:
                    return visited[to_node]
        print()
        return visited[to_node]    

class HeuristicGraph:
    def __init__(self, adjacency_list):
        self.adjacency_list = adjacency_list

    def get_neighbors(self, v):
        return self.adjacency_list[v]

    def h(self, n):
        H = {
            'A': 1,
            'B': 1,
            'C': 1,
            'D': 1
        }
        return H[n]

    def a_star_algorithm(self, start_node, stop_node):
        open_list = set([start_node])
        closed_list = set([])
        g = {}
        g[start_node] = 0
        parents = {}
        parents[start_node] = start_node

        while len(open_list) > 0:
            n = None
            for v in open_list:
                if n == None or g[v] + self.h(v) < g[n] + self.h(n):
                    n = v

            if n == None:
                print('Path does not exist!')
                return None

            if n == stop_node:
                reconst_path = []
                while parents[n] != n:
                    reconst_path.append(n)
                    n = parents[n]

                reconst_path.append(start_node)
                reconst_path.reverse()
                print('Path found: {}'.format(reconst_path))
                return reconst_path

            for (m, weight) in self.get_neighbors(n):
                if m not in open_list and m not in closed_list:
                    open_list.add(m)
                    parents[m] = n
                    g[m] = g[n] + weight
                else:
                    if g[m] > g[n] + weight:
                        g[m] = g[n] + weight
                        parents[m] = n
                        if m in closed_list:
                            closed_list.remove(m)
                            open_list.add(m)
            open_list.remove(n)
            closed_list.add(n)

        print('Path does not exist!')
        return None