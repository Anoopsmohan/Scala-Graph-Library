var visit= Array(0,0,0,0,0,0,0,0)
var n:Int =8
var nodes=Array("a","b","c","d","e","f","g","h")
for(i <- 0 to n-1)
	visit(i)=0

var L=Array[Int](0,0,0,0,0,0,0,0)
var S=Array[Int](0,0,0,0,0,0,0,0)
var adj_list= Array(Array(0,0,0,1,1,0,0,0),
		Array(0,0,0,0,1,0,0,0),
		Array(1,1,0,0,0,1,1,0),
		Array(0,0,0,0,1,1,0,0),
		Array(0,0,0,0,0,1,0,0),
		Array(0,0,0,0,0,0,0,1),
		Array(0,0,0,0,0,0,0,0),
		Array(0,0,0,0,0,0,0,0))

println("\n\t\tTOPOLOGICAL SORT\n")
println("\t\t******************")
var m=0

def top_sort(node: Int) {
	if(visit(node) == 0){
		visit(node)=1
		for(i <- 0 to n-1) {
			if(adj_list(i)(node)==1)
				top_sort(i)
			}
		L(m)=node
		m+=1
	}
}



var l=0
for(i <- 0 to n-1) {
	var k:Int=0
	for(j <- 0 to n-1) {
		if(adj_list(i)(j) == 0){
			k+=1
		}
	}
	if(k==n){
		S(l)=i
		l+=1
	}  
}


for(i <- 0 to n-1) {
	if(S(i) != 0) 
		top_sort(S(i))
}

for(i<- 0 to n-1)
	print(nodes(L(i))+"\t")

print("\n")
