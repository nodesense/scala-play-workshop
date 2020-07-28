# FEEDBACK


Akka basics to be included - 2 hrs



# RECAP

Use case for Option
        Workaround on exception - better design
        
        Option 
            Some value - Good value
            None - nothing
            
Use case for Either
        Success Result
        Negative Result
        
        select * from somehting whre id = someid;
        
        1 record - Right (200, OK actual result) - good result
        0 record - Left (404, Not Found) - bad result
                   Exception/Throwable - up to the programmer
    
Use case for Try [Success, Failure]

         Success - Good
         Failure - Throwable -- Java Exception
        
----

Controller
    action listProducts
                val results = dao.listProduct(id)
                        product available - 200
                        product not available - 404
                        or db error - 500 exception/programming exception
                        
                        Try [Either]
                                Either - Right, Left
                                    Right - 200
                                    Left - 404
                                    
                        Failure 
                                DB Error - throwable
                                
