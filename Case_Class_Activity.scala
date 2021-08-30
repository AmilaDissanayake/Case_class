object Case_Class_Activity {

  case class point(x:Int,y:Int){

    def +(p:point)=(this.x+p.x,this.y+p.y)
    def move(dx:Int,dy:Int)=(this.x+dx,this.y+dy)
    def distance(p:point)=(this.x-p.x,this.y-p.y)
    def invert()=(this.y,this.x)
  }

  def main(args: Array[String]): Unit ={
    val p1 = point(3,7)
    val p2 = point(2,3)

    println(p1)
    println(p2)
    println(p1+p2)
    println(p1.move(4,5))
    println(p1.distance(p2))
    println(p1.invert())
  }
}
