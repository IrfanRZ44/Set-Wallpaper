package com.exomatik.irfanrz.setwalpaper.VideoWallpaper;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.service.wallpaper.WallpaperService;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.widget.Toast;

import com.exomatik.irfanrz.setwalpaper.R;

import java.io.IOException;

public class MovieLiveWallpaperService extends WallpaperService {
    private static final String TAG = "MovieLiveWallpaperService";
    public static String pathVideo;
    private boolean hasActiveHolder = false;

    @Override
    public Engine onCreateEngine() {
        return new MovieLiveWallpeperEngine();
    }

    class MySurfaceHolder implements SurfaceHolder{

        private SurfaceHolder surfaceHolder;

        public MySurfaceHolder(SurfaceHolder surfaceHolder) {
            this.surfaceHolder = surfaceHolder;
        }

        @Override
        public void addCallback(Callback callback) {
            surfaceHolder.addCallback(callback);
        }

        @Override
        public Surface getSurface() {
            return surfaceHolder.getSurface();
        }

        @Override
        public Rect getSurfaceFrame() {
            return surfaceHolder.getSurfaceFrame();
        }

        @Override
        public boolean isCreating() {
            return surfaceHolder.isCreating();
        }

        @Override
        public Canvas lockCanvas() {
            return surfaceHolder.lockCanvas();
        }

        @Override
        public Canvas lockCanvas(Rect dirty) {
            return surfaceHolder.lockCanvas(dirty);
        }

        @Override
        public void removeCallback(Callback callback) {
            surfaceHolder.removeCallback(callback);
        }

        @Override
        public void setFixedSize(int width, int height) {
            surfaceHolder.setFixedSize(width, height);
        }

        @Override
        public void setFormat(int format) {
            surfaceHolder.setFormat(format);
        }

        @Override
        public void setKeepScreenOn(boolean screenOn) {
            return;
        }

        @Override
        public void setSizeFromLayout() {
            surfaceHolder.setSizeFromLayout();
        }

        @Override
        public void setType(int type) {
            surfaceHolder.setType(type);
        }

        @Override
        public void unlockCanvasAndPost(Canvas canvas) {
            surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }

    class MovieLiveWallpeperEngine extends Engine implements SurfaceHolder.Callback, MediaPlayer.OnPreparedListener {

        private MediaPlayer mp;
        String permission = "Manifest.permission.WRITE_EXTERNAL_STORAGE";
        SurfaceHolder surfaceHolder;

        @Override
        public void surfaceCreated(SurfaceHolder holder) {
            this.surfaceHolder = holder;

            synchronized (this) {
                hasActiveHolder = true;
                this.notifyAll();
            }
//            play();
        }

        @Override
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

        }

        @Override
        public void surfaceDestroyed(SurfaceHolder holder) {
            synchronized (this) {
                hasActiveHolder = false;

                synchronized (this) {
                    this.notifyAll();
                }
            }
        }


        @SuppressLint("LongLogTag")
        @Override
        public void onCreate(SurfaceHolder holder) {
            super.onCreate(holder);

            holder.addCallback(this);
            holder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);

            mp = new MediaPlayer();
            try {
                mp = MediaPlayer.create(MovieLiveWallpaperService.this, R.raw.admob);
                mp.setDisplay(surfaceHolder);
//                mp.prepare();
                mp.start();

                Rect rect = surfaceHolder.getSurfaceFrame();
                Surface surface = surfaceHolder.getSurface();
                boolean create = surfaceHolder.isCreating();
                Canvas canvas = surfaceHolder.lockCanvas();
                Canvas canvas1 = surfaceHolder.lockCanvas(rect);
//                surfaceHolder.removeCallback(this);


                surfaceHolder.setFixedSize(200, 400);
                surfaceHolder.setFormat(1);
                surfaceHolder.setKeepScreenOn(true);
                surfaceHolder.setSizeFromLayout();
                surfaceHolder.setType(1);
                surfaceHolder.unlockCanvasAndPost(canvas);

                Log.e(TAG, "Bher");
            }catch (Exception e){
                Log.e(TAG, e.toString());
            }

            synchronized (this) {
                while (!hasActiveHolder) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        Log.e(TAG, "Errr 2");
                    }
                }

            }
            mp.setOnCompletionListener(new OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.stop();
                }
            });
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            if (mp != null) {
                mp.stop();
                mp.release();
            }
        }

        @Override
        public void onVisibilityChanged(boolean visible) {
            super.onVisibilityChanged(visible);
            if (visible) {
                play();
            }
        }

        @SuppressLint("LongLogTag")
        private void play() {
            if (mp.isPlaying()) {
                mp.stop();
            }
            try {
                mp.prepareAsync();
            } catch (IllegalArgumentException e) {
                Log.e(TAG, "error");
            } catch (SecurityException e) {
                Log.e(TAG, "error");
            } catch (IllegalStateException e) {
                Log.e(TAG, "error");
            }
        }

        @Override
        public void onPrepared(MediaPlayer mp) {
            mp.start();
        }
    }
}