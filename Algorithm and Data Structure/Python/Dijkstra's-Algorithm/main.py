# Dijkstra Algorithm for finding shortest path in a graph

graph = {
    'a' : {'b': 3, 'c': 4, 'd': 7},
    'b' : {'c': 1, 'f':5},
    'c' : {'d': 2, 'f':6},
    'd' : {'e': 3, 'g':6},
    'e' : {'f': 1, 'g':3, 'h':4},
    'f' : {'e': 1, 'h':8},
    'g' : {'h': 6},
    'h' : {'g': 2}
}

def dijkstra(graph, start, end):
    shortest_distance = {} # Untuk mencari jarak terpendek, akan selalu terupdate setiap kali melakukan perhitungan graf
    track_predecessor = {} # Untuk mencari rute terpendek, akan selalu terupdate setiap kali melakukan perhitungan graf
    
    unvisited_nodes = graph # Menyimpan semua node yang belum dikunjungi
    infinity = 9999999 # Nilai infinity untuk menandai jika node belum dikunjungi
    
    path = [] # Menyimpan rute terpendek
    
    for node in unvisited_nodes:
        shortest_distance[node] = infinity # Set semua node ke infinity
    shortest_distance[start] = 0 # Set start node ke 0
    
    while unvisited_nodes:
        min_distance_node = None
        
        for node in unvisited_nodes:
            if min_distance_node is None:
                min_distance_node = node
            elif shortest_distance[node] < shortest_distance[min_distance_node]:
                min_distance_node = node
        path_options = graph[min_distance_node].items() # Mencari semua rute yang dapat ditempuh dari node yang ditempuh
        
        for child_node, weight in path_options:
            if weight + shortest_distance[min_distance_node] < shortest_distance[child_node]:
                shortest_distance[child_node] = weight + shortest_distance[min_distance_node]
                track_predecessor[child_node] = min_distance_node
        unvisited_nodes.pop(min_distance_node)
    current = end
    
    while current != start:
        try:
            path.insert(0, current)
            current = track_predecessor[current]
        except KeyError:
            print('Path not reachable')
            break
    path.insert(0, start)
    if shortest_distance[end] != infinity:
        print('Shortest distance is ' + str(shortest_distance[end]))
        print('Path is ' + str(path))
    else:
        print('Path not reachable')
    pass

dijkstra(graph, 'a', 'd')