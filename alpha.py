
import phonenumbers
from phonenumbers import geocoder
x = phonenumbers.parse("+442083661177", None)
y = phonenumbers.parse("+221771412725", "DK")
ch_number = phonenumbers.parse("+221771412725", "CH")
print(phonenumbers.format_number(x, phonenumbers.PhoneNumberFormat.NATIONAL))
print(phonenumbers.format_number(x, phonenumbers.PhoneNumberFormat.INTERNATIONAL))
print(phonenumbers.is_valid_number(x))
print(geocoder.description_for_number(ch_number, "de"))
print(geocoder.description_for_number(ch_number, "en"))
print(geocoder.country_name_for_number(ch_number,"fr"))

