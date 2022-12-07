(ns ogbe.fulcro.mui.customization.colors.grey
  #?(:cljs (:require
            ["@mui/material/colors/grey" :default js-grey]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn grey
  ([] #?(:cljs js-grey))
  ([shade] #?(:cljs (gobj/get js-grey shade))))
