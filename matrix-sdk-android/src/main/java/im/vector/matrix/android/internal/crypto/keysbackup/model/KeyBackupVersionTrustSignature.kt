/*
 * Copyright 2018 New Vector Ltd
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

package im.vector.matrix.android.internal.crypto.keysbackup.model

import im.vector.matrix.android.internal.crypto.model.MXDeviceInfo

/**
 * A signature in a the `KeyBackupVersionTrust` object.
 */
class KeyBackupVersionTrustSignature {

    /**
     * The device that signed the backup version.
     */
    var device: MXDeviceInfo? = null

    /**
     *Flag to indicate the signature from this device is valid.
     */
    var valid = false
}
