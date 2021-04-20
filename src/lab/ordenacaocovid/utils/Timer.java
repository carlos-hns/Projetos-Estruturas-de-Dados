package lab.ordenacaocovid.utils;

public class Timer {

  private long temporaryInitialTime = 0;
  private long temporaryFinalTime = 0;

  private final long[] insertionTime = new long[3];
  private final long[] seletionTime = new long[3];
  private final long[] mergeTime = new long[3];
  private final long[] quickTime = new long[3];
  private final long[] quickMedTime = new long[3];
  private final long[] countingTime = new long[3];
  private final long[] heapTime = new long[3];

  public void setTemporaryInitialTime(){
    this.temporaryInitialTime = System.currentTimeMillis();
  }

  public void setTemporaryFinalTime() {
    this.temporaryFinalTime = System.currentTimeMillis() - getTemporaryInitialTime();
  }

  public void setInsertionTime(int index, long insertionTime) {
    this.insertionTime[index] = insertionTime;
  }

  public void setSeletionTime(int index, long seletionTime) {
    this.seletionTime[index] = seletionTime;
  }
  
  public void setMergeTime(int index, long mergeTime) {
    this.mergeTime[index] = mergeTime; 
  }

  public void setQuickTime(int index, long quickTime) {
    this.quickTime[index] = quickTime; 
  }

  public void setQUickMedTime(int index, long quickMedTime) {
    this.quickMedTime[index] = quickMedTime; 
  }

  public void setCountingTime(int index, long countingTime) {
    this.countingTime[index] = countingTime; 
  }

  public void setHeapTime(int index, long heapTime) {
    this.heapTime[index] = heapTime; 
  }

   public long getTemporaryInitialTime() {
    return temporaryInitialTime;
  }

  public long getTemporaryFinalTime() {
    return temporaryFinalTime;
  }
  
  public long getSeletionTime(int index) {
    return seletionTime[index];
  }

  public long getInsertionTime(int index) {
    return insertionTime[index];
  }

  public long getMergeTime(int index) {
    return mergeTime[index];
  }
  
  public long getQuickTime(int index) {
    return quickTime[index];
  }
  
  public long getQuickMedTime(int index) {
    return quickMedTime[index];
  }
  
  public long getCountingTime(int index) {
    return countingTime[index];
  }
  
  public long getHeapTime(int index) {
    return heapTime[index];
  }
  
}
