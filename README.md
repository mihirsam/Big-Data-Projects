# Maximum Temperature
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
