(ns ogbe.fulcro.mui.customization.colors.pink
  #?(:cljs (:require
            ["@mui/material/colors/pink" :default js-pink]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn pink
  ([] #?(:cljs js-pink))
  ([shade] #?(:cljs (gobj/get js-pink shade))))
