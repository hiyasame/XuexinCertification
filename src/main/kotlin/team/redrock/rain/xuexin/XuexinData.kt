package team.redrock.rain.xuexin

/**
 * Created by rain on 2023/8/13
 **/
data class XuexinData(
    val name: String,
    val gender: String,
    val birthday: String,
    val ethnicity: String,
    val citizenId: String,
    val school: String,
    val educationLevel: String,
    val department: String,
    val classId: String,
    val major: String,
    val stuId: String,
    // 学制
    val programLength: String,
    val type: String,
    // 形式
    val format: String,
    // 入学日期
    val enrollmentDate: String,
    // 学籍状态
    val status: String
) {
    class Builder {
        private var name: String? = null
        private var gender: String? = null
        private var birthday: String? = null
        private var ethnicity: String? = null
        private var citizenId: String? = null
        private var school: String? = null
        private var educationLevel: String? = null
        private var department: String? = null
        private var classId: String? = null
        private var major: String? = null
        private var stuId: String? = null
        private var programLength: String? = null
        private var type: String? = null
        private var format: String? = null
        private var enrollmentDate: String? = null
        private var status: String? = null

        fun name(name: String): Builder {
            this.name = name
            return this
        }

        fun gender(gender: String): Builder {
            this.gender = gender
            return this
        }

        fun birthday(birthday: String): Builder {
            this.birthday = birthday
            return this
        }

        fun ethnicity(ethnicity: String): Builder {
            this.ethnicity = ethnicity
            return this
        }

        fun citizenId(citizenId: String): Builder {
            this.citizenId = citizenId
            return this
        }

        fun school(school: String): Builder {
            this.school = school
            return this
        }
        fun educationLevel(educationLevel: String): Builder {
            this.educationLevel = educationLevel
            return this
        }

        fun department(department: String): Builder {
            this.department = department
            return this
        }

        fun classId(classId: String): Builder {
            this.classId = classId
            return this
        }

        fun major(major: String): Builder {
            this.major = major
            return this
        }

        fun stuId(stuId: String): Builder {
            this.stuId = stuId
            return this
        }

        fun programLength(programLength: String): Builder {
            this.programLength = programLength
            return this
        }

        fun type(type: String): Builder {
            this.type = type
            return this
        }

        fun format(format: String): Builder {
            this.format = format
            return this
        }

        fun enrollmentDate(enrollmentDate: String): Builder {
            this.enrollmentDate = enrollmentDate
            return this
        }

        fun status(status: String): Builder {
            this.status = status
            return this
        }

        fun build(): XuexinData {
            return XuexinData(
                name ?: throw IllegalArgumentException("name is null"),
                gender ?: throw IllegalArgumentException("gender is null"),
                birthday ?: throw IllegalArgumentException("birthday is null"),
                ethnicity ?: throw IllegalArgumentException("ethnicity is null"),
                citizenId ?: throw IllegalArgumentException("citizenId is null"),
                school ?: throw IllegalArgumentException("school is null"),
                educationLevel ?: throw IllegalArgumentException("educationLevel is null"),
                department ?: throw IllegalArgumentException("department is null"),
                classId ?: throw IllegalArgumentException("classId is null"),
                major ?: throw IllegalArgumentException("major is null"),
                stuId ?: throw IllegalArgumentException("stuId is null"),
                programLength ?: throw IllegalArgumentException("programLength is null"),
                type ?: throw IllegalArgumentException("type is null"),
                format ?: throw IllegalArgumentException("format is null"),
                enrollmentDate ?: throw IllegalArgumentException("enrollmentDate is null"),
                status ?: throw IllegalArgumentException("status is null")
            )
        }
    }
}


