public class PrintTask implements Runnable {
       private final char threadChar;

       public PrintTask(char threadChar) {
              this.threadChar = threadChar;
       }

       @Override
       public void run() {
              // Task
              for (int i = 1; i <= 10; i++) {
                     System.out.printf("%d%c \n", i,threadChar);
              }
              System.out.printf("%s %c :-  Task is completed ", Thread.currentThread().getName(),threadChar);

       }
}