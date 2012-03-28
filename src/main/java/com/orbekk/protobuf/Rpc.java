/**
 * Copyright 2012 Kjetil Ørbekk <kjetil.orbekk@gmail.com>
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
package com.orbekk.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcController;

public class Rpc implements RpcController {
    private String errorText = "";
    private boolean hasFailed;
    private boolean canceled;
    private List<RpcCallback<Object>> cancelNotificationListeners = null;
    
    public Rpc() {
    }
    
    public Rpc(Rpc other) {
        copyFrom(other);
    }

    public void copyFrom(Rpc other) {
        errorText = other.errorText;
        hasFailed = other.hasFailed;
        canceled = other.canceled;
        if (other.cancelNotificationListeners != null) {
            for (RpcCallback<Object> listener :
                    other.cancelNotificationListeners) {
                notifyOnCancel(listener);
            }
        }
    }
    
    public void writeTo(Data.Response.Builder response) {
        response.setHasFailed(hasFailed);
        response.setCanceled(canceled);
        response.setErrorText(errorText);
    }
    
    public void readFrom(Data.Response response) {
        hasFailed = response.getHasFailed();
        canceled = response.getCanceled();
        errorText = response.getErrorText();
    }
    
    @Override
    public String errorText() {
        return errorText;
    }

    public boolean isOk() {
        return !hasFailed && !canceled;
    }
    
    @Override
    public boolean failed() {
        return hasFailed;
    }

    @Override
    public boolean isCanceled() {
        return canceled;
    }

    @Override
    public void notifyOnCancel(RpcCallback<Object> listener) {
        if (cancelNotificationListeners == null) {
            cancelNotificationListeners =
                    new ArrayList<RpcCallback<Object>>();
        }
        cancelNotificationListeners.add(listener);
    }

    @Override
    public void reset() {
        copyFrom(new Rpc());
    }

    @Override
    public void setFailed(String message) {
        hasFailed = true;
        errorText = message;
    }
    
    public void cancel() {
        canceled = true;
        if (cancelNotificationListeners != null) {
            for (RpcCallback<Object> listener :
                    cancelNotificationListeners) {
                listener.run(null);
            }
        }
    }

    @Override
    public void startCancel() {
    }
}
