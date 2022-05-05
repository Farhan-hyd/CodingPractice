graph = {
  '5' : ['3','7'],
  '3' : ['2', '4'],
  '7' : ['8'],
  '2' : [],
  '4' : ['8'],
  '8' : []
}

def DLS(start, goal, path, level, max_depth):
  print("Current level -->", level)
  path.append(start)
  if(start == goal):
    print('Goal test successful')
    return path
  print("Goal test failed")
  if level == max_depth:
    return False
  # Expanding the current node
  for child in graph[start]:
    if DLS(child,goal, path, level + 1, max_depth):
      return path
    path.pop()
  return False

# Driver code
start = '5'
goal = '7'
path = []
max_depth = int(input("Enter the max depth: "))
res = DLS(start, goal, path, 0, max_depth)

if(res):
  print("\nPath to goal node available")
  print("Path: ",path)
else:
  print("\nPath to the goal node is not available")