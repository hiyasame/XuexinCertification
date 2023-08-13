# XuexinCertification

通过学信网在线验证来验证学生学校身份，抒发森林验证用户身份的一种可选方案

## 如何使用

~~~kotlin
suspend fun main() {
    val data = XuexinCertification.get("A23QGWX5RXXXXBBS")
    // data != null 时说明该验证码有效
    if (data != null) {
        println(data.school)
    }
}
~~~