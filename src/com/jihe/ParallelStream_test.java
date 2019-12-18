package com.jihe;
import java.util.*;
import java.util.stream.Stream;
public class ParallelStream_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String>list=Arrays.asList("张三","李四","张小民","张阳");
		Stream<String>parallelStream=list.parallelStream();
		System.out.println(parallelStream.isParallel());
		Stream<String>stream=Stream.of("张三","李四","张小民","张阳");
		Stream<String>parallel=stream.parallel();
		System.out.println(parallel.isParallel());
	}

}
