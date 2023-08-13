package team.redrock.rain.xuexin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

/**
 * Created by rain on 2023/8/13
 **/
object XuexinCertification {

    suspend fun get(code: String): XuexinData? {
        val document = withContext(Dispatchers.IO) {
            Jsoup.connect("https://www.chsi.com.cn/xlcx/bg.do?vcode=$code").get()
        }
        val builder = XuexinData.Builder()
        document.select(".report-info-item").forEach { element ->
            val value = element.select(".value").text()
            when (element.select(".label").text()) {
                "姓名" -> builder.name(value)
                "性别" -> builder.gender(value)
                "出生日期" -> builder.birthday(value)
                "民族" -> builder.ethnicity(value)
                "证件号码" -> builder.citizenId(value)
                "院校" -> builder.school(value)
                "层次" -> builder.educationLevel(value)
                "院系" -> builder.department(value)
                "班级" -> builder.classId(value)
                "专业" -> builder.major(value)
                "学号" -> builder.stuId(value)
                "学制" -> builder.programLength(value)
                "类型" -> builder.type(value)
                "形式" -> builder.format(value)
                "入学日期" -> builder.enrollmentDate(value)
                "学籍状态" -> builder.status(value)
            }
        }
        return runCatching { builder.build() }.getOrNull()
    }
}