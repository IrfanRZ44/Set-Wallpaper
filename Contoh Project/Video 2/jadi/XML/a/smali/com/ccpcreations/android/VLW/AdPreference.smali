.class public Lcom/ccpcreations/android/VLW/AdPreference;
.super Landroid/preference/Preference;
.source "AdPreference.java"


# instance fields
.field lla:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 18
    invoke-direct {p0, p1, p2}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/ccpcreations/android/VLW/AdPreference;->lla:Landroid/widget/LinearLayout;

    .line 21
    new-instance v0, Lcom/admob/android/ads/AdView;

    invoke-direct {v0, p1, p2}, Lcom/admob/android/ads/AdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    .local v0, adView:Lcom/admob/android/ads/AdView;
    iget-object v2, p0, Lcom/ccpcreations/android/VLW/AdPreference;->lla:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 24
    const/4 v2, 0x1

    const/high16 v3, 0x4240

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    invoke-static {v2, v3, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    .line 25
    .local v1, px:F
    iget-object v2, p0, Lcom/ccpcreations/android/VLW/AdPreference;->lla:Landroid/widget/LinearLayout;

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setMinimumHeight(I)V

    .line 26
    return-void
.end method


# virtual methods
.method protected onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1
    .parameter "parent"

    .prologue
    .line 30
    invoke-super {p0, p1}, Landroid/preference/Preference;->onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;

    .line 31
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/AdPreference;->lla:Landroid/widget/LinearLayout;

    return-object v0
.end method
