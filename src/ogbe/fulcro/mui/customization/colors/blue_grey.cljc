(ns ogbe.fulcro.mui.customization.colors.blue-grey
  #?(:cljs (:require
            ["@mui/material/colors/blueGrey" :default js-blue-grey]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn blue-grey
  ([] #?(:cljs js-blue-grey))
  ([shade] #?(:cljs (gobj/get js-blue-grey shade))))
