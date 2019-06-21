package master;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Reducer;

public class ReducerTC extends Reducer<Text, IntWritable, Text, IntWritable>
{
	public void reduce(Text key, Iterable<IntWritable> value, Context context) throws IOException, InterruptedException
	{
		int maxTemp = 0, temp;
		
		Iterator<IntWritable> itr = value.iterator();
		
		while(itr.hasNext())
		{
			temp = itr.next().get();

			if (maxTemp < temp)
			{
				maxTemp = temp;
			}
		}
		context.write(key,  new IntWritable(maxTemp));
	}
}
