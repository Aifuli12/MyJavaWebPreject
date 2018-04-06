package com.aifuli.common.common;

public class MessageSourceConstants {

    // 全局消息

    public static final String SUCCESS = "success";
    public static final String ERROR = "error";
    public static final String PRIMARY_KEY_ILLEGAL = "illegal.primary.key";
    public static final String NAME_DUPLICATE = "name.duplicate";
    public static final String CODE_DUPLICATE = "code.duplicate";
    public static final String CODE_NULL = "code.null";
    public static final String NAME_OR_CODE_DUPLICATE = "name.code.duplicate";
    public static final String TENANT_NOT_EXIST = "tenant.not.exist";
    public static final String TENANT_ENABLED_FALSE = "tenant.enabled.false";
    public static final String NAME_EMPTY = "name.empty";
    //非法的操作状态，需要重新授权或刷新页面
    public static final java.lang.String ILLEGAL_OPTION = "illegal.option";

    //登录相关消息
    public static final String USER_LOGIN_ERROR = "user.login.error";
    public static final String USER_LOGIN_PASSWORD_ERROR = "user.login.password.error";
    public static final String CERTIFICATE_INVALIDATION_MSG = "user.login.timeout";
    public static final String NO_PERMISSION_MSG = "user.no-permission";
    public static final String ORG_INFO_ERROR = "user.info.error";
    public static final String PARAM_ERROR = "param.error";

    //product 产品管理相关消息
    public static final String UNKNOWN_MATERIAL_TYPE = "unknown.material-type";

    public static final String UNKNOWN_MANUFACTURE_TYPE = "unknown.manufacture-type";

    public static final String UNKNOWN_SALES_TYPE = "unknown.sales-type";

    public static final String SPECIFICATION_STANDARD_DUPLICATE = "specification.standard.duplicate";

    public static final String SPECIFICATION_VALUES_ILLEGAL = "specification.illegal";

    public static final String BRAND_THERAPEUTIC_AREA_ALL_NULL="brand_therapeutic_area_all_null";

    // 医院管理相关消息

    public static final String HOSPITAL_NOT_FOUND = "hospital.notFound";

    public static final String HOSPITAL_NAME_DUPLICATE = "hospital.name.duplicate";

    public static final String HOSPITAL_CODE_DUPLICATE = "hospital.code.duplicate";

    public static final String HOSPITAL_LEVEL_NOT_FOUND = "hospital.level.notExist";

    public static final String HOSPITAL_LEVEL_NAME_WRONG = "hospital.level.illegal";

    public static final String HOSPITAL_RELATION_WRONG = "hospital.relation.exist";

    public static final String HOSPITAL_DEPARTMENT_DOCTOR_WRONG = "department.doctor.exist";

    public static final String HOSPITAL_DEPARTMENT_LEVEL2_WRONG = "department.level2.exist";

    // 区域管理相关消息

    public static final String REGION_PROVINCE_NOT_FOUND = "region.province.notFound";

    public static final String REGION_CITY_NOT_FOUND = "region.city.notFound";

    public static final String REGION_CITY_ILLEGAL = "region.city.illegal";

    public static final String REGION_CODE_DUPLICATE = "region.code.duplicate";


    // 人员管理

    public static final String EMPLOYEE_CODE_EXIST = "employee.code.duplicate";
    public static final String EMPLOYEE_USERNAME_EXIST = "employee.username.duplicate";
    public static final String EMPLOYEE_POSITION_EXISTS = "employee.position.duplicate";
    public static final String EMPLOYEE_ID_NOT_EXISTS = "employee.id.not.exist";
    public static final String EMPLOYEE_CODE_ILLEGAL = "employee.code.illegal";
    public static final String EMPLOYEE_NAME_ILLEGAL = "employee.name.illegal";


    // 岗位层级
    public static final String POSITION_TYPE_ID_NOT_EXISTS = "position-type.id.not.exist";
    public static final String POSITION_TYPE_CODE_EXISTS = "position-type.code.duplicate";
    public static final String POSITION_TYPE_HIERARCHY_WRONG = "position-type.hierarchy.wrong";
    public static final String POSITION_TYPE_EXIST_CHILD = "position-type.exist.child";

    // 存在启用状态的岗位
    // FIXME: 2017/3/31 当前岗位层级下存在岗位，是不是不允许做任何操作
    public static final String POSITION_TYPE_EXIST_ENABLED_POSITION = "position-type.exist.enabled.position";
    public static final String POSITION_TYPE_RELATION_REGION_EXIST = "position-type.relation.region.exist";
    public static final String POSITION_TYPE_RELATION_REGION_EXIST_DUPLICATE = "position-type.relation.region.exist" +
            ".duplicate";

    //region 部门管理

    public static final String DIVISION_CODE_EXISTS = "division.code.duplicate";
    public static final String DIVISION_CODE_FINAL = "division.code.final";
    public static final String DIVISION_NAME_EXISTS = "division.name.duplicate";

    //岗位
    public static final String POSITION_CODE_DUPLICATE = "position.code.duplicate";
    public static final String POSITION_NAME_DUPLICATE = "position.name.duplicate";
    public static final String POSITION_RDHP_REPEAT_ASSIGN = "position.rdhp.repeat.assign";
    public static final String IMPORT_POS_EMP_ILLEGAL = "import.position.employee.illegal";
    public static final String IMPORT_POS_PA_ILLEGAL = "import.position.parent-id.illegal";
    public static final String IMPORT_POS_BRAND_ILLEGAL = "import.position.brand-code.illegal";
    public static final String IMPORT_POS_ROLE_ILLEGAL = "import.position.role-code.illegal";
    public static final String IMPORT_POS_CODE_ILLEGAL = "import.position.code.illegal";
    public static final String IMPORT_POS_CODE_EMPTY = "import.position.code.empty";
    public static final String IMPORT_POS_NAME_EMPTY = "import.position.name.empty";
    public static final String IMPORT_POS_NAME_ILLEGAL = "import.position.name.illegal";
    public static final String IMPORT_POS_RELATE_EMP_EMPTY = "import.position.relate-emp.empty";
    public static final String IMPORT_POS_RELATE_EMP_ILLEGAL = "import.position.relate-emp.illegal";
    public static final String IMPORT_POS_CATEGORY_ILLEGAL = "import.position.category.illegal";

    /**
     * 存在下级岗位未被禁用
     */
    public static final String POSITION_SUB_ENABLED = "position.sub.enabled";

    /**
     * 存在上级岗未被启用
     */
    public static final String POSITION_PA_DISABLED = "position.pa.disabled";

    public static final String POSITION_MANAGE_CHANGE = "position.manage.change";

    //架构笨笨
    public static final String QUARTER_UNKOWN_ACTIVE = "quarter.active.unkown";


    //医生

    /**
     * 医生code重复
     */
    public static final String DOCTOR_CODE_IS_EXISTS = "doctor.code.duplicate";
    /**
     * 无法找到关联的医生
     */
    public static final String DOCTOR_ID_NOT_FOUND = "doctor.id.notFound";

    /**
     * 协防问卷
     */
    public static final String QUESTIONNAIRE_NAME_EXIST = "questionnaire.name.exist";
    public static final String QUESTIONNAIRE_NO_DELETE_DATA = "questionnaire.no.delete.data";
    public static final String QUESTIONNAIRE_NO_ENABLE_DATA = "questionnaire.no.enable.data";
    public static final String QUESTIONNAIRE_NO_DISABLE_DATA = "questionnaire.no.disable.data";
    public static final String QUESTIONNAIRE_NO_QUESTION = "questionnaire.no.question";
    public static final String QUESTION_TITLE_REPEAT = "question.title.repeat";
    public static final String QUESTION_TITLE_EXIST = "question.title.exist";

    /**
     * 区域设定
     */
    public static final String TERRITORY_SETTING_CONFIRM_DUPLICATE = "confirm.duplicate";

    /**
     * 销售权限
     */
    public static final String RDHP_SETTING_DUPLICATE = "rdhp.setting.duplicate";

    /*题库相关*/
    public static final String QUESTION_OPTION_NULL = "question.option.null";
    public static final String QUESTION_FILTER_ERROR = "question.filter.error";
    public static final String QUESTION_OPTION_NO_ANSWER = "question.option.no.answer";
    public static final String QUESTION_OPTION_MORE_THAN_ONE_ANSWER = "question.option.more.than.one.answer";
    public static final String QUESTION_OPTION_SHOULD_NONE = "question.option.should.none";
    public static final String QUESTION_OPTION_SHOULD_EQUAL_TWO = "question.option.should.equal.two";
    public static final String QUESTION_OPTION_SHOULD_NO_ANSWER = "question.option.should.no.answer";
    public static final String QUESTION_BANK_SHOULD_HAVE_SUBJECT = "question.bank.should.have.subject";
    public static final String QUESTION_BANK_NAME_EMPTY = "question.bank.name.empty";
    public static final String QUESTION_BANK_NAME_DUPLICATE = "question.bank.name.duplicate";
    public static final String QUESTION_ANSWER_HAS_WRONG_SOURCE = "question.answer.has.wrong.source";
    //营销活动相关
    public static final String CAMPAIGN_BEGINTIME_BEYOND = "campaign.begintime.beyond";
    public static final String CAMPAIGN_NAME_REPEAT = "campaign.name.repeat";

    //岗位核查
    public static final String POSITION_ASSIGN_UNFINISHED = "position.assign.unfinished";
    public static final String POSITION_ASSIGN_IS_NULL = "position.assign.is.null";
    //区域设定核查
    public static final java.lang.String SALES_UNIT_CHECK_FAIL = "sales-unit.check.fail";
    //空的输入流
    public static final String NULL_STREAM = "stream.empty.error";
    //上传文件的格式不正确
    public static final String ILLEGAL_FILE_TYPE = "illegal.file-type";
    //功能开关不允许该操作
    public static final String FUNCTION_SWITCH_NOT_ALLOWED = "function.switch.not.allowed";

    //region 租户平台相关常量

    public static final String TENANT_MENU_NOT_EXIST = "tenant.menu.not.exist";

    //endregion

    //region 文档库相关常量

    //文档库上传文件超出最大限制
    public static final String DOCUMENT_UPLOAD_OVER_MAX_SIZE = "document.upload.over.max.size";
    public static final String DOCUMENT_TYPE_INVALID = "document.type.invalid";
    public static final String DOCUMENT_NAME_ERROR = "document.name.error";
    public static final String DOCUMENT_NOT_EXIST = "document.not.exist";
    public static final String DOCUMENT_FOLDER_NOT_EXIST = "document.folder.not.exist";
    public static final String DOCUMENT_NAME_VALID = "document.name.valid";
    //文档库
    public static final String MUTI_MATERIAL_COVER_EMPTY = "multi-material.cover.empty";
    public static final String MATERIAL_TITLE_EMPTY = "material.title.empty";
    public static final String MATERIAL_CONTENT_EMPTY = "material.content.empty";
    public static final String DOCUMENT_TYPE_WRONG = "document.type.wrong";
    public static final String DOCUMENT_NAME_TOO_LONG = "document.name.too.long";
    public static final String CONTENT_TOO_LONG = "content.too.long";
    public static final String AUTHOR_TOO_LONG = "author.too.long";
    public static final String TITLE_TOO_LONG = "title.too.long";
    public static final String INTRODUCTION_TOO_LONG = "int.too.long";
    //endregion


    public static final String LABEL_PARENT_NOT_EQUAL_SELF="label.parent.not.equal.self";
    public static final String LABEL_PARENT_NOT_EQUAL_DESCENDANTS="label.parent.not.equal.descendants";


    //event
    public static final String LACK_AVAILABLE_CODE = "lack.available.code";

    //密码修改限制
    public static final String PASSWORD_CHANGE_ERROR = "password.change.error";

    //region 指标设定
    public static final String TERRITORY_SETTING_ERROR = "sales.territory.setting.error";
    //endregion
    /**
     * 根据属性名称动态获取判断唯一的常量信息
     *
     * @param property
     * @return
     */
    public static String getDuplicateMessage(String property) {
        switch (property) {
            case "name":
                return NAME_DUPLICATE;
            case "code":
                return CODE_DUPLICATE;
            default:
                return ERROR;
        }
    }
}
