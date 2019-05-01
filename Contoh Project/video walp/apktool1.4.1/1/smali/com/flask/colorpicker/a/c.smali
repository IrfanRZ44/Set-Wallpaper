.class public Lcom/flask/colorpicker/a/c;
.super Ljava/lang/Object;


# direct methods
.method public static a(Lcom/flask/colorpicker/ColorPickerView$a;)Lcom/flask/colorpicker/b/c;
    .locals 2

    sget-object v0, Lcom/flask/colorpicker/a/c$1;->a:[I

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "wrong WHEEL_TYPE"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Lcom/flask/colorpicker/b/e;

    invoke-direct {v0}, Lcom/flask/colorpicker/b/e;-><init>()V

    :goto_0
    return-object v0

    :pswitch_1
    new-instance v0, Lcom/flask/colorpicker/b/d;

    invoke-direct {v0}, Lcom/flask/colorpicker/b/d;-><init>()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
