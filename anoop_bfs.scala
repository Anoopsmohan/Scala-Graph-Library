var visit= Array(0,0,0,0,0,0,0)
var n:Int =7
var nodes=Array(1,2,3,4,5,6,7)


var adj_list= Array(Array(0,1,1,1,0,0,0),
		Array(1,0,0,0,0,0,0),
		Array(1,0,0,0,0,1,0),
		Array(1,0,0,0,1,0,0),
		Array(0,0,0,1,0,0,0),
		Array(0,0,1,0,0,0,1),
		Array(0,0,0,0,0,1,0))


class Queue {
	var front=0
	var rear= -1
	var max=500
	var qu_eue=new Array[Int](max)
	for(i <- 0 to max-1) 
		qu_eue(i)=0

	def qinsert(x:Int): Unit= {
		rear+=1
		qu_eue(rear)=x
	}

	def qremove(): Int= {
		
		var num=qu_eue(front)
		if(front == rear){
			front=0
			rear= -1
		}
		else
			front+=1
		return num
	}
	def isempty(): Int= {
		if(front > rear)
			return 1
		else
			return 0
	}
}




println("\n\t\tBREADTH FIRST SEARCH\n")
println("\t\t********************")
println("\n\nVisited nodes\n")

def bfs(nod:Int) {
	var node=nod
	var q= new Queue()
	visit(node)=1
	print(nodes(node) + " ")
	while(1>0){
		for(i<-1 to n-1){
			if(adj_list(node)(i)!=0 && visit(i) == 0){
				visit(i)=1
				print(nodes(i)+ " ")
				q.qinsert(i)
			}
		}
		if(q.isempty >0 )
			return
		else
			node=q.qremove()
	}
}

bfs(0)
print("\n")   
