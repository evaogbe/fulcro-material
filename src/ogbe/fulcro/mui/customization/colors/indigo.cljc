(ns ogbe.fulcro.mui.customization.colors.indigo
  #?(:cljs (:require
            ["@mui/material/colors/indigo" :default js-indigo]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn indigo
  ([] #?(:cljs js-indigo))
  ([shade] #?(:cljs (gobj/get js-indigo shade))))
