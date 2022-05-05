# Applying Hierarchical Planning in going from one place to another.
print("=========== Heirarchical Planning ===========")
print("Travelling from source to destination (1. Bus, 2. Train, 3. Car)")
actions = ["Select destination"]
options1 = [{ "action":"Go by bus"},
           { "action":"Go by train"},
           { "action":"Go by car"}]
options2 = [{ "action":"Book tickets"},
           { "action":"Board from stop"},]
carOptions = [{ "action":"Fill fuel",}]
options3 = [{ "action":"Board from stop",},
            { "action":"Drive to destination"},]

var1 = int(input("Select either 1,2,3: "))
if var1==1:
  actions.append(options1[0]["action"])
  var1 = int(input("Select either 1. Book tickets, 2. Board from stop:: "))
  if var1==1:
    actions.append(options2[0]["action"])
  if var1==2:
    actions.append(options2[1]["action"])
    actions.append(options3[0]["action"])
  actions.append(options3[0]["action"])
  pass

if var1==2:
  actions.append(options1[1]["action"])
  var1 = int(input("Select either 1. Book tickets, 2. Board from stop: "))
  if var1==1:
    actions.append(options2[0]["action"])
    actions.append(options3[0]["action"])
  if var1==2:
    actions.append(options2[1]["action"])
  pass

if var1==3:
  actions.append(options1[2]["action"])
  actions.append(carOptions[0]["action"])
  actions.append(options3[1]["action"])
  pass

actions.append("Reach destination")
print("Actions: ",actions)


# partial order planninng ending condition not complete
def get_actions(precondiions, action):
  actions = []
  for k,v in precondiions.items():
    if action in v:
      actions.append(k)
  return actions

plannings = []
def genrate_planning_graphs(start,actions,preconditions,complition,end):
    graph = []
    complition[start] = 1
    graph.append(start)
    curr_actions = get_actions(preconditions,start)
    for action in curr_actions:
        genrate_graphs(action,actions,preconditions,complition,end,graph)

def genrate_graphs(action,actions,preconditions,complition,end,graph):
    if action == end:
        if complition[end] == 1:
            return
        complition[end] = 0
        now_actions = preconditions[action]
        for act in now_actions:
            if complition[act] == 0:
                genrate_graphs(act,actions,preconditions,complition,end,graph)
        graph.append(action)
        complition[end] = 1
        plannings.append(graph)
    else:
      if complition[action] == 0:
        now_actions = preconditions[action]
        for act in now_actions:
            if complition[act] == 0:
                genrate_graphs(act,actions,preconditions,complition,end,graph)
        graph.append(action)
        complition[action] = 1
        curr_actions = get_actions(preconditions,action)
        for action in curr_actions:
            genrate_graphs(action,actions,preconditions,complition,end,graph)
    
actions = ["start","right socks","left socks","right shoes","left shoes","end"]
preconditions = {
    "start": [],
    "right socks": ["start"],
    "left socks": ["start"],
    "right shoes": ["right socks"],
    "left shoes": ["left socks"],
    "end": ["right shoes","left shoes"]
}
complition = {
    "start": 0,
    "right socks": 0,
    "left socks": 0,
    "right shoes": 0,
    "left shoes": 0,
    "end": 0
}

genrate_planning_graphs("start",actions,preconditions,complition,"end")
print("\n\n")
print("=========== Partial Order Planning ===========")
print(plannings)