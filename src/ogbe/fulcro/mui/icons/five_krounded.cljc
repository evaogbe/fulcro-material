(ns ogbe.fulcro.mui.icons.five-krounded
  #?(:cljs (:require
            ["@mui/icons-material/FiveKRounded" :default FiveKRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-five-krounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FiveKRounded)))