package com.exomatik.irfanrz.setwalpaper.VideoWallpaper;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.service.wallpaper.WallpaperService;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;

import com.exomatik.irfanrz.setwalpaper.R;

public class MovieLiveWallpaperService extends WallpaperService {
    private static final String TAG = "MovieLiveWallpaperService";
    public static String pathVideo;

    @Override
    public Engine onCreateEngine() {
        return new MovieLiveWallpeperEngine();
    }

    class MovieLiveWallpeperEngine extends Engine implements SurfaceHolder, SurfaceHolder.Callback {

        private MediaPlayer mp;
        private SurfaceHolder surfaceHolder;

//		public MySurfaceHolder(SurfaceHolder surfaceHolder) {
//			this.surfaceHolder = surfaceHolder;
//		}

        @SuppressLint("LongLogTag")
        @Override
        public void onCreate(SurfaceHolder holder) {
            super.onCreate(holder);

            holder.addCallback(this);
            this.surfaceHolder = holder;
            holder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);

//            mp.setDisplay(holder);
//            mp.setOnPreparedListener(new OnPreparedListener() {
//                @Override
//                public void onPrepared(MediaPlayer mp) {
//                    mp.start();
//                }
//            });
            try {
//				mp.setDataSource(MovieLiveWallpaperService.this, Uri
//				        .parse(pathVideo));
//                mp = MediaPlayer.create(MovieLiveWallpaperService.this, R.raw.admob);
//                mp.start();
            } catch (Exception e) {
                Log.e(TAG, "error");
            }
//            mp.setOnCompletionListener(new OnCompletionListener() {
//                @Override
//                public void onCompletion(MediaPlayer mp) {
//                    mp.stop();
//                }
//            });
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
        public void surfaceCreated(SurfaceHolder holder) {

            this.surfaceHolder = holder;

            synchronized (this) {
//				hasActiveHolder = true;
                this.notifyAll();

                mp = new MediaPlayer();
//           holder.setKeepScreenOn(false);

//            mp.setDisplay(holder);
                mp = MediaPlayer.create(MovieLiveWallpaperService.this, R.raw.admob);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.setVolume(50, 50);
                mp.start();
            }
//            play();
        }

        @Override
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

        }

        @Override
        public void surfaceDestroyed(SurfaceHolder holder) {
            synchronized (this) {
//				hasActiveHolder = false;

                synchronized (this) {
                    this.notifyAll();
                }
            }
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
            screenOn = false;
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

//		@Override
//		public void surfaceCreated(SurfaceHolder holder) {
//
//		}
//
//		@Override
//		public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
//
//		}
//
//		@Override
//		public void surfaceDestroyed(SurfaceHolder holder) {
//
//		}
    }
}