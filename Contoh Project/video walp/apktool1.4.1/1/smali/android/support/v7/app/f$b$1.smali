.class Landroid/support/v7/app/f$b$1;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/app/f$b;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/app/f$b;


# direct methods
.method constructor <init>(Landroid/support/v7/app/f$b;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/f$b$1;->a:Landroid/support/v7/app/f$b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/f$b$1;->a:Landroid/support/v7/app/f$b;

    invoke-virtual {v0}, Landroid/support/v7/app/f$b;->b()V

    return-void
.end method
