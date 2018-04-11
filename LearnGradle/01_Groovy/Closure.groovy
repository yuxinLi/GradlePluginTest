
def aClosure = {
    int a,int b ->
        a + b
}

println aClosure(1 , 1)

def aa = {
    println " a closure"
}

aa()

def sayHello = {
    println "${it}"
}
println sayHello("jim")

def sayHello2 = {
    it ->
        "hello $it"
}
println sayHello2("li")

def noParams = {
    -> println " noParams"
}

noParams()

def bClosure = {
    a , b ->
        a + b
}

println bClosure(1 , 1)

