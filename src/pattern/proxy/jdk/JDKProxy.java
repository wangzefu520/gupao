package pattern.proxy.jdk;

import pattern.proxy.People;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {
    /**
     * 保存被代理对象得引用
     */
    private People target;

    public Object getInstance(People target) {
        this.target = target;
        Class<? extends People> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        System.out.println("实际执行结果：" + invoke + " ,参数=== " + target + " : " + args);
        after();
        return invoke;
    }

    private void before(){
        System.out.println("我是代理类： 开始代理");
    }
    private void after(){
        System.out.println("代理完成");
    }
}
