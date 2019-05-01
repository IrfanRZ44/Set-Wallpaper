.class public final Landroid/support/v4/widget/m;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/widget/m$c;,
        Landroid/support/v4/widget/m$b;,
        Landroid/support/v4/widget/m$a;,
        Landroid/support/v4/widget/m$d;
    }
.end annotation


# static fields
.field static final a:Landroid/support/v4/widget/m$d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/widget/m$c;

    invoke-direct {v0}, Landroid/support/v4/widget/m$c;-><init>()V

    sput-object v0, Landroid/support/v4/widget/m;->a:Landroid/support/v4/widget/m$d;

    :goto_0
    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/widget/m$b;

    invoke-direct {v0}, Landroid/support/v4/widget/m$b;-><init>()V

    sput-object v0, Landroid/support/v4/widget/m;->a:Landroid/support/v4/widget/m$d;

    goto :goto_0

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    new-instance v0, Landroid/support/v4/widget/m$a;

    invoke-direct {v0}, Landroid/support/v4/widget/m$a;-><init>()V

    sput-object v0, Landroid/support/v4/widget/m;->a:Landroid/support/v4/widget/m$d;

    goto :goto_0

    :cond_2
    new-instance v0, Landroid/support/v4/widget/m$d;

    invoke-direct {v0}, Landroid/support/v4/widget/m$d;-><init>()V

    sput-object v0, Landroid/support/v4/widget/m;->a:Landroid/support/v4/widget/m$d;

    goto :goto_0
.end method

.method public static a(Landroid/widget/PopupWindow;I)V
    .locals 1

    sget-object v0, Landroid/support/v4/widget/m;->a:Landroid/support/v4/widget/m$d;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/widget/m$d;->a(Landroid/widget/PopupWindow;I)V

    return-void
.end method

.method public static a(Landroid/widget/PopupWindow;Landroid/view/View;III)V
    .locals 6

    sget-object v0, Landroid/support/v4/widget/m;->a:Landroid/support/v4/widget/m$d;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/widget/m$d;->a(Landroid/widget/PopupWindow;Landroid/view/View;III)V

    return-void
.end method

.method public static a(Landroid/widget/PopupWindow;Z)V
    .locals 1

    sget-object v0, Landroid/support/v4/widget/m;->a:Landroid/support/v4/widget/m$d;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/widget/m$d;->a(Landroid/widget/PopupWindow;Z)V

    return-void
.end method
