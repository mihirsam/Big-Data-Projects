package master;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MapperWC extends Mapper<LongWritable, Text, Text, IntWritable>
{
	private Text word = new Text();
	private IntWritable one = new IntWritable(1);
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	{
		StringTokenizer str = new StringTokenizer(value.toString(), ",");
		
		while(str.hasMoreElements())
		{
			// String msg = str.nextElement().toString(); 
			String msg = (String) str.nextElement();
			word.set(msg);
			context.write(word, one);
		}
	}
}
