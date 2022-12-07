(ns ogbe.fulcro.mui.icons.short-text
  #?(:cljs (:require
            ["@mui/icons-material/ShortText" :default ShortText]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-short-text
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShortText)))