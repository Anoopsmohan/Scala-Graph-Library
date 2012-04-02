var visit= Array(0,0,0,0,0,0,0)
var n:Int =7
var nodes=Array(1,2,3,4,5,6,7)
for(i <- 0 to n-1)
	visit(i)=0

var adj_list= Array(Array(0,1,1,1,0,0,0),
		Array(1,0,0,0,0,0,0),
		Array(1,0,0,0,1,1,0),
		Array(1,0,0,0,0,0,0),
		Array(0,0,1,0,0,0,0),
		Array(0,0,1,0,0,0,1),
		Array(0,0,0,0,0,1,0))

println("\n\t\tDEPTH FIRST SEARCH\n")
println("\t\t******************")
println("\n\nVisited nodes\n")

def dfs(node: Int) {
	print(nodes(node) + " ")
	visit(node)=1
	for(i <- 1 to n-1) {
 		if(visit(i) == 0){
			if(adj_list(node)(i) !=0)
				dfs(i)
		}
	}
}

for(i <- 0 to n-1) {
	if(visit(i) == 0) 
		dfs(i)
}
print("\n")
