(ns ogbe.fulcro.mui.customization.colors.light-blue
  #?(:cljs (:require
            ["@mui/material/colors/lightBlue" :default js-light-blue]
            [goog.object :as gobj])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn light-blue
  ([] #?(:cljs js-light-blue))
  ([shade] #?(:cljs (gobj/get js-light-blue shade))))
