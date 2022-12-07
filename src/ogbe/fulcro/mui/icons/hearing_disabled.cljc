(ns ogbe.fulcro.mui.icons.hearing-disabled
  #?(:cljs (:require
            ["@mui/icons-material/HearingDisabled" :default HearingDisabled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hearing-disabled
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HearingDisabled)))