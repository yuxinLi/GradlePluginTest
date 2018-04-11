

def map = ["key1":"value1" , "key2":"value2"]
println map.size()

map.forEach{
    key , value ->
        println "$key : $value"
}

println map."key1"
println map["key1"]

map."key4" = 'value 4'
println map["key4"]





//def lists= ['groovy' , 'gradle' ,'aaa']
//
//println lists.size()
//
//lists.each {
//    list -> println list
//}
//
//assert lists[0] == 'groovy'
//lists[100] = 11
//println lists.size()
//println lists[99]

