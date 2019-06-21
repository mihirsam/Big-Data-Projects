package master;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Reducer;

public class ReducerWC extends Reducer<Text, IntWritable, Text, IntWritable>
{
	public void reduce(Text key, Iterable<IntWritable> value, Context context) throws IOException, InterruptedException
	{
		int sum = 0;
		Iterator<IntWritable> itr = value.iterator();
		
		while(itr.hasNext())
		{
			sum = sum + itr.next().get();
		}
		context.write(key,  new IntWritable(sum));
	}
}
