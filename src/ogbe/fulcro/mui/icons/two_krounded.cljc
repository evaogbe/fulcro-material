(ns ogbe.fulcro.mui.icons.two-krounded
  #?(:cljs (:require
            ["@mui/icons-material/TwoKRounded" :default TwoKRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-two-krounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TwoKRounded)))