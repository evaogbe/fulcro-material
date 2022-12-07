(ns ogbe.fulcro.mui.icons.flaky-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FlakyRounded" :default FlakyRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flaky-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlakyRounded)))