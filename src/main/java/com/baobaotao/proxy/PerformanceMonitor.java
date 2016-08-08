package com.baobaotao.proxy;

/**
 * Created by Du on 16/6/5.
 */
public class PerformanceMonitor {
    private static ThreadLocal<MethodPerformance> performanceRecord =
            new ThreadLocal<MethodPerformance>();
    // 启动对某一目标方法的性能监视
    public static void begin(String method) {
        System.out.println("begin monitor...");
        MethodPerformance mp = new MethodPerformance(method);
        performanceRecord.set(mp);
    }

    public static void end() {
        System.out.println("end monitor...");
        MethodPerformance mp = performanceRecord.get();

        mp.printPerformance();
    }

}
