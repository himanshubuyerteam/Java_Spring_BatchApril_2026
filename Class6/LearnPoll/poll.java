package LearnPoll;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class poll {
    public static void main(String[] args) {
        ThreadPoolExecutor obj = new ThreadPoolExecutor(2, 
            4, 
            10,
            TimeUnit.MINUTES,
            new ArrayBlockingQueue<>(2),
            new CustomThreadFactory(),
            new CustomRejection()
        );

        for(int i=1;i<=8;i++)
        {
            int taskId = i;
            obj.submit(()->{
                try{
                    Thread.sleep(1000);
                }catch(Exception e)
                {

                }
                System.out.println("Task processed-TASK ID "+taskId+"--by "+Thread.currentThread().getName());
            });
        }

        obj.shutdown();

        
    }
}


class CustomThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread t =new Thread(r);
        return t;
    }
}

class CustomRejection implements RejectedExecutionHandler{
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Thread is Rejected");
    }
}