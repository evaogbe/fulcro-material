(ns ogbe.fulcro.mui.icons.hearing-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HearingRounded" :default HearingRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hearing-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HearingRounded)))