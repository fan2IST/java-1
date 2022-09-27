/*
 * @Author: fan2IST fanISTREC2DX@outlook.com
 * @Date: 2022-09-15 14:16:47
 * @LastEditors: fan2IST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-09-27 19:19:55
 * @FilePath: \java-1\d25\myinterfacempl.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d25;
@SuppressWarnings("unchecked")
public class myinterfacempl<T> implements Myinterface<T> {

    private T value;

    public myinterfacempl(T t) {
        this.value = t;
    }

    @Override
    public T getValue() {
        // TODO Auto-generated method stub
        return null;
    }

}
