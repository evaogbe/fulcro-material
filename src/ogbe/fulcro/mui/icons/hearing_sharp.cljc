(ns ogbe.fulcro.mui.icons.hearing-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HearingSharp" :default HearingSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hearing-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HearingSharp)))