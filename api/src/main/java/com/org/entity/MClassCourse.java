package com.org.entity;

        import com.baomidou.mybatisplus.annotation.TableName;
        import java.time.LocalDateTime;
        import com.baomidou.mybatisplus.annotation.FieldFill;
        import com.baomidou.mybatisplus.annotation.TableField;
        import java.io.Serializable;
                import lombok.Data;
    import lombok.EqualsAndHashCode;
            import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * <p>
 * 班级课程关联表

 * </p>
 *
 * @author Jie
 * @since 2022-11-09
 */
@Data
        @EqualsAndHashCode(callSuper = false)
        @TableName("m_class_course")
public class MClassCourse implements Serializable {

private static final long serialVersionUID = 1L;

                        /**
         * 课程id
         */
                    @TableField("cou_id")
                            private Long couId;

                        /**
         * 班级id
         */
                    @TableField("class_id")
                            private Long classId;

                        /**
         * 加入时间
         */
                                        @TableField(value = "join_date", fill = FieldFill.INSERT)
                                        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime joinDate;


        }

