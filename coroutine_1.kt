import kotlinx.coroutines.*
fun main()=runBlocking{ //this:coroutine scope
    launch{
        delay(1000L) //non-blockingdelay for 1 second
        println("world") //print after delay
    }
    
    println("Hello") //main coroutine continues while previous one is delayed
}

/*
A coroutine is an instance of suspendable computation. 
It is conceptually similar to a thread, in the sense that it takes a block of code to run that works concurrently with the rest of the code. 
However, a coroutine is not bound to any particular thread. It may suspend its execution in one thread and resume in another one.
*/


/*
launch is a coroutine builder. 
It launches a new coroutine concurrently with the rest of the code, which continues to work independently. 
That's why Hello has been printed first.
*/


/*
delay is a special suspending function. It suspends the coroutine for a specific time. 
Suspending a coroutine does not block the underlying thread, but allows other coroutines to run and use the underlying thread for their code.
*/

/*
runBlocking is also a coroutine builder that bridges the non-coroutine world of a regular fun main() and the code with coroutines inside of runBlocking { ... } 
curly braces. This is highlighted in an IDE by this: CoroutineScope hint right after the runBlocking opening curly brace.
*/

