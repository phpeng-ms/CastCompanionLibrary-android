/*
 * Copyright (C) 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.libraries.cast.companionlibrary.widgets;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.libraries.cast.companionlibrary.widgets.MiniController.OnMiniControllerChangedListener;

import android.graphics.Bitmap;
import android.net.Uri;

/**
 * An interface to abstract {@link MiniController} so that other components can also control the
 * MiniControllers. Clients should code against this interface when they want to control the
 * provided {@link MiniController} or other custom implementations.
 */
public interface IMiniController {

    /**
     * Sets the uri for the album art
     */
    public void setIcon(Uri uri);

    /**
     * Sets the bitmap for the album art
     */
    public void setIcon(Bitmap bitmap);

    /**
     * Sets the title
     */
    public void setTitle(String title);

    /**
     * Sets the subtitle
     */
    public void setSubtitle(String subtitle);

    /**
     * Sets the playback state, and the idleReason (this is only reliable when the state is idle).
     * Values that can be passed to this method are from {@link MediaStatus}
     */
    public void setPlaybackStatus(int state, int idleReason);

    /**
     * Sets whether this component should be visible or hidden.
     */
    public void setVisibility(int visibility);

    /**
     * Returns the visibility state of this widget
     */
    public boolean isVisible();

    /**
     * Assigns a {@link OnMiniControllerChangedListener} listener to be notified of the changes in
     * the mini controller
     */
    public void setOnMiniControllerChangedListener(OnMiniControllerChangedListener listener);

    /**
     * Sets the type of stream. <code>streamType</code> can be {@link MediaInfo#STREAM_TYPE_LIVE}
     * or {@link MediaInfo#STREAM_TYPE_BUFFERED}
     */
    public void setStreamType(int streamType);

}
