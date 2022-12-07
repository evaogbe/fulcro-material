(ns ogbe.fulcro.mui.customization.colors.deep-orange
  #?(:cljs (:require
            ["@mui/material/colors/deepOrange" :default js-deep-orange]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn deep-orange
  ([] #?(:cljs js-deep-orange))
  ([shade] #?(:cljs (gobj/get js-deep-orange shade))))
