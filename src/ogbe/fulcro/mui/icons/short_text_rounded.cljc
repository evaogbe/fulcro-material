(ns ogbe.fulcro.mui.icons.short-text-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ShortTextRounded" :default ShortTextRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-short-text-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShortTextRounded)))