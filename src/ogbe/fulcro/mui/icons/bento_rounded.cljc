(ns ogbe.fulcro.mui.icons.bento-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BentoRounded" :default BentoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bento-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BentoRounded)))