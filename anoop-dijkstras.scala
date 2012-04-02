var visit= Array(0,0,0,0,0)
var d=new Array[Int](5)
var n:Int =5
var nodes=Array(1,2,3,4,5,6,7)
var min=1000

var adj_list= Array(Array(100,3,12,7,100),
		   Array(3,100,2,2,4),
		   Array(12,2,100,100,1),
		   Array(7,2,100,100,100),
		   Array(100,4,1,100,100))

println("\n\t\tDIJKSTRAS SHORTEST PATH ALGORITHM\n")
println("\t\t*********************************")

def shortestpath(nod:Int) {
	var k:Int=0
	var node=nod-1
	visit(node)=1
	for(i <- 0 to 4)
		d(i)=adj_list(node)(i)
	for(i <- 0 to n-1){
		if(min >= d(i) && visit(i)!=1) {
			min=d(i)
			k=i
			
		}
	}
	
	visit(k)=1
	for(i <- 0 to n-1)
		if(visit(i)!=1 && d(i) > d(k) + adj_list(k)(i))
			d(i)=d(k)+adj_list(k)(i)
	println("The shortest path from source to other nodes are:")
	for(i <- 0 to n-1)
		if(i!=node)
			if(min == 1000)
				println(node+1 +"	"+ i+1)
			else
				println(node+1 +"--->"+ (i+1) +"	"+ d(i))

}


shortestpath(1)

		
	
