(ns ogbe.fulcro.mui.icons.four-krounded
  #?(:cljs (:require
            ["@mui/icons-material/FourKRounded" :default FourKRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-four-krounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FourKRounded)))