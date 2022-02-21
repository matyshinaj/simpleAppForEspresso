package ru.kkuzmichev.simpleappforespresso;

import androidx.annotation.NonNull;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class EspressoTests {

    @Rule
    @NonNull
    public ActivityScenarioRule<MainActivity> activityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void checkNegative() {
        onView(withId(R.id.text_home)).check(ViewAssertions.matches(withText("BLA BLA BLA")));
    }

    @Test
    public void checkPositive() {
        onView(withId(R.id.text_home)).check(ViewAssertions.matches(withText("This is home fragment")));
    }
}