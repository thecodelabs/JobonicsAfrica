# -*- coding: utf-8 -*-
# Generated by Django 1.11.2 on 2017-11-22 14:31
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('jobonicUsers', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='user',
            name='email_address',
            field=models.CharField(default='', max_length=200),
        ),
    ]
