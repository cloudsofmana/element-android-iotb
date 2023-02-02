/*
 * Copyright (c) 2023 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.vector.app.features.roomprofile.polls.detail.ui

import android.content.Context
import im.vector.app.features.navigation.Navigator
import javax.inject.Inject

// TODO add unit tests
class RoomPollDetailNavigator @Inject constructor(
        private val navigator: Navigator,
) {

    fun goToTimelineEvent(context: Context, roomId: String, eventId: String) {
        navigator.openRoom(
                context = context,
                roomId = roomId,
                eventId = eventId,
                buildTask = true,
        )
    }
}
