case class Point(var x: Int, var y: Int) 
{
    def add(a:Point) = new Point(this.x + a.x, this.y + a.y) // add two points.
    //We create an object by prefixing an application of theconstructor of the class with the operator 'new'.

    def move(x:Int, y:Int):Unit = 
    {
        this.x = this.x + x // increase the value of x coordinates of the point by some value
        this.y = this.y + y // increase the value of y coordinates of the point by some value
    }

    def distance(a:Point) : Double = 
    {
        var x:Int = this.x - a.x // calculate the distance between two x coordinates 
        var y:Int = this.y - a.y // calculate the distance between two y coordinates
        var distance: Int = x*x + y*y // according to pythegorous theorem, the distance between two points => distance*distance=(x)*(x)+(y)*(y).
        scala.math.sqrt(distance)// calculate the distance between two points => sqrt((x)*(x)+(y)*(y)).
    }

    def invert() :Unit =  
    {
        var temporeryvar = this.x // move the value of x to temporeryvar variable. 
        this.x = this.y // move the value of y to x variable.
        this.y = temporeryvar // Then move the value of y to temporeryvar to y variable.
    }
}

object caseclassPoint extends App 
{
    var a = Point(1,2)
    var b = Point(4,10)
    printf("\n")

    println("The result of the addition of two points a and b:"+a.add(b)) // add a and b points.

    a.move(x = 2, y = 4)// move from these.
    println("The result of moving coordinates from (2,4):"+a)
    
    var c = a.distance(b)// calculate distance between a and b points.
    println("The distance between a and b points:"+c)

    a.invert() // switch the coordinates x & y.
    println("The final output after inverting:"+a) 
    
    printf("\n")
}