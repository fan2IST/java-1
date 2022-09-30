/*
 * @Author: fanIST fanISTREC2DX@outlook.com
 * @Date: 2022-09-13 18:51:31
 * @LastEditors: fanIST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-09-30 08:38:10
 * @FilePath: \java-1\d22hashmap\d22treemap.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d22hashmap;

import java.util.HashMap;
@SuppressWarnings("unchecked")
public class d22treemap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java", "hello");
        map.put("java", "world");
        map.put("java", "world");
        map.put("java", "javase");
        map.put("java", "javame");
        map.put("java", "javae");
        map.put("java", "javae");
        map.put("java", "wor");
        map.put("java", "w");
        map.put("java", "worl");
        map.put("java", "javae2");
        System.out.println(map);
    }

    class User implements Comparable {

        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Object o) {
            // TODO Auto-generated method stub
            User user = (User) o;
            if (this.id > user.id) {
                return 1;
            } else if (this.id == user.id) {
                return 0;
            } else {
                return -1;
            }

        }
    }

}
