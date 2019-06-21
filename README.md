# 1. Java Practicle
## About
> Basic project to revise **Exception Handling** and **Java Collections**.

## Topics Covered
1. **Exception Handling**
    - Checked Exceptions
    - Unchecked Exceptions
    - User Defined Exceptions
    - Throws
2. **Collections**
    - ArrayList
    - Map
      - Hash Map
      - Linked Hash Map
      - Tree Map
    - Vector
    - User Defined ArrayList
    - String Tokenizer
      
## Tools
- [Eclipse](https://www.eclipse.org/) - Java IDE

---

# 2. Maximum Temperature
## About
> Basic project on **Hadoop** framework for finding the maximum temperature from given text file.

## Enviroment
- [Cloudera v5.x](https://www.cloudera.com/) - Operating System 
- [Hadoop](https://hadoop.apache.org/) - Framework

## Tools
- [Eclipse](https://www.eclipse.org/) - Java IDE

## Models
- [Hadoop - MapReduce](https://www.tutorialspoint.com/hadoop/hadoop_mapreduce.htm)

## Important Commands
```
hadoop fs -mkdir MaxTemp
hadoop fs -put txt_file_path MaxTemp
hadoop fs -cat MaxTemp/txt_file_name
hadoop jar jar_file_path MaxTemp/txt_file_name MaxTempOut
hadoop fs -cat MaxTempOut/part-r-00000
```
---

# 3. Word Count
## About
> Basic project on **Hadoop** framework for finding the count of each word in a text file.

## Enviroment
- [Cloudera v5.x](https://www.cloudera.com/) - Operating System 
- [Hadoop](https://hadoop.apache.org/) - Framework

## Tools
- [Eclipse](https://www.eclipse.org/) - Java IDE

## Models
- [Hadoop - MapReduce](https://www.tutorialspoint.com/hadoop/hadoop_mapreduce.htm)

## Important Commands
```
hadoop fs -mkdir WordCount
hadoop fs -put txt_file_path WordCount
hadoop fs -cat WordCount/txt_file_name
hadoop jar jar_file_path WordCount/txt_file_name WordCountOut
hadoop fs -cat WordCountOut/part-r-00000
```
---
