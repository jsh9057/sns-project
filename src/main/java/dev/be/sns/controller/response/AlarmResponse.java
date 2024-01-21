package dev.be.sns.controller.response;

import dev.be.sns.model.Alarm;
import dev.be.sns.model.AlarmArgs;
import dev.be.sns.model.AlarmType;
import dev.be.sns.model.User;
import dev.be.sns.model.entity.AlarmEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class AlarmResponse {
    private Integer id;
    private AlarmType alarmType;
    private AlarmArgs alarmArgs;
    private String text;
    private Timestamp registeredAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    public static AlarmResponse fromAlarm(Alarm alarm) {
        return new AlarmResponse(
                alarm.getId(),
                alarm.getAlarmType(),
                alarm.getArgs(),
                alarm.getAlarmType().getAlarmText(),
                alarm.getRegisteredAt(),
                alarm.getUpdatedAt(),
                alarm.getDeletedAt()
        );
    }
}
