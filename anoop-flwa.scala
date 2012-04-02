var IN:Int =100
var n:Int=6
var weight= Array(Array(0,1,3,IN,1,4),
		Array(1,0,1,IN,2,IN),
		Array(3,1,0,3,IN,IN),
		Array(IN,IN,3,0,1,2),
		Array(1,2,IN,1,0,2),
		Array(4,IN,IN,2,2,0))
def min(x:Int,y:Int) : Int={
	return if(x<y) x else y
}
for(k<-0 to n-1 ) 
	for(i<-0 to n-1) 
		for(j<- 0 to n-1) 
			weight(i)(j)=min(weight(i)(j), weight(i)(k) + weight(k)(j))


println("\nAll pair shortest path matrix is :")
for(i<- 0 to n-1){
	for(j<-0 to n-1)
		print(weight(i)(j)+"\t")
	print("\n")
}
print("\nAll Pair Shortest Path\n")
for(i<-0 to n-1){
	for(j<-0 to n-1)
		println((i+1)+"---->"+(j+1)+"\t"+ weight(i)(j))	
	print("\n")
}
