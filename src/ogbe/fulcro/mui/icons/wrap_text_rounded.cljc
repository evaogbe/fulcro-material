(ns ogbe.fulcro.mui.icons.wrap-text-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WrapTextRounded" :default WrapTextRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wrap-text-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WrapTextRounded)))