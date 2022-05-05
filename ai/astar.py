start_node = '0'
end_node = '8'

def a_star(start_node, end_node):
  open_set = set(start_node)
  closed_set = set()
  g = {} # Store distance from start node.
  parents = {} # Parents contain an adjacent map of all nodes.

  # Distance of start node from itself is zero
  g[start_node] = 0
  parents[start_node] = start_node

  while len(open_set) > 0 :
    n = None

    # Node with the lowest f() is found.
    for v in open_set:
      if n == None or g[v] + heuristic(v) < g[n] + heuristic(n):
        n = v

    if n == end_node or Graph_node[n] == None :
      pass
    else:
      for (m, weight) in get_neighbours(n):
        if m not in open_set and m not in closed_set:
          open_set.add(m)
          parents[m] = n
          g[m] = g[n] + weight
        else:
          if g[m] > g[n] + weight:
            g[m] = g[n] + weight
            parents[m] = n
            if m in closed_set:
              closed_set.remove(m)
              open_set.add(m)

    if n == None:
      print("Path doesn't exist")
      return None

    if n == end_node:
      path = []
      print("Parents",parents)
      while parents[n] != n:
        path.append(n)
        n = parents[n]
      path.append(start_node)
      path.reverse()
      print(f"Path found {path}")
      return path

    open_set.remove(n)
    closed_set.add(n)      

  print("Path doesn't exist!")
  return None

def get_neighbours(v):
  if v in Graph_node:
    return Graph_node [v]
  else:
    return None

def heuristic(n):
  h_dist = {
      'A':11,
      'B':2,
      'C':99,
      'D':1,
      'E':7,
      'G':0
  }

  return h_dist[n]


Graph_node = {
    'A':[('B',2),('E',3)],
    'B':[('C',1),('G',3)],
    'C':None,
    'E':[('D',6)],
    'D':[('G',1)],
}

a_star('A','G')