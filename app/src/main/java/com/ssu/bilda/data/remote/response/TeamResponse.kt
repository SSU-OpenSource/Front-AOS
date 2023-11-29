package com.ssu.bilda.data.remote.response

import com.ssu.bilda.data.enums.CompleteStatus
import com.ssu.bilda.data.enums.RecruitmentStatus
import java.util.Date

data class TeamResponse(
    val teamId: Long,
    val leaderId: Long,
    val teamTitle: String,
    val subjectTitle: String,
    val leaderName: String,
    val recruitmentStatus: RecruitmentStatus,
    val completeStatus: CompleteStatus,
    val buildStartDate: Date,
    val members: List<UserResponse>
)