package com.ssu.bilda.presentation.sign

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.ssu.bilda.R
import com.ssu.bilda.databinding.ActivitySignInBinding
import com.ssu.bilda.presentation.BnvActivity
import com.ssu.bilda.presentation.evaluate.ProjectStatusFragment
import com.ssu.bilda.presentation.mypage.ProfileFragment
import com.ssu.bilda.presentation.teambuild.TeamBuildWritingFragment

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySignInBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // 회원가입하러가기 버튼 클릭
        binding.tvSigninMove.setOnClickListener {
            val intent = Intent(this, TermsActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }

        // 로그인 버튼 클릭
        binding.btnSignin.setOnClickListener {
            val mIntent = Intent(this@SignInActivity, BnvActivity::class.java)
            startActivity(mIntent)
            finish()
        }

    }
}
